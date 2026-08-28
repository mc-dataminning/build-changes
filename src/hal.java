import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hal extends hav<hdh, ggo> {
   private static final Map<bwb.a, alg> a = ImmutableMap.of(
      bwb.a.b,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwb.a.c,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwb.a.d,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hal(gye<hdh, ggo> $$0) {
      super($$0);
   }

   public void a(fjj $$0, gqa $$1, int $$2, hdh $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bwb.a $$6 = $$3.c;
         if ($$6 != bwb.a.a) {
            alg $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
