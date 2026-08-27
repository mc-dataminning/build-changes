import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkp extends gky<cdf, fsg<cdf>> {
   private static final Map<bqj.a, akf> a = ImmutableMap.of(
      bqj.a.b,
      new akf("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bqj.a.c,
      new akf("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bqj.a.d,
      new akf("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gkp(gii<cdf, fsg<cdf>> $$0) {
      super($$0);
   }

   public void a(exn $$0, gbe $$1, int $$2, cdf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         bqj.a $$10 = $$3.u();
         if ($$10 != bqj.a.a) {
            akf $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
