import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ql {
   public static final ald<emq> a = rb.a("ancient_city/city_center");

   public static void a(qu<emq> $$0) {
      jp<epg> $$1 = $$0.a(lw.aU);
      jo<epg> $$2 = $$1.b(rc.G);
      jp<emq> $$3 = $$0.a(lw.aW);
      jo<emq> $$4 = $$3.b(rb.a);
      $$0.a(
         a,
         new emq(
            $$4,
            ImmutableList.of(
               Pair.of(emo.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(emo.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(emo.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            emq.a.b
         )
      );
      qm.a($$0);
   }
}
