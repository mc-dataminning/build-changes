import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glt extends gku<btn, fwi<btn>> {
   private static final Map<bsw<?>, akq> a = ImmutableMap.of(
      bsw.aA,
      akq.b("textures/entity/piglin/piglin.png"),
      bsw.bx,
      akq.b("textures/entity/piglin/zombified_piglin.png"),
      bsw.aB,
      akq.b("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public glt(gkd.a $$0, fyc $$1, fyc $$2, fyc $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gof<>(this, new fvq($$0.a($$2)), new fvq($$0.a($$3)), $$0.g()));
   }

   private static fwi<btn> a(fya $$0, fyc $$1, boolean $$2) {
      fwi<btn> $$3 = new fwi<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akq c(btn $$0) {
      akq $$1 = a.get($$0.am());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.am());
      } else {
         return $$1;
      }
   }

   protected boolean d(btn $$0) {
      return super.a($$0) || $$0 instanceof clk && ((clk)$$0).gm();
   }
}
