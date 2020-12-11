# TextToTextAndTextToSpeech
In this app build a application fro text to text and text to speech

<h1>For bangla text to speech :-</h1>

`
textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {

                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onInit(int i) {
                    if (i == TextToSpeech.SUCCESS) {
                        textToSpeech.setLanguage(Locale.forLanguageTag("bn_BD"));
                        textToSpeech.speak( banglaTexts, TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
            });
`

