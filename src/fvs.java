import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fvs extends fuu<bkl, fhb<bkl>> {
   private static final Map<bjx<?>, afw> a = ImmutableMap.of(
      bjx.aw,
      new afw("textures/entity/piglin/piglin.png"),
      bjx.bs,
      new afw("textures/entity/piglin/zombified_piglin.png"),
      bjx.ax,
      new afw("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fvs(fud.a $$0, fiu $$1, fiu $$2, fiu $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fyb<>(this, new fgj($$0.a($$2)), new fgj($$0.a($$3)), $$0.g()));
   }

   private static fhb<bkl> a(fis $$0, fiu $$1, boolean $$2) {
      fhb<bkl> $$3 = new fhb<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public afw b(bkl $$0) {
      afw $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bkl $$0) {
      return super.a($$0) || $$0 instanceof cbm && ((cbm)$$0).ge();
   }
}
