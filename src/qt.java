import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static final ale<ejt> a = rj.a("ancient_city/city_center");

   public static void a(rc<ejt> $$0) {
      jj<emi> $$1 = $$0.a(lq.aK);
      ji<emi> $$2 = $$1.b(rk.G);
      jj<ejt> $$3 = $$0.a(lq.aM);
      ji<ejt> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejt(
            $$4,
            ImmutableList.of(
               Pair.of(ejr.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(ejr.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(ejr.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            ejt.a.b
         )
      );
      qu.a($$0);
   }
}
