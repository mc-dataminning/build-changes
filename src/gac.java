import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gac extends fze<bmn, flb<bmn>> {
   private static final Map<blz<?>, ahg> a = ImmutableMap.of(
      blz.ax,
      new ahg("textures/entity/piglin/piglin.png"),
      blz.bu,
      new ahg("textures/entity/piglin/zombified_piglin.png"),
      blz.ay,
      new ahg("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gac(fyn.a $$0, fmv $$1, fmv $$2, fmv $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gco<>(this, new fkj($$0.a($$2)), new fkj($$0.a($$3)), $$0.g()));
   }

   private static flb<bmn> a(fmt $$0, fmv $$1, boolean $$2) {
      flb<bmn> $$3 = new flb<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ahg b(bmn $$0) {
      ahg $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(bmn $$0) {
      return super.a($$0) || $$0 instanceof cdx && ((cdx)$$0).ge();
   }
}
