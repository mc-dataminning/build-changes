import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkn extends gjo<btr, fve<btr>> {
   private static final Map<bta<?>, alf> a = ImmutableMap.of(
      bta.aA,
      new alf("textures/entity/piglin/piglin.png"),
      bta.bx,
      new alf("textures/entity/piglin/zombified_piglin.png"),
      bta.aB,
      new alf("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gkn(gix.a $$0, fwy $$1, fwy $$2, fwy $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gmz<>(this, new fum($$0.a($$2)), new fum($$0.a($$3)), $$0.g()));
   }

   private static fve<btr> a(fww $$0, fwy $$1, boolean $$2) {
      fve<btr> $$3 = new fve<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public alf c(btr $$0) {
      alf $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(btr $$0) {
      return super.a($$0) || $$0 instanceof clm && ((clm)$$0).gq();
   }
}
