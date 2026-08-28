import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static final ald<ejr> a = rj.a("ancient_city/city_center");

   public static void a(rc<ejr> $$0) {
      jj<emg> $$1 = $$0.a(lq.aK);
      ji<emg> $$2 = $$1.b(rk.G);
      jj<ejr> $$3 = $$0.a(lq.aM);
      ji<ejr> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejr(
            $$4,
            ImmutableList.of(
               Pair.of(ejp.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(ejp.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(ejp.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            ejr.a.b
         )
      );
      qu.a($$0);
   }
}
