import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class glx extends gky<btp, fwm<btp>> {
   private static final Map<bsx<?>, akr> a = ImmutableMap.of(
      bsx.aA,
      akr.b("textures/entity/piglin/piglin.png"),
      bsx.bx,
      akr.b("textures/entity/piglin/zombified_piglin.png"),
      bsx.aB,
      akr.b("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public glx(gkh.a $$0, fyg $$1, fyg $$2, fyg $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new goj<>(this, new fvu($$0.a($$2)), new fvu($$0.a($$3)), $$0.g()));
   }

   private static fwm<btp> a(fye $$0, fyg $$1, boolean $$2) {
      fwm<btp> $$3 = new fwm<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public akr c(btp $$0) {
      akr $$1 = a.get($$0.am());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.am());
      } else {
         return $$1;
      }
   }

   protected boolean d(btp $$0) {
      return super.a($$0) || $$0 instanceof clm && ((clm)$$0).gl();
   }
}
