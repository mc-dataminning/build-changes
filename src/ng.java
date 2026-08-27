import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ng {
   public static final aet<dwm> a = nw.a("ancient_city/city_center");

   public static void a(np<dwm> $$0) {
      hh<dyu> $$1 = $$0.a(je.aA);
      hg<dyu> $$2 = $$1.b(nx.G);
      hh<dwm> $$3 = $$0.a(je.aC);
      hg<dwm> $$4 = $$3.b(nw.a);
      $$0.a(
         a,
         new dwm(
            $$4,
            ImmutableList.of(
               Pair.of(dwk.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(dwk.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(dwk.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            dwm.a.b
         )
      );
      nh.a($$0);
   }
}
