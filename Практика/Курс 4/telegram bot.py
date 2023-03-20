#Налаштування логування:

logging.basicConfig(format='%(asctime)s - %(name)s - %(levelname)s - %(message)s', level=logging.INFO)

#Отримання Токену від BotFather
TOKEN = ‘Токен’


# ID групи, в яку будуть пересилатись повідомлення
GROUP_ID = ‘ID групи’

# Функція-обробник команди /start
def start(update, context):
    context.bot.send_message(chat_id=update.message.chat_id, text='Привіт! Я бот, який пересилає повідомлення в іншу групу.')

# Функція-обробник повідомлень
def echo(update, context):
    message = update.message.text
    context.bot.send_message(chat_id=GROUP_ID, text=message)

# Функція, яка буде викликана при виникненні помилки
def error(update, context):
    logging.warning('Update "%s" caused error "%s"', update, context.error)

# Створення екземпляру клієнта телеграм бота
updater = Updater(token=TOKEN, use_context=True)

# Створення диспетчера команд
dispatcher = updater.dispatcher

# Реєстрація функцій-обробників команд та повідомлень
dispatcher.add_handler(CommandHandler('start', start))
dispatcher.add_handler(MessageHandler(Filters.text & ~Filters.command, echo))
dispatcher.add_error_handler(error)

# Запуск бота
updater.start_polling()

# Зупинка бота при натисканні клавіш Ctrl + C
updater.idle()
