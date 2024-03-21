package com.example.vocalpros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navview = findViewById<NavigationView>(R.id.nav_view)
        navview.setNavigationItemSelectedListener (this)

        var list = ArrayList<ListItem>()
        list.add(ListItem(R.drawable.ic_r,"Упражнения для губ",
                "«Улыбка». Губки необходимо растянуть в широкой улыбке так, чтобы были видны зубы. Улыбку удержать десять секунд. \n- «Трубочка». Вытянуть губы трубочкой и удерживать их в таком положении также десять секунд."))
        list.add(ListItem(R.drawable.ic_r,"Упражнения для языка", "Чистим зубы языком». Рот приоткрыт. Губки поднять. Провести кончиком языка сначала по внешней поверхности зубов, потом – по внутренней: «чистим зубки языком». При этом челюсть должна оставаться неподвижной!\n" +
                "«Иголочка». Как можно дальше высунуть вперед язык, сделав его узким. В таком положении оставаться десять секунд.\n" +
                "«Змейка». Делается так же, как и упражнение «иголочка», но язык нужно слегка покусать, чтобы привести в тонус его мышцы.\n" +
                "«Хулиган». Высунуть язык и поболтать им в разные стороны.\n" +
                "«Чашечка». Открыть ротик. Попробовать дотянуться языком до верхних зубов, но при этом к ним не дотрагиваться. Получается своеобразная чашечка.\n" +
                "«Лошадка». Рот широко открывается. Язык приподнимается к небу, как бы влипая в него, а затем резко отщелкивается. В этом упражнении важно следить за тем, чтобы двигался весь язык, а не только его кончик. Челюсть при этом упражнении остается неподвижной!\n" +
                "«Грибок». Здесь положение губ, языка, нёба точно такое же, как и в упражнении «лошадка». Только щелкать языком не нужно, а важно удержать его «прилипшим» к небу десять секунд. Таки образом растягивается уздечка языка."))
        list.add(ListItem(R.drawable.ic_r,"Этап автоматизации звука «р»", "РА-РА-РА – глубокая нора.\n" +
                "РО-РО-РО – красивое перо.\n" +
                "РЫ-РЫ-РЫ – олень поел коры и т. д.\n" +
                "\n" +
                "АРА-АРА-АРА – в машине светят фары.\n" +
                "\n" +
                "ОРО-ОРО-ОРО – мы едем в большой город.\n" +
                "\n" +
                "ЫРЫ-ЫРЫ-ЫРЫ – залатаны все дыры.\n" +
                "\n" +
                "УРУ-УРУ-УРУ – мы любим физкультуру.\n" +
                "\n" +
                "ЭРЕ-ЭРЕ-ЭРЕ –  небо не имеет меры.\n" +
                "\n" +
                "Позже переходите к скороговоркам. Вот самая удачная из них (но не забудьте объяснить ребенку непонятные слова):\n" +
                "\n" +
                "«Баркас причалил в порт Мадрас.\n" +
                "Матрос принес на борт матрас.\n" +
                "В порту Мадрас матрас матроса\n" +
                "Порвали в драке альбатросы»."))
        list.add(ListItem(R.drawable.ic_r,"Прочее", "10. Повторите медленно, а затем быстро сложные слова:\n" +
                "\n" +
                "(В, ш) — воспользовавшемуся\n" +
                "\n" +
                "(К) — мелкокалиберными\n" +
                "\n" +
                "(П, в) — опубликовывать\n" +
                "\n" +
                "(П, р) — опосредованному субсидированию\n" +
                "\n" +
                "(Р, т, с) — территориальная целостность\n" +
                "\n" +
                "(Р, т) — проиллюстрировала\n" +
                "\n" +
                "(Р, в) — ревербератор\n" +
                "\n" +
                "(С, ф) — средств\n" +
                "\n" +
                "(Ч, в) — четырехсотдолларового\n" +
                "\n" +
                "(Ч, ф, р) — фантасмагорический"))

        val a = findViewById<RecyclerView>(R.id.rcView)
        a.hasFixedSize()
        a.layoutManager= LinearLayoutManager(this)
        a.adapter = MyAdapter(list,this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.MainPage -> Toast.makeText(this,"Главное меню",Toast.LENGTH_SHORT).show()
            R.id.fulllist -> Toast.makeText(this,"Окно полное",Toast.LENGTH_SHORT).show()
            R.id.favourites -> Toast.makeText(this,"Избранное",Toast.LENGTH_SHORT).show()
            R.id.Settings -> Toast.makeText(this,"Настройки",Toast.LENGTH_SHORT).show()
        }

        return true
    }
}