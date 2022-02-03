package com.example.shayariapp.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shayariapp.Application.Adapterr;
import com.example.shayariapp.Application.Model;
import com.example.shayariapp.MainActivity;
import com.example.shayariapp.R;

import java.util.ArrayList;

public class jokes extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghamndi);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.myShayriRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Model> arrayList = new ArrayList<>();
        arrayList.add(new Model("\"किसी का हाथ थाम के छोड़ना नहीं,\\n\" +\n" +
                "                \"वादा किसी से कर के तोड़ना नहीं,\\n\" +\n" +
                "                \"कोई अगर तोड़ दे दिल आपका तो,\\n\" +\n" +
                "                \"बिना हाथ पैर तोड़े उसे छोड़ना नहीं।\", "));
        arrayList.add(new Model("\"अर्ज किया है...\\n\" +\n" +
                "                        \"वो तुम्हें Dp दिखाकर गुमराह करेगी,\\n\" +\n" +
                "                        \"मगर तुम आधार कार्ड पर अड़े रहना।\", "));


        arrayList.add(new Model(" \"तुम्हारी शायरी बड़ी है फाइरी,\\n\" +\n" +
                "                        \"तुम्हारी शायरी बड़ी है फाइरी,\\n\" +\n" +
                "                        \"दिल करता है जल जाये\\n\" +\n" +
                "                        \"तुम्हारी शायरी वाली डायरी।\","));

        arrayList.add(new Model("\"मेरी प्रेम कहानी का क्या अजीब एंडिंग था,\\n\" +\n" +
                "                        \"मेरी प्रेम कहानी का क्या अजीब एंडिंग था,\\n\" +\n" +
                "                        \"मैंने प्रोपोज़ किआ SMS से,\\n\" +\n" +
                "                        \"कमबख्त वह उसकी शादी तक पेंडिंग था।\", "));

        arrayList.add(new Model("\"ताजमहल किसी के लिए एक अजूबा है,\\n\" +\n" +
                "                        \"तो किसी के लिए प्यार का एहसास है,\\n\" +\n" +
                "                        \"हमारे तुम्हारे लिए तो बकवास है,\\n\" +\n" +
                "                        \"क्यूँ की की रोज़ बदलती हमारी मुम्ताज़ है।\", "));


        arrayList.add(new Model(" \"अजब सी हालत है तेरे जाने के बाद,\\n\" +\n" +
                "                        \"मुझे भूख लगती नहीं खाना खाने के बाद,\\n\" +\n" +
                "                        \"मेरे पास दो ही समोसे थे जो मैंने खा लिए,\\n\" +\n" +
                "                        \"एक तेरे आने से पहले, एक तेरे जाने के बाद।\","));

        arrayList.add(new Model("\"ए गुलाब अपनी खुशबू को\\n\" +\n" +
                "                        \"मेरे दोस्तों पर न्योछावर कर दे,\\n\" +\n" +
                "                        \"यह सर्दी के मौसम में\\n\" +\n" +
                "                        \"अक्सर नहाया नहीं करते।\", "));

        arrayList.add(new Model("\"देखा है तुम्हारे आगे,\\n\" +\n" +
                "                        \"शर्मा के फूलों को मुरझाते,\\n\" +\n" +
                "                        \"ए जहाँ को घायल करने वाले\\n\" +\n" +
                "                        \"तुम डिओडोरेंट क्यों नहीं लगाते।\", "));

        arrayList.add(new Model(" \"आज कुछ शर्माए से लगते हो,\\n\" +\n" +
                "                        \"सर्दी के कारण कपकपए से लगते हो,\\n\" +\n" +
                "                        \"चेहरा आपका खिलखिलाये सा लगता है,\\n\" +\n" +
                "                        \"हफ्ते के बाद नहाए से लगते हो।\","));

        arrayList.add(new Model(" \"खुद का बच्चा रोये तो दिल में दर्द होता है,\\n\" +\n" +
                "                        \"किसी और का रोये तो सर में दर्द होता है,\\n\" +\n" +
                "                        \"खुद की बीवी रोये तो भी सर में दर्द होता है,\\n\" +\n" +
                "                        \"किसी और की रोये तो दिल में दर्द होता है।\","));

        arrayList.add(new Model("\"जब हम उनके घर गए...\\n\" +\n" +
                "                        \"कहने दिल से दिल लगा लो,\\n\" +\n" +
                "                        \"उनकी माँ ने खोला दरवाजा,\\n\" +\n" +
                "                        \"हम घवरा के बोले..\\n\" +\n" +
                "                        \"आंटी बच्चो को पोलियो ड्राप पिलवा लो।\", "));

        arrayList.add(new Model("\"इश्क के चर्चे बहुत हैं दोस्तों,\\n\" +\n" +
                "                        \"हुस्न के पर्चे बहुत है यारों,\\n\" +\n" +
                "                        \"इश्क करने से पहले जान लेना,\\n\" +\n" +
                "                        \"इसमें खर्चे बहुत है दोस्तो।\", "));

        arrayList.add(new Model("\"कुछ बोलूं तो इतराते बहुत हो,\\n\" +\n" +
                "                        \"जानेमन तुम मुस्कुराते बहुत हो,\\n\" +\n" +
                "                        \"मन करता है तुम्हे दावत पर बुलाऊँ,\\n\" +\n" +
                "                        \"लेकिन जानेमन तुम खाते बहुत हो।\", "));

        arrayList.add(new Model("\"जब तिरछी नजरों से उन्होंने हमको देखा,\\n\" +\n" +
                "                        \"तो हम मदहोश हो गए\\n\" +\n" +
                "                        \"जब पता लगा उनकी नज़रें ही तिरछी हैं\\n\" +\n" +
                "                        \"तो हम बेहोश हो गए।\", "));

        arrayList.add(new Model("\"नजर न लग जाये आँखों में काजल लगा लो,\\n\" +\n" +
                "                        \"हम कहते हैं आँखों में काजल ही नहीं,\\n\" +\n" +
                "                        \"हो सके तो...\\n\" +\n" +
                "                        \"गले में नीबू मिर्ची चप्पल भी लटका लो,\", "));

        arrayList.add(new Model("\"मीठी मीठी यादों को पलकों पे सजा लेना,\\n\" +\n" +
                "                        \"साथ गुज़रे लम्हों को दिल में बसा लेना,\\n\" +\n" +
                "                        \"मैं तो बरसों का प्यासा हूँ, 'फराज़',\\n\" +\n" +
                "                        \"बिजली आ जाये तो याद से मोटर चला देना।\", "));

        arrayList.add(new Model("\"मेरी ख़ुशी के लम्हे इस कदर\\n\" +\n" +
                "                        \"मुख़्तसर हैं फ़राज़,\\n\" +\n" +
                "                        \"अभी मुजरा शुरू ही हुआ था\\n\" +\n" +
                "                        \"के छापा पड़ गया।\", "));

        arrayList.add(new Model("\"मासूम सी मुहब्बत का फ़राज़\\n\" +\n" +
                "                        \"बस इतना सा फ़साना है..\\n\" +\n" +
                "                        \"अम्मी घर से निकलने नहीं देती\\n\" +\n" +
                "                        \"और मुझी डेट पर जाना है।\", "));

        arrayList.add(new Model("\"मोहब्बत करते हैं लोग बड़े शोर के साथ,\\n\" +\n" +
                "                        \"हमने भी बड़े जोर के साथ,\\n\" +\n" +
                "                        \"लेकिन अब करेंगे थोड़ा गौर के साथ,\\n\" +\n" +
                "                        \"क्योंकि कल उसे देखा है किसी और के साथ।\", "));

        arrayList.add(new Model("\"दोस्तो हम उन्हें मुड़ मुड़कर देखते रहे,\\n\" +\n" +
                "                        \"और वो हमें मुड़-मुड़ कर देखते रहे,\\n\" +\n" +
                "                        \"वो हमें हम उन्हें, वो हमें हम उन्हें,\\n\" +\n" +
                "                        \"क्योंकि परीक्षा में न उन्हें कुछ आता था न हमे।\", "));

        arrayList.add(new Model("\"जब दरवाजा खोलने गये तो चेहरे पर हसी थी,\\n\" +\n" +
                "                        \"दरवाजा खोला तो आँखों में आँसू दिल में बेबसी थी,\\n\" +\n" +
                "                        \"ज्यादा मत सोच पगले,\\n\" +\n" +
                "                        \"मेरी ऊँगली दरवाजे में फंसी थी,\", "));


        arrayList.add(new Model("\"इस दुनिया में लाखों लोग रहते हैं,\\n\" +\n" +
                "                        \"कोई हँसता है तो कोई रोता है,\\n\" +\n" +
                "                        \"पर सबसे सुखी वही होता है,\\n\" +\n" +
                "                        \"जो शाम को दो पैग मार के सोता है।\", "));


        arrayList.add(new Model("\"न वफ़ा का ज़िक्र होगा,\\n\" +\n" +
                "                        \"न वफ़ा की बात होगी,\\n\" +\n" +
                "                        \"अब मोहब्बत जिस से भी होगी,\\n\" +\n" +
                "                        \"राखी के बाद होगी।\", "));

        arrayList.add(new Model("\"अर्ज किया है…\\n\" +\n" +
                "                        \"तेरे चेहरे पर उदासी, आँखों में नमी है,\\n\" +\n" +
                "                        \"तेरे चेहरे पर उदासी, आँखों में नमी है,\\n\" +\n" +
                "                        \"टाटा नमक इस्तेमाल करो,\\n\" +\n" +
                "                        \"क्योंकि तुम में आयोडीन की कमी है।\", "));

        arrayList.add(new Model("\"ज़िन्दगी में सदा मुस्कराते रहो,\\n\" +\n" +
                "                        \"फासले कम करो दिल से दिल मिलाते रहो,\\n\" +\n" +
                "                        \"दर्द कैसा भी हो कोई ग़म न करो,\\n\" +\n" +
                "                        \"आयोडेक्स खरीदो और लगाते रहो।\", "));

        arrayList.add(new Model("\"कदम -कदम पर हवा की आहट का ध्यान रखना,\\n\" +\n" +
                "                        \"मुश्किल समय में भी इस दोस्त को याद रखना,\\n\" +\n" +
                "                        \"हमारी यादों की खुशबू जरूर आएगी,\\n\" +\n" +
                "                        \"तुम बस अपनी नाक साफ़ रखना।\\n\", "));

        arrayList.add(new Model(" \"ए खूबसूरत हसीना,\\n\" +\n" +
                "                        \"तू सिर्फ सवाल नहीं एक पहेली है,\\n\" +\n" +
                "                        \"और जिसपे हम लाइन मारते हैं,\\n\" +\n" +
                "                        \"वो तू नहीं तेरी सहेली है।\","));

        arrayList.add(new Model("\"मेरी गैरत को क्या ललकारेगा जमाना,\\n\" +\n" +
                "                        \"A फॉर Apple B फॉर Banana।\", "));

        arrayList.add(new Model(" \"दोस्तो हम उन्हें मुड़ मुड़कर देखते रहे,\\n\" +\n" +
                "                        \"और वो हमें मुड़-मुड़ कर देखते रहे,\\n\" +\n" +
                "                        \"वो हमें हम उन्हें, वो हमें हम उन्हें,\\n\" +\n" +
                "                        \"क्योंकि परीक्षा में न उन्हें कुछ आता था न हमे।\","));

        arrayList.add(new Model("\"तेरे ग़म में तड़प कर मर जायेंगे,\\n\" +\n" +
                "                        \"मर गए तो तेरा नाम ले जायेंगे,\\n\" +\n" +
                "                        \"रिश्वत देकर तुझे भी बुलायेंगे,\\n\" +\n" +
                "                        \"तुम ऊपर आओगे तो साथ बैठकर कुरकुरे खायेंगे।\", "));

        arrayList.add(new Model("\"अर्ज किया है…\\n\" +\n" +
                "                        \"खिड़की से झाँक के देखा तो रास्ते में कोई नहीं था,\\n\" +\n" +
                "                        \"खिड़की से झाँक के देखा तो रास्ते में कोई नहीं था,\\n\" +\n" +
                "                        \"वाह वाह… फिर रास्ते में जा कर देखा…\\n\" +\n" +
                "                        \"तो खिड़की पर कोई नहीं था।\", "));

        arrayList.add(new Model("\"दोस्ती बुरी हो तो होने उसे मत दो,\\n\" +\n" +
                "                        \"अगर हो गयी तो उसे खोने मत दो,\\n\" +\n" +
                "                        \"और अगर दोस्त हो सबसे प्यारा तो,\\n\" +\n" +
                "                        \"उसे चैन की नींद सोने मत दो।\", "));

        arrayList.add(new Model("\"रंग और नूर से भरी शाम हो आपकी,\\n\" +\n" +
                "                        \"चाँद सितारों से ज्यादा शान हो आपकी,\\n\" +\n" +
                "                        \"इस ज़िन्दगी में बस एक ही आरजू है हमारी,\\n\" +\n" +
                "                        \"कि बंदर से ऊँची छलांग हो आपकी।\", "));

        arrayList.add(new Model("\"इश्क को सर का दर्द कहने वाले सुन,\\n\" +\n" +
                "                        \"हमने तो ये दर्द अपने सर ले लिया,\\n\" +\n" +
                "                        \"हमारी निगाहों से बचकर वो कहाँ जायेंगे,\\n\" +\n" +
                "                        \"हमने उनके मोहल्ले में ही घर ले लिया।\", "));

        arrayList.add(new Model(" \"सितारों में आप, हवाओ में आप,\\n\" +\n" +
                "                        \"फिज़ाओ में आप, बहरो में आप,\\n\" +\n" +
                "                        \"धूप में आप, चाओं में आप,\\n\" +\n" +
                "                        \"सच ही सुना है कि….\\n\" +\n" +
                "                        \"बुरी आत्माओं का कोई ठिकाना नहीं होता।\","));

        arrayList.add(new Model("मीठी मीठी यादों को पलकों पे सजा लेना,\n" +
                "साथ गुज़रे लम्हों को दिल में बसा लेना,\n" +
                "मैं तो बरसों का प्यासा हूँ, ‘फराज़’,\n" +
                "बिजली आ जाये तो याद से मोटर चला देना।"));


        arrayList.add(new Model("प्यार-मोहब्बत की बस इतनी सी कहानी है,\n" +
                "इक टूटी हुई कश्ती और ठहरा हुआ पानी है,\n" +
                "इक फूल जो किताबों में कहीं दम तोड़ चुका है,\n" +
                "कुछ याद नहीं आता किसकी निशानी है।"));

        arrayList.add(new Model("वो दिन दिन नही, वो रात रात नही,\n" +
                "वो पल पल नही, जिस पल आपकी बात नही,\n" +
                "आपकी यादों से मौत हमे अलग कर सके,\n" +
                "मौत की भी इतनी औकात नही।"));

        arrayList.add(new Model("जब तिरछी नजरों से उन्होंने हमको देखा,\n" +
                "तो हम मदहोश हो गए\n" +
                "जब पता लगा उनकी नज़रें ही तिरछी हैं\n" +
                "तो हम बेहोश हो गए।"));

        arrayList.add(new Model("शादी करनी थी पर किस्मत खुलती नहीं,\n" +
                "ताज बनाना था पर मुमताज मिलती नहीं,\n" +
                "एक दिन किस्मत खुली और शादी हो गई,\n" +
                "अब ताज बनाना है पर मुमताज मरती नहीं।"));

        arrayList.add(new Model(" जितने भी लड़के लगाते हैं\\n\" +\n" +
                "                        \"तेरी गली की गेरियां,\\n\" +\n" +
                "                        \"मुहं पर थूक जाएँ अगर देख ले\\n\" +\n" +
                "                        \"तेरी फटी हुई एड़ियाँ।"));

        arrayList.add(new Model(" मेरी ख़ुशी के लम्हे इस कदर\\n\" +\n" +
                "                        \"मुख़्तसर हैं फ़राज़,\\n\" +\n" +
                "                        \"अभी मुजरा शुरू ही हुआ था\\n\" +\n" +
                "                        \"के छापा पड़ गया।"));

        arrayList.add(new Model("रख ले 2-4 बोतल कफ़न में,\\n\" +\n" +
                "                        \"साथ बैठ कर पिया करेंगे,\\n\" +\n" +
                "                        \"जब मांगे गए हिसाब गुनाहों का,\\n\" +\n" +
                "                        \"एक पेग उससे भी दे दिया करेंगे। "));

        arrayList.add(new Model("छलकते पैमाने ने मेरे अश्को से कहा,\\n\" +\n" +
                "                        \"छलकते पैमाने ने मेरे अश्को से कहा,\\n\" +\n" +
                "                        \"आई हेट टीयर्स पुष्पा आई हेट टीयर्स। "));

        arrayList.add(new Model("नजर न लग जाये आँखों में काजल लगा लो,\\n\" +\n" +
                "                        \"हम कहते हैं आँखों में काजल ही नहीं,\\n\" +\n" +
                "                        \"हो सके तो…\\nगले में नीबू मिर्ची चप्पल भी लटका लो "));

        arrayList.add(new Model("जवानी के दिन चमकीले हो गए,\\n\" +\n" +
                "                        \"हुस्न के तेवर भी नुकीले हो गए,\\n\" +\n" +
                "                        \"हम इंतज़ार करने में रह गए यारो,\\n\" +\n" +
                "                        \"और उधर उनके हाथ पीले हो गए। "));

        arrayList.add(new Model("जब होता है तुम्हारा दीदार,\\n\" +\n" +
                "                        \"दिल धड़कता है बार-बार,\\n\" +\n" +
                "                        \"आदत से मजबूर हो तुम,\\n\" +\n" +
                "                        \"न जाने कब मांग लो उधार। "));

        arrayList.add(new Model("फ़िज़ाओं के बदलने का इंतजार मत कर,\\n\" +\n" +
                "                        \"आँधियों के रुकने का इंतजार मत कर,\\n\" +\n" +
                "                        \"पकड़ किसी को और फरार हो जा,\\n\" +\n" +
                "                        \"पापा की पसंद का इंतजार मत कर। "));

        arrayList.add(new Model("आज-कल तुम मुस्कुराती बहुत हो,\\n\" +\n" +
                "                        \"मेरे दिल को भाती बहुत हो,\\n\" +\n" +
                "                        \"दिल करता है ले जाऊँ तुम्हे डिनर पर,\\n\" +\n" +
                "                        \"पर सुना है तुम खाती बहुत हो। "));

        arrayList.add(new Model(" काला न कहो मेरे महबूब को,\\n\" +\n" +
                "                        \"काला न कहो मेरे महबूब को,\\n\" +\n" +
                "                        \"खुदा तो तिल ही बना रहा था,\\n\" +\n" +
                "                        \"स्याही का प्याला लुढ़क गया।"));

        arrayList.add(new Model("अर्ज किया है…\\n\" +\n" +
                "                        \"हटा लो अपने चेहरे से ये जुल्फे\\n\" +\n" +
                "                        \"ऐ जाने तमन्ना…. खुदा कसम…\\n\" +\n" +
                "                        \"अगली बार खाने में बाल आया तो\\n\" +\n" +
                "                        \"सजनी से गजनी बना दूंगा। "));

        arrayList.add(new Model("कुछ बोलूं तो इतराते बहुत हो,\\n\" +\n" +
                "                        \"जानेमन तुम मुस्कुराते बहुत हो,\\n\" +\n" +
                "                        \"मन करता है तुम्हे दावत पर बुलाऊँ,\\n\" +\n" +
                "                        \"लेकिन जानेमन तुम खाते बहुत हो। "));

        arrayList.add(new Model("ये जो लड़कियों के बाल होते हैं,\\n\" +\n" +
                "                        \"लड़कों को फ़साने के जाल होते हैं,\\n\" +\n" +
                "                        \"खून चूस लेती हैं लड़कों का सारा,\\n\" +\n" +
                "                        \"तभी तो इनके होंठ लाल होते हैं। "));

        arrayList.add(new Model("मासूम सी मुहब्बत का फ़राज़\\n\" +\n" +
                "                        \"बस इतना सा फ़साना है..\\n\" +\n" +
                "                        \"अम्मी घर से निकलने नहीं देती\\n\" +\n" +
                "                        \"और मुझी डेट पर जाना है। "));

        arrayList.add(new Model("अजब सी हालत है तेरे जाने के बाद,\\n\" +\n" +
                "                        \"मुझे भूख लगती नहीं खाना खाने के बाद,\\n\" +\n" +
                "                        \"मेरे पास दो ही समोसे थे जो मैंने खा लिए,\\n\" +\n" +
                "                        \"एक तेरे आने से पहले, एक तेरे जाने के बाद। "));

        arrayList.add(new Model("आज तुम पे आँसुओं की बरसात होगी,\\n\" +\n" +
                "                        \"फिर वही कडकती काली रात होगी,\\n\" +\n" +
                "                        \"एस.एम.एस. न करके तूने जो दिल दुखाया मेरा,\\n\" +\n" +
                "                        \"जा तेरे बदन में खुजली सारी रात होगी। "));

        arrayList.add(new Model("अर्ज किया है-\\n\" +\n" +
                "                        \"तुम से नज़र मिलाते ही,\\n\" +\n" +
                "                        \"भड़क उठे मेरे दिल में,\\n\" +\n" +
                "                        \"मोहब्बत के शोले,\\n\" +\n" +
                "                        \"ओले ओले ओले, ओले ओले। "));

        arrayList.add(new Model("इश्क के चर्चे बहुत हैं दोस्तों,\\n\" +\n" +
                "                        \"हुस्न के पर्चे बहुत है यारों,\\n\" +\n" +
                "                        \"इश्क करने से पहले जान लेना,\\n\" +\n" +
                "                        \"इसमें खर्चे बहुत है दोस्तो। "));

        arrayList.add(new Model("उम्मीदों की शमा दिल में मत जलाना,\\n\" +\n" +
                "                        \"इस जहां से अलग दुनिया मत बसाना,\\n\" +\n" +
                "                        \"आज बस मूड में था तो मैसेज कर दिया,\\n\" +\n" +
                "                        \"पर रोज इंतज़ार में पलके मत बिछाना। "));

        arrayList.add(new Model("याद रख कर मेरी दोस्ती को तुमने,\\n\" +\n" +
                "                        \"मेरी जिंदगी पर एहसान कर दिया,\\n\" +\n" +
                "                        \"मेरे मोबाइल में ये आखिरी रुपया था,\\n\" +\n" +
                "                        \"ले वो भी तेरे नाम कर दिया। "));

        arrayList.add(new Model("क्यों बरसों से जुदाई का गम\\n\" +\n" +
                "                        \"लैला और हीर सह रही हैं,\\n\" +\n" +
                "                        \"जरा अपना रुमाल तो देना\\n\" +\n" +
                "                        \"मेरी नाक बह रही है। "));

        arrayList.add(new Model("हमने धूप समझी वो छाया निकली,\\n\" +\n" +
                "                        \"हमने गाय समझी वो भैंस निकली।\\n\" +\n" +
                "                        \"बेडा गर्क हो इन ब्यूटी पार्लरों का,\\n\" +\n" +
                "                        \"हमने तो उसे लडकी समझा था,\\n\" +\n" +
                "                        \"लेकिन वो तो लड़की की माँ निकली। "));

        arrayList.add(new Model("अपनी सूरत का कभी तो दीदार दे,\\n\" +\n" +
                "                        \"तड़प रहा हूँ अब और न इंतज़ार दे,\\n\" +\n" +
                "                        \"अपनी आवाज नहीं सुनानी तो मत सुना,\\n\" +\n" +
                "                        \"कम से कम एक मिस काल ही मार दे। "));

        arrayList.add(new Model("जब हम उनके घर गए…\\n\" +\n" +
                "                        \"कहने दिल से दिल लगा लो,\\n\" +\n" +
                "                        \"उनकी माँ ने खोला दरवाजा,\\n\" +\n" +
                "                        \"हम घवरा के बोले..\\n\" +\n" +
                "                        \"आंटी बच्चो को पोलियो ड्राप पिलवा लो। "));

        arrayList.add(new Model(" वो बेवफा होती तो यारों बात और थी,\\n\" +\n" +
                "                        \"उसकी वफ़ा से ही दिल में जखम है,\\n\" +\n" +
                "                        \"हर दूसरे दिन उसका मैसेज आ जाता है,\\n\" +\n" +
                "                        \"मोबाइल रिचार्ज करा दो बैलेंस ख़त्म है।"));

        arrayList.add(new Model("पहली नजर में लगा वो मेरी है,\\n\" +\n" +
                "                        \"आँखें उसकी झील सी गहरी हैं,\\n\" +\n" +
                "                        \"प्रोपोज़ कर कर के थक गए हम,\\n\" +\n" +
                "                        \"अब पता चला वो तो बहरी है। "));

        arrayList.add(new Model("मेरे प्यार को बेवफाई का इनाम दे गई,\\n\" +\n" +
                "                        \"मेरे दिल को अपनी यादों का पैगाम दे गई,\\n\" +\n" +
                "                        \"मैंने कहा मेरे दिल में दर्द है तेरे बिना,\\n\" +\n" +
                "                        \"तो वो जाते-जाते \\\"झंडूबाम\\\" दे गई। "));

        arrayList.add(new Model("धोखा मिला जब प्यार में हमे,\\n\" +\n" +
                "                        \"ज़िन्दगी में उदासी छा गयी,\\n\" +\n" +
                "                        \"सोचा था छोड़ देंगे प्यार करना,\\n\" +\n" +
                "                        \"पर आज मोहल्ले में दूसरी आ गयी। "));

        arrayList.add(new Model("काश प्यार का इन्स्योरेंसे करवाया जाता,\\n\" +\n" +
                "                        \"प्यार करने से पहले प्रीमियम भरवाया जाता,\\n\" +\n" +
                "                        \"अगर प्यार में वफ़ा मिली तो ठीक वरना,\\n\" +\n" +
                "                        \"जो खर्चा होता उसका क्लेम दिलवाया जाता। "));

        arrayList.add(new Model("एक बूँद से सागर नहीं बनता,\\n\" +\n" +
                "                        \"रोने से मुक़द्दर नहीं बनता,\\n\" +\n" +
                "                        \"पटाना है तो पूरा गर्ल्स हॉस्टल पटाओ,\\n\" +\n" +
                "                        \"एक लड़की पटाके कोई सिकंदर नहीं बनता। "));

        arrayList.add(new Model("उम्मीदों की मंजिल टूट गयी,\\n\" +\n" +
                "                        \"आँखों से अश्को की धारा बह गयी,\\n\" +\n" +
                "                        \"अरे तुम्हरी भी क्या इज्ज़त रह गयी,\\n\" +\n" +
                "                        \"जब क्लास में लड़की भैया कह गयी। "));

        arrayList.add(new Model("अर्ज़ किया है…\\n\" +\n" +
                "                        \"बेइज़्ज़ती और बीवी अजीब चीज़ होती है,\\n\" +\n" +
                "                        \"गौर फरमाइएगा…\\n\" +\n" +
                "                        \"बेइज़्ज़ती और बीवी अजीब चीज़ होती है,\\n\" +\n" +
                "                        \"अच्छी तभी लगती है जब दूसरे की होती है। "));

        arrayList.add(new Model("मुक़द्दर में रात को नींद नहीं तो क्या,\\n\" +\n" +
                "                        \"मुक़द्दर में रात को नींद नहीं तो क्या,\\n\" +\n" +
                "                        \"हम भी मुक़द्दर को चूना लगाते हैं,\\n\" +\n" +
                "                        \"और दिन में ही सो जाते हैं। "));

        arrayList.add(new Model("तेरी दुनिया में कोई गम न हो,\\n\" +\n" +
                "                        \"तेरी खुशियाँ कभी कम न हों,\\n\" +\n" +
                "                        \"भगवान तुझे ऐसी आइटम दे,\\n\" +\n" +
                "                        \"जो सनी लिओने से कम न हो। "));

        arrayList.add(new Model("धोखा मिला जब प्यार में हमें,\\n\" +\n" +
                "                        \"ज़िंदगी में उदासी छा गयी,\\n\" +\n" +
                "                        \"सोचा था छोड़ देंगे प्यार करना,\\n\" +\n" +
                "                        \"पर आज मोहल्ले में दूसरी आ गयी। "));

        arrayList.add(new Model("धड़कन दिल की रुक जाती है,\\n\" +\n" +
                "                        \"साँसें भी अक्सर थम जाती है,\\n\" +\n" +
                "                        \"बहुत बुरी हालत होती है यारो,\\n\" +\n" +
                "                        \"जब गर्लफ्रेंड से शादी की नौबत आती है। "));

        arrayList.add(new Model("तेरी दुनिया में कोई गम ना हो,\\n\" +\n" +
                "                        \"तेरी खुशियाँ कभी कम न हो,\\n\" +\n" +
                "                        \"भगवान तुझे ऐसी आइटम दे,\\n\" +\n" +
                "                        \"जो सनी लिओनी से कम ना हो।"));

        arrayList.add(new Model("उम्मीदों की मंजिल ढह गयी,\\n\" +\n" +
                "                        \"ख्वाबों की दुनिया बह गयी,\\n\" +\n" +
                "                        \"अबे तेरी क्या इज्ज़त रह गयी,\\n\" +\n" +
                "                        \"जब झक्कास आइटम तेरे को भैया कह गयी। "));

        arrayList.add(new Model("मेरे दोस्त तुम भी लिखा करो शायरी,\\n\" +\n" +
                "                        \"तुम्हारा भी मेरी तरह नाम हो जाएगा,\\n\" +\n" +
                "                        \"जब तुम पर भी पड़ेंगे अंडे और टमाटर,\\n\" +\n" +
                "                        \"तो शाम की सब्जी का इंतज़ाम हो जाएगा। "));

        arrayList.add(new Model(" ख्याल को किसी आहट की आस रहती है,\\n\" +\n" +
                "                        \"निगाह को किसी सूरत की तलास रहती है,\\n\" +\n" +
                "                        \"तेरे बिन कोई कमी तो नहीं है, दोस्त,\\n\" +\n" +
                "                        \"बस गली वाली जमादारनी उदास रहती है।"));

        arrayList.add(new Model("आसमान में काली घटा छाई है,\\n\" +\n" +
                "                        \"आज फिर तूने गर्लफ्रेंड से मार खाई है,\\n\" +\n" +
                "                        \"मगर इसमें तेरी गलती नहीं है दोस्त,\\n\" +\n" +
                "                        \"तू शकल से लगता कालू हलवाई है।\" "));

        arrayList.add(new Model("जब सफेद साड़ी पे लाल बिंदी लगाती हो,\\n\" +\n" +
                "                        \"कसम से एम्बुलेंस नजर आती हो,\\n\" +\n" +
                "                        \"वो तो घायलों को लेकर जाती है,\\n\" +\n" +
                "                        \"और तुम घायल कर के जाती हो। "));

        arrayList.add(new Model("ना जाने वो हमसे क्या छुपाती थी,\\n\" +\n" +
                "                        \"कुछ था जरुर उसके प्यारे से होंठो पे,\\n\" +\n" +
                "                        \"मगर ना जाने क्यों हमसे शर्माती थी,\\n\" +\n" +
                "                        \"जब मुह खुलबाया तब जाकर मालूम हुआ,\\n\" +\n" +
                "                        \"साली चुप-चाप पान मसाला चबाती थी। "));

        arrayList.add(new Model("फूलों में गुलाब अच्छा लगता है,\\n\" +\n" +
                "                        \"हर चेहरे पर शबाब अच्छा लगता है,\\n\" +\n" +
                "                        \"आप जब नाक से चूहे निकालते हो,\\n\" +\n" +
                "                        \"हमें आपका वो अंदाज़ अच्छा लगता है। "));

        arrayList.add(new Model("मेरी हँसी का हिसाब कौन करेगा?\\n\" +\n" +
                "                        \"मेरी गलती को माफ़ कौन करेगा?\\n\" +\n" +
                "                        \"ऐ-खुदा, मेरे दोस्त को सलामत रखना,\\n\" +\n" +
                "                        \"वरना मेरी शादी पे “लुंगी डांस” कौन करेगा "));

        arrayList.add(new Model("जुल्फों में फूलों को सजा के आयी,\\n\" +\n" +
                "                        \"चेहरे से दुपट्टा उठा के आयी,\\n\" +\n" +
                "                        \"किसी ने पूछा आज बड़ी खुबसूरत लग रही है,\\n\" +\n" +
                "                        \"हमने कहा शायद आज नहा के आयी। "));

        arrayList.add(new Model("सफ़र लम्बा है दोस्त बनाते रहिये,\\n\" +\n" +
                "                        \"दिल मिले ना मिले हाथ बढ़ाते रहिये,\\n\" +\n" +
                "                        \"ताजमहल न बनाईये महंगा पड़ेगा,\\n\" +\n" +
                "                        \"मगर हर तरफ मुमताज़ बनाते रहिये। "));

        arrayList.add(new Model("तुम सा कोई दूसरा जमीन पर हुआ,\\n\" +\n" +
                "                        \"तो रब से शिकायत होगी,\\n\" +\n" +
                "                        \"एक को तो झेला नहीं जाता,\\n\" +\n" +
                "                        \"दूसरा आ गया तो क्या हालत होगी। "));

        arrayList.add(new Model("असमान में काली घटा छाई है,\\n\" +\n" +
                "                        \"आज फिर तूने गर्लफ्रेंड से मार खाई है,\\n\" +\n" +
                "                        \"मगर इसमें तेरी गलती नहीं है दोस्त,\\n\" +\n" +
                "                        \"तू सकल लगता कालू हलवाई है। "));

        arrayList.add(new Model("खुद का बच्चा रोये तो दिल में दर्द होता है,\\n\" +\n" +
                "                        \"किसी और का रोये तो सर में दर्द होता है,\\n\" +\n" +
                "                        \"खुद की बीवी रोये तो भी सर में दर्द होता है,\\n\" +\n" +
                "                        \"किसी और की रोये तो दिल में दर्द होता है। "));

        arrayList.add(new Model("दोस्ती को बड़े प्यार से निभाएंगे,\\n\" +\n" +
                "                        \"कोशिश रहेगी तुझे न सतायेंगे,\\n\" +\n" +
                "                        \"कभी पसंद न आये मेरा साथ तो बता देना,\\n\" +\n" +
                "                        \"गिन भी न पाओगे इतने “थप्पड़” लगाएंगे। "));

        arrayList.add(new Model("िल का दर्द दिल तोड़ने वाला क्या जाने,\\n\" +\n" +
                "                        \"प्यार के रिवाजों को ये ज़माना क्या जाने,\\n\" +\n" +
                "                        \"होती है कितनी तकलीफ लड़की पटाने में,\\n\" +\n" +
                "                        \"ये घर बैठा उसका बाप क्या जाने। "));

        arrayList.add(new Model("दिल में आंसुओं के मेले हैं,\\n\" +\n" +
                "                        \"तुम बिन हम बहुत अकेले हैं,\\n\" +\n" +
                "                        \"सब कुछ छोड़कर एसएमएस करते हैं,\\n\" +\n" +
                "                        \"देखो हम कितने वेल्ले हैं। "));

        arrayList.add(new Model("मोहब्बत कर ली तुमसे बहुत सोचने के बाद,\\n\" +\n" +
                "                        \"अब किसी को देखना नहीं तुम्हे देखने के बाद,\\n\" +\n" +
                "                        \"दुनिया छोड़ देंगे तुम्हे पाने के बाद,\\n\" +\n" +
                "                        \"खुदा माफ़ करे इतना झूट बुलवाने के बाद। "));

        arrayList.add(new Model("जब होता है तुम्हारा दीदार,\\n\" +\n" +
                "                        \"दिल धड़कता है बार-बार,\\n\" +\n" +
                "                        \"आदत से मजबूर हो तुम,\\n\" +\n" +
                "                        \"ना जाने कब माँग लो उधार। "));

        arrayList.add(new Model("ताजमहल किसी के लिए एक अजूबा है,\\n\" +\n" +
                "                        \"तो किसी के लिए प्यार का एहसास है,\\n\" +\n" +
                "                        \"हमारे तुम्हारे लिए तो बकवास है,\\n\" +\n" +
                "                        \"क्यूँ की की रोज़ बदलती हमारी मुम्ताज़ है। "));

        arrayList.add(new Model("हमेशा ज़िन्दगी में मुस्कुराते रहो,\\n\" +\n" +
                "                        \"हर इंसान को अपना बनाते रहो,\\n\" +\n" +
                "                        \"जब तक कोई कार वाली ना बने तुम्हारी गर्लफ्रेंड,\\n\" +\n" +
                "                        \"तब तक स्कूटर वाली से ही काम चलाते रहो। "));

        arrayList.add(new Model("उधर आप मजबूर बैठे हैं,\\n\" +\n" +
                "                        \"इधर हम खामोश बैठे है,\\n\" +\n" +
                "                        \"बात हो तो कैसे हो,\\n\" +\n" +
                "                        \"जब दोनों तरफ दो कंजूस बैठे हैं। "));

        arrayList.add(new Model("हंसी के लिए गम कुर्बान,\\n\" +\n" +
                "                        \"ख़ुशी के लिए आंसू कुर्बान,\\n\" +\n" +
                "                        \"दोस्त के लिए जान भी कुर्बान,\\n\" +\n" +
                "                        \"और अगर\\n\" +\n" +
                "                        \"दोस्त की गर्लफ्रेंड मिल जाए तो,\\n\" +\n" +
                "                        \"साला दोस्त भी कुर्बान "));

        arrayList.add(new Model("खयाल को आहट की आस रहती है,\\n\" +\n" +
                "                        \"निगाह को किसी सूरत की तलाश रहती है,\\n\" +\n" +
                "                        \"तेरे बिन कोई कमी नहीं है ऐ दोस्त,\\n\" +\n" +
                "                        \"बस गली वाली जमादारनी उदास रहती है। "));

        arrayList.add(new Model("आँखों में आँसू चेहरे पर हँसी है,\\n\" +\n" +
                "                        \"साँसों में आहें दिल में बेबसी है,\\n\" +\n" +
                "                        \"पहले क्यों नहीं बताया यार कि,\\n\" +\n" +
                "                        \"दरवाज़े में ऊँगली फँसी है। "));

        arrayList.add(new Model("बाजुओं में दम रखता हूँ,\\n\" +\n" +
                "                        \"दिल में ग़म रखता हूँ,\\n\" +\n" +
                "                        \"पता था SMS आएगा तेरा,\\n\" +\n" +
                "                        \"इसलिए पेनकिलर संग रखता हूँ। "));

        arrayList.add(new Model("हर रात हम तुम्हें याद किया करते है,\\n\" +\n" +
                "                        \"सितारों में तुम्हें देखा करते है,\\n\" +\n" +
                "                        \"लेकिन हमारे ख्वाबों में मत आना तुम,\\n\" +\n" +
                "                        \"क्योंकि हम भूत से डरा करते है। "));

        arrayList.add(new Model("रामचंद्र कह गए सिया से,\\n\" +\n" +
                "                        \"ऐसा कलयुग आएगा,\\n\" +\n" +
                "                        \"एक दोस्त एक तरफ से SMS करेगा,\\n\" +\n" +
                "                        \"दूसरा अपना पैसा बचाएगा। "));

        arrayList.add(new Model("रामचंद्र कह गए सिया से,\\n\" +\n" +
                "                        \"ऐसा कलयुग आएगा,\\n\" +\n" +
                "                        \"एक दोस्त एक तरफ से SMS करेगा,\\n\" +\n" +
                "                        \"दूसरा अपना पैसा बचाएगा। "));

        arrayList.add(new Model("आप दिल पर न मेरे यूँ वार कीजिये,\\n\" +\n" +
                "                        \"छोड़ो ये नफरत थोड़ा प्यार कीजिये,\\n\" +\n" +
                "                        \"करवा देंगे हम आपकी अच्छी जगह शादी,\\n\" +\n" +
                "                        \"तब तक हमारे साथ आँखें चार कीजिये। "));

        recyclerView.setAdapter(new Adapterr(getApplicationContext(),arrayList));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }
}
