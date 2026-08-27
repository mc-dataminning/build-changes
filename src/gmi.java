import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gmi extends gli<bsq, fwv<bsq>> {
   private static final Map<bsb<?>, akt> a = ImmutableMap.of(
      bsb.aB,
      new akt("textures/entity/piglin/piglin.png"),
      bsb.bC,
      new akt("textures/entity/piglin/zombified_piglin.png"),
      bsb.aC,
      new akt("textures/entity/piglin/piglin_brute.png")
   );
   private static final float b = 1.0019531F;

   public gmi(gkq.a $$0, fyq $$1, fyq $$2, fyq $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gov<>(this, new fwc($$0.a($$2)), new fwc($$0.a($$3)), $$0.g()));
   }

   private static fwv<bsq> a(fyo $$0, fyq $$1, boolean $$2) {
      fwv<bsq> $$3 = new fwv<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akt c(bsq $$0) {
      akt $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(bsq $$0) {
      return super.a($$0) || $$0 instanceof ckn && ((ckn)$$0).gy();
   }
}
