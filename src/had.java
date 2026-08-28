import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class had extends han<hcz, ggg> {
   private static final Map<bvz.a, alg> a = ImmutableMap.of(
      bvz.a.b,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvz.a.c,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvz.a.d,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public had(gxw<hcz, ggg> $$0) {
      super($$0);
   }

   public void a(fjc $$0, gps $$1, int $$2, hcz $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bvz.a $$6 = $$3.c;
         if ($$6 != bvz.a.a) {
            alg $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
