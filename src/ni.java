import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ni {
   public static final aey<dwl> a = ny.a("ancient_city/city_center");

   public static void a(nr<dwl> $$0) {
      hf<dyt> $$1 = $$0.a(jc.aB);
      he<dyt> $$2 = $$1.b(nz.G);
      hf<dwl> $$3 = $$0.a(jc.aD);
      he<dwl> $$4 = $$3.b(ny.a);
      $$0.a(
         a,
         new dwl(
            $$4,
            ImmutableList.of(
               Pair.of(dwj.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(dwj.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(dwj.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            dwl.a.b
         )
      );
      nj.a($$0);
   }
}
