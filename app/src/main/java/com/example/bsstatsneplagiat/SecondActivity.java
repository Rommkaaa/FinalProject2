package com.example.bsstatsneplagiat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);

        AnimalAdapter adapter = new AnimalAdapter(this, animals);


        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {

        animals.add(new Animal("Биби", "Обладает очень высокой скоростью передвижения, имеет чуть выше среднего количество здоровья и такой же урон",
                R.drawable.bibi, " класс Танк"));
        animals.add(new Animal("Кольт", "Кольт имеет нормальную скорость передвижения, средне-низкий запас здоровья, довольно высокий урон и большую дальность основной атаки.",
                R.drawable.colt, "класс Урон"));
        animals.add(new Animal("Вольт", "Вольт имеет средне-низкое здоровье, низкую скорость передвижения и средне-низкую перезарядку.",
                R.drawable.volt, "класс Урон"));
        animals.add(new Animal("Шелли", "Шелли имеет очень высокую скорость передвижения и среднее количество здоровья, имеет среднюю скорость перезарядки и дальность удара.",
                R.drawable.seli, "класс Урон"));
        animals.add(new Animal("Бо", "У него нормальная скорость передвижения, средний показатель здоровья и довольно высокий урон на средней дистанции. ",
                R.drawable.bo, "класс Контроль"));
        animals.add(new Animal("Мортис", "Мортис имеет средний запас здоровья, низкую дальность и достаточно низкий урон. Он отличается от других бойцов своей очень высокой скоростью передвижения и способностью совершать рывки на небольшую дистанцию, что даёт ему преимущество в скорости и возможность эффективно отклоняться от снарядов.",
                R.drawable.mort, "класс Убийца"));
        animals.add(new Animal("Ворон", "Ворон имеет средний урон, очень низкое здоровье, высокую скорость перезарядки и очень высокую скорость передвижения.",
                R.drawable.voron, "класс Убийца"));
        animals.add(new Animal("Гавс", "Генерал Гавс — боец со средне-низким здоровьем и средне-низким уроном, компенсирующимся быстрой скоростью перезарядки и атаки, а также Супером. ",
                R.drawable.cobaca, "класс Поддержка"));
        animals.add(new Animal("Леон", "Леон имеет очень высокую скорость передвижения и низкое здоровье. Своей обычной атакой он бросает 4 лезвия на очень большую дистанцию.",
                R.drawable.lenya, "класс Убийца"));
        animals.add(new Animal("Байрон", "Байрон — боец с очень низким здоровьем, но с большой дальностью атаки и со средней скоростью передвижения.",
                R.drawable.bar, "класс Поддержка"));
        animals.add(new Animal("Карл", "Карл имеет нормальную скорость передвижения, средне-высокое количество здоровья и средний урон. ",
                R.drawable.ca, "класс Урон"));
        animals.add(new Animal("Лу", "Лу — боец дальнего боя. У него очень большая дальность атаки, среднее здоровье, нормальная скорость передвижения и очень высокая скорость перезарядки. ",
                R.drawable.ly, "класс Контроль"));
        animals.add(new Animal("Нита", "Нита имеет нормальную скорость передвижения, среднее количество здоровья, очень высокую перезарядку и средне-низкий урон.",
                R.drawable.nitka, "класс Урон"));
        animals.add(new Animal("Булл", "Он обладает высокой скоростью передвижения, большим количеством здоровья и высоким уроном на ближней дистанции.",
                R.drawable.bul, "класс Танк"));
        animals.add(new Animal("Брок", "Брок имеет очень низкое здоровье, нормальную скорость и низкую перезарядку",
                R.drawable.bok, "класс Стрелок "));
        animals.add(new Animal("Эль Примо", "Имеет высокую скорость передвижения, довольно высокую скорость перезарядки и высокий показатель здоровья, который позволяет выдерживать ему большинство вражеских атак. ",
                R.drawable.gh, "класс Танк "));
        animals.add(new Animal("Барли", "Барли имеет нормальную скорость передвижения, очень низкий уровень здоровья, но обладает атакой, с помощью которой он бросает бутылки с зажигательной смесью, покрывающие землю лужами, наносящими средний урон врагам, стоящим на них, со временем.",
                R.drawable.barly, "класс Артиллерия "));
        animals.add(new Animal("Поко", "Поко имеет нормальную скорость передвижения и широкий диапазон атаки. Несмотря на это, он имеет и свои слабости: среднее количество единиц здоровья и низкий урон.",
                R.drawable.pi, "класс Поддержка "));
        animals.add(new Animal("Джесси", "Она обладает нормальной скоростью передвижения, средне-низким здоровьем, средним уроном и средней скоростью перезарядки.",
                R.drawable.purrr, "класс Контроль"));
        animals.add(new Animal("Диномайк", "Динамайк имеет нормальную скорость передвижения, средне-низкое количество здоровья и высокий урон.",
                R.drawable.iuugyg, "класс Артиллерия"));
        animals.add(new Animal("Тик", "У него нормальная скорость передвижения, один из двух самых низких запасов здоровья в игре, но очень высокий урон и высокая дальность.",
                R.drawable.nte, "класс Артиллерия"));
        animals.add(new Animal("8-бит", "Обладает средне-высоким количеством здоровья, очень низкой скоростью передвижения (является на данный момент самым медленным персонажем в игре) и высоким уроном",
                R.drawable.bit, "класс Урон"));
        animals.add(new Animal("Рико", "Рико имеет нормальную скорость передвижения, низкий уровень здоровья, и умеренный урон",
                R.drawable.pik, "класс Урон"));
        animals.add(new Animal("Дэррил", "Имеет довольно высокую скорость передвижения,большое количество здоровья и большой урон вблизи",
                R.drawable.bocha, "класс Урон"));
        animals.add(new Animal("Пенни", "Она имеет нормальную скорость передвижения, низкий урон (в зависимости от случая), большую дальность атаки и средний уровень здоровья",
                R.drawable.fffb, "класс Артиллерия "));
        animals.add(new Animal("Джеки", "Джеки имеет высокую скорость передвижения, высокий показатель здоровья и высокий показатель урона",
                R.drawable.rftvg, "класс Танк"));
        animals.add(new Animal("Гас", "Гас имеет нормальную скорость передвижения, средне-низкое количество здоровья и средний урон.",
                R.drawable.gas, "класс Поддержка"));
        animals.add(new Animal("Эмз", "У неё нормальная скорость передвижения, средний показатель здоровья и низкий урон, который может увеличиться в три раза в зависимости от времени, что противник провёл в созданном облаке газа.",
                R.drawable.gnf, "класс Контроль"));
        animals.add(new Animal("Сту", "У Сту среднее количество здоровья. Его 2 петарды за 1 атаку наносят средне-низкий урон",
                R.drawable.iosdf, "класс Убийца"));
        animals.add(new Animal("Пайпер", "Имеет очень низкое здоровье, но потенциально высокий урон, очень большую дальность атаки и нормальную скорость передвижения",
                R.drawable.s1200, "класс Стрелок"));
        animals.add(new Animal("Пэм", "Пэм имеет нормальную скорость передвижения, средне-высокое здоровье, высокий урон на ближней дистанции и средние радиус и ширину атаки. ",
                R.drawable.fem, "класс Поддержка"));
        animals.add(new Animal("Френк", "Он имеет высокую скорость передвижения, высокий урон, быструю перезарядку и самый высокий показатель здоровья среди бойцов. ",
                R.drawable.mamont, "класс Танк"));
        animals.add(new Animal("Беа", "У неё нормальная скорость передвижения, очень низкое здоровье и достаточно высокий урон (её атака может нанести очень высокий, так и незначительный урон)",
                R.drawable.mmmm, "класс Стрелок"));
        animals.add(new Animal("Нани", "Она обладает нормальной скоростью передвижения, низким здоровьем и очень высоким уроном.",
                R.drawable.maxrerrsk, "класс Стрелок"));
        animals.add(new Animal("Бонни", "Бонни имеет высокое количество здоровья, средний урон, высокую дальность и низкую скорость передвижения",
                R.drawable.rwfrg, "класс Стрелок"));
        animals.add(new Animal("Грифф", "Грифф имеет нормальную скорость передвижения, средний запас здоровья и высокий урон на близкой дистанции с основной атаки",
                R.drawable.griff, "класс Контроль"));
        animals.add(new Animal("Гром", "Гром имеет нормальную скорость передвижения, средне-низкий запас здоровья, быструю перезарядку и высокий урон",
                R.drawable.grom, "класс Артиллерия"));
        animals.add(new Animal("Эдгар", "Эдгар — боец со средне-низким здоровьем, с очень высокой скоростью перезарядки и скоростью передвижения. ",
                R.drawable.edgar, "класс Убийца"));
        animals.add(new Animal("Тара", "Тара имеет нормальную скорость, среднее здоровье и низкую перезарядку",
                R.drawable.bez, "класс Урон"));
        animals.add(new Animal("Джин", "Джин имеет нормальную скорость передвижения, среднее количество здоровья и средний урон.",
                R.drawable.gene, "класс Контроль"));
        animals.add(new Animal("Макс", "Макс имеет средне-низкое здоровье, средний урон и высокую скорость передвижения.",
                R.drawable.maks, "класс Поддержка"));
        animals.add(new Animal("Мистер Пи", "Мистер П. имеет нормальную скорость передвижения, средне-низкое здоровье и средний урон",
                R.drawable.pii, "класс Контроль"));
        animals.add(new Animal("Грей", "Грей имеет нормальную скорость передвижения, среднее здоровье и средний урон",
                R.drawable.greu, "класс Контроль"));
        animals.add(new Animal("Спраут", "Спраут имеет средне-низкий урон, нормальную скорость передвижения, а также среднюю перезарядку и средне-низкий запас здоровья.",
                R.drawable.sprut, "класс Артиллерия"));
        animals.add(new Animal("Скуик", "У Скуика нормальная скорость, урон и количество здоровья.",
                R.drawable.squeak, "класс Контроль"));
        animals.add(new Animal("Спайк", "Спайк имеет низкое здоровье, нормальную скорость передвижения и высокий урон вблизи",
                R.drawable.spik, "класс Урон"));
        animals.add(new Animal("Сэнди", "Сэнди имеет среднее здоровье, высокую скорость передвижения и средне-низкий урон",
                R.drawable.sandy, "класс Контроль"));
        animals.add(new Animal("Амбер", " У неё нормальная скорость передвижения, средний запас здоровья, высокая дальность и высокий урон",
                R.drawable.brawl, "класс Контроль"));
        animals.add(new Animal("Честер", "Имеет среднее здоровье, высокую скорость передвижения и низкий-высокий урон в зависимости от количества бубенчиков в атаке",
                R.drawable.xeou, "класс Урон"));
        animals.add(new Animal("Гейл", "У него среднее количество здоровья, нормальная скорость передвижения и довольно большой урон.",
                R.drawable.ooooo, "класс Контроль"));
        animals.add(new Animal("Коллет", "Имеет нормальную скорость передвижения, умеренное здоровье, нормальный урон (особым целям) и среднюю скорость перезарядки.",
                R.drawable.kollet, "класс Урон"));
        animals.add(new Animal("Белль", "У Белль средне-низкое количество здоровья, средний урон, очень высокая дальность атаки и нормальная скорость передвижения.",
                R.drawable.esh, "класс Стрелок"));
        animals.add(new Animal("Эш", "Эш имеет средне-высокое количество здоровья, от низкого до высокого урона, низкую дальность и от средней до очень высокой скорости передвижения.",
                R.drawable.jesha, "класс Танк"));
        animals.add(new Animal("Лола", "У неё высокое количество здоровья, нормальная скорость передвижения и высокий урон от атаки. ",
                R.drawable.lola, "класс Урон"));
        animals.add(new Animal("Фенг", "Фенг имеет высокую скорость передвижения, высокий урон вблизи и большой запас здоровья ",
                R.drawable.fang, "класс Убийца"));
        animals.add(new Animal("Ева", "Она имеет средний запас здоровья, нормальную скорость передвижения и высокой урон",
                R.drawable.eva, "класс Урон"));
        animals.add(new Animal("Джанет", "Джанет имеет нормальную скорость передвижения и среднее количество здоровья, имеет нормальную скорость перезарядки.",
                R.drawable.anet, "класс Стрелок"));
        animals.add(new Animal("Отис", "Он имеет нормальную скорость, среднее количество здоровья и высокий урон",
                R.drawable.otis, "класс Контроль"));
        animals.add(new Animal("Сэм", "Он имеет высокую/очень высокую скорость, высокое количество здоровья и высокий урон",
                R.drawable.cam, "класс Танк"));
        animals.add(new Animal("Бастер", "Он имеет высокую скорость, высокое количество здоровья и высокий урон вблизи",
                R.drawable.bas, "класс Танк"));
        animals.add(new Animal("Мэнди", "Она имеет нормальную скорость, низкое количество здоровья и средний урон",
                R.drawable.mppp, "класс Стрелок"));
        animals.add(new Animal("R-T", "Он имеет нормальную скорость, среднее-высокое количество здоровья и средне-высокий урон",
                R.drawable.rt, "класс Урон"));
        animals.add(new Animal("Мейси", "Она имеет нормальную скорость, среднее количество здоровья и высокий урон",
                R.drawable.mays, "класс Стрелок"));
    }
}













