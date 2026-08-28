import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gkl extends gjm<btp, fvc<btp>> {
   private static final Map<bsy<?>, ale> a = ImmutableMap.of(
      bsy.aA,
      new ale("textures/entity/piglin/piglin.png"),
      bsy.bx,
      new ale("textures/entity/piglin/zombified_piglin.png"),
      bsy.aB,
      new ale("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gkl(giv.a $$0, fww $$1, fww $$2, fww $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gmx<>(this, new fuk($$0.a($$2)), new fuk($$0.a($$3)), $$0.g()));
   }

   private static fvc<btp> a(fwu $$0, fww $$1, boolean $$2) {
      fvc<btp> $$3 = new fvc<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ale c(btp $$0) {
      ale $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(btp $$0) {
      return super.a($$0) || $$0 instanceof clk && ((clk)$$0).gq();
   }
}
