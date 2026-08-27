import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gow extends gpi<ceq, fwf<ceq>> {
   private static final Map<brt.a, akt> a = ImmutableMap.of(
      brt.a.b,
      new akt("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      brt.a.c,
      new akt("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      brt.a.d,
      new akt("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gow(gmp<ceq, fwf<ceq>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, ceq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cm()) {
         brt.a $$10 = $$3.t();
         if ($$10 != brt.a.a) {
            akt $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
