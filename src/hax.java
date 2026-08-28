import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hax extends hbh<hdt, gha> {
   private static final Map<bwe.a, alg> a = ImmutableMap.of(
      bwe.a.b,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bwe.a.c,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bwe.a.d,
      alg.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public hax(gyq<hdt, gha> $$0) {
      super($$0);
   }

   public void a(fjy $$0, gqm $$1, int $$2, hdt $$3, float $$4, float $$5) {
      if (!$$3.z) {
         bwe.a $$6 = $$3.c;
         if ($$6 != bwe.a.a) {
            alg $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
