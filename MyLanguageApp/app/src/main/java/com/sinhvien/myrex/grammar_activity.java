package com.sinhvien.myrex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class grammar_activity extends Activity {

    ExpandableListView expandableListView;
    List<String> listdataHeader;
    HashMap<String,List<String>> listdataChild;
    CustomExpandableListView customExpandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_grammar);
        addControl();
        customExpandableListView = new CustomExpandableListView(grammar_activity.this,listdataHeader,listdataChild);
        expandableListView.setAdapter(customExpandableListView);
    }

    private void addControl() {
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        listdataHeader = new ArrayList<>();
        listdataChild  = new HashMap<String, List<String>>();

        listdataHeader.add("12 TENSES");
        listdataHeader.add("PASSIVE VOICE");
        listdataHeader.add("CONDITIONAL SENTENCES");
        listdataHeader.add("WISHES");
        listdataHeader.add("TAG QUESTION");
        listdataHeader.add("COMPARISONS");

        List<String> tenses = new ArrayList<String>();
        tenses.add("Simple present tens\n" +
                "Công thức: S + V(s/es) + Object Cách dùng:\n" +
                "Diễn tả hành động xảy ra thường xuyên hoặc chân lý. \n" +
                "Ví dụ: I always drink coffee in the morning.\n");
        tenses.add("Present continuous\n"+
                "Công thức: S + to be + V-ing + Object \n" +
                "Cách dùng: Diễn tả hành động đang diễn ra tại thời điểm nói hoặc ở tương lai gần. \n" +
                "Ví dụ: She is studying for her exam right now.\n");
        tenses.add("Present perfect\n" +
                "Công thức: S + V2/Ved + Object \n" +
                "Cách dùng: Diễn tả hành động xảy ra ở quá khứ và đã kết thúc. \n" +
                "Ví dụ: They went to the beach last weekend.\n");
        tenses.add("Present perfect continuous");
        tenses.add("Simple past\n" + "Công thức: S + V2/Ved + Object \n" +
                "Cách dùng: Diễn tả hành động xảy ra ở quá khứ và đã kết thúc. \n" +
                "Ví dụ: They went to the beach last weekend.\n");
        tenses.add("Past continuous\n" +
                "Công thức: S + Was/Were + V-ing + Object \n" +
                "Cách dùng: Diễn tả hành động đang diễn ra trong quá khứ và đã bị gián đoạn bởi một hành động khác. \n" +
                "Ví dụ: I was reading a book when my friend called.\n");
        tenses.add("Past perfect\n" +
                "Công thức: S + had +3/Ved + Object \n" +
                "Cách dùng: Diễn tả hành động đã hoàn thành trước một hành động khác trong quá khứ. Ví dụ: She had finished her homework before she went to bed.\n" +
                "\n");
        tenses.add("Past perfect continuous\n" +
                "Công thức S + had + been + V-ing + Object Cách dùng: Diễn tả hành động đã bắt đầu và tiếp diễn trong quá khứ trước một hành động khác đã hoàn thành trong quá khứ. \n" +
                "Ví dụ: They had been waiting for two hours before the train arrived.\n");
        tenses.add("Simple future\n" +
                "Công thức: S + will/shall + V + Object \n" +
                "Cách dùng: Diễn tả hành động sẽ xảy ra trong tương lai.\n" +
                " Ví dụ: She will meet her friends at the cinema tonight.\n");
        tenses.add("Future continuous\n" +
                "Công thức: S + will/shall + be + V-ing + Object \n" +
                "Cách dùng: Diễn tả hành động sẽ đang diễn ra tại một thời điểm cụ thể trong tương lai. \n");
        tenses.add("Future perfect\n" +
                "");
        tenses.add("Future perfect continuous\n " + "Công thức: S + will/shall + have + been + V-ing + Object \n" +
                "Cách dùng: Diễn tả hành động sẽ bắt đầu và tiếp diễn trong quá khứ trước một thời điểm cụ thể trong tương lai. \n" +
                "Ví dụ: By the end of this month, they will have been working at the store.\n");

        List<String> passivevoice = new ArrayList<String>();
        passivevoice.add("Grammar structure: " +
                "S+Auxiliary Verb+Past Participle.\n" +
                "Ví dụ:\n" +
                "\tActive Voice: She ate the cake.\n" +
                "\tPassive Voice: The cake was eaten by her\n");
        passivevoice.add("Special cases: " +
                "Khi không cần biết người thực hiện hành động: \n" +
                "S + be (thì hiện tại hoặc quá khứ) + V3(P.P) \n" +
                "Ví dụ: The window was broken.\n" +
                "Khi chủ ngữ của câu là một đại từ không nhân tính:\n" +
                " It + be + V3(P.P) \n" +
                "Ví dụ: It is believed that the film will be a blockbuster.\n" +
                "Khi câu nói liên quan đến kinh nghiệm hoặc một sự kiện đã xảy ra: \n" +
                "S + be (thì quá khứ) + V3(P.P) \n" +
                "Ví dụ: I was mugged on my way home last night.\n" +
                "\n");

        List<String> conditional = new ArrayList<String>();
        conditional.add("Type 1" +
                "Nói về điều có thể xảy ra trong tương lai hoặc thói quen hiện tại:\n" +
                "Nếu (If) + động từ ở hiện tại đơn (present simple), thì (will/can/may/might + base verb) trong tương lai đơn hoặc mệnh lệnh.\n" +
                "Ví dụ:\n" +
                "•\tIf it rains, I will stay at home. (Nếu trời mưa, tôi sẽ ở nhà)\n" +
                "•\tIf I have time tomorrow, I will call you. (Nếu tôi rảnh ngày mai, tôi sẽ gọi cho bạn)\n");
        conditional.add("Type 2" +
                "Nói về điều không có khả năng xảy ra trong hiện tại hoặc tương lai, hoặc chỉ là hành động ảo.\n" +
                "Nếu (If) + động từ ở quá khứ đơn (past simple), thì (would/could + base verb) trong tương lai hoặc mệnh lệnh.\n" +
                "Ví dụ:\n" +
                "•\tIf I had a lot of money, I would travel around the world. (Nếu tôi có rất nhiều tiền, tôi sẽ đi du lịch khắp thế giới)\n" +
                "•\tIf you came with me, we could have more fun. (Nếu bạn đi cùng tôi, chúng ta có thể vui hơn nữa)\n");
        conditional.add("Type 3"+
                "Nói về một hành động không thực hiện trong quá khứ.\n" +
                "Nếu (If) + quá khứ hoàn thành (past perfect), thì (would/could/might have + past participle) để chỉ một hành động không thực hiện ở quá khứ nếu điều kiện đó đã được hoàn thành.\n" +
                "Ví dụ:\n" +
                "•\tIf I had studied harder, I would have passed the exam. (Nếu tôi học chăm hơn, tôi đã qua kỳ thi rồi)\n" +
                "•\tIf they had come to the party, they might have met each other. (Nếu họ đến tiệc, họ có thể gặp nhau)\n");

        List<String> wishes = new ArrayList<String>();
        wishes.add("Type 1" +
                "Wish + S + V2 (V-ed) + O: \n" +
                "Sử dụng để diễn tả sự tiếc nuối hoặc ước có một sự thay đổi trong hiện tại. \n" +
                "Ví dụ: I wish I had more time to study. (Tôi ước có nhiều thời gian hơn để học)\n");
        wishes.add("Type 2"+
                "Wish + S + had + V3 (P.P) + O: \n" +
                "Sử dụng để diễn tả sự tiếc nuối hoặc ước có một sự thay đổi trong quá khứ. \n" +
                "Ví dụ: I wish I had studied harder for the exam last. (Tôi ước tôi đã học chăm chỉ hơn cho kỳ thi tuần trước)\n");
        wishes.add("Type 3"+
                "Wish + S + would/could + have + V3 (P.P) + O: \n" +
                "Sử dụng để diễn tả sự tiếc nuối hoặc ước rằng điều gì đó đã xảy ra hoặc không xảy ra trong quá khứ. \n" +
                "Ví dụ: I wish I could have helped him with his project. (Tôi ước tôi đã có thể giúp anh ta với dự án của mình)\n");
        wishes.add("Type 4" +
                "Sử dụng để diễn tả sự tiếc nuối hoặc ước những điều khác nhau trong tương lai. \n" +
                "Ví dụ: I wish you would come to my party tonight. (Tôi ước bạn đến dự tiệc của tôi tối nay)\n");

        List<String> tag = new ArrayList<String>();
        tag.add("");
        List<String> compare = new ArrayList<String>();
        compare.add("");

        listdataChild.put(listdataHeader.get(0),tenses);
        listdataChild.put(listdataHeader.get(1),passivevoice);
        listdataChild.put(listdataHeader.get(2),conditional);
        listdataChild.put(listdataHeader.get(3),wishes);
        listdataChild.put(listdataHeader.get(4),tag);
        listdataChild.put(listdataHeader.get(5),compare);

    }
}