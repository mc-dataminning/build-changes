import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hbc extends hbm<hdz, ghf> {
   private static final Map<bwe.a, alg> a = ImmutableMap.of(
      bwe.a.b,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwe.a.c,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwe.a.d,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hbc(gyv<hdz, ghf> $$0) {
      super($$0);
   }

   public void a(fkd $$0, gqr $$1, int $$2, hdz $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bwe.a $$6 = $$3.c;
         if ($$6 != bwe.a.a) {
            alg $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
