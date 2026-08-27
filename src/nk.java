import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nk {
   public static final aew<dwr> a = oa.a("ancient_city/city_center");

   public static void a(nt<dwr> $$0) {
      hh<dyz> $$1 = $$0.a(je.aA);
      hg<dyz> $$2 = $$1.b(ob.G);
      hh<dwr> $$3 = $$0.a(je.aC);
      hg<dwr> $$4 = $$3.b(oa.a);
      $$0.a(
         a,
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(dwp.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(dwp.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            dwr.a.b
         )
      );
      nl.a($$0);
   }
}
