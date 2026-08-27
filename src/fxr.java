import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxr extends fwt<bln, fiy<bln>> {
   private static final Map<bkz<?>, agm> a = ImmutableMap.of(
      bkz.aw,
      new agm("textures/entity/piglin/piglin.png"),
      bkz.bs,
      new agm("textures/entity/piglin/zombified_piglin.png"),
      bkz.ax,
      new agm("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fxr(fwc.a $$0, fkr $$1, fkr $$2, fkr $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gaa<>(this, new fig($$0.a($$2)), new fig($$0.a($$3)), $$0.g()));
   }

   private static fiy<bln> a(fkp $$0, fkr $$1, boolean $$2) {
      fiy<bln> $$3 = new fiy<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public agm b(bln $$0) {
      agm $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(bln $$0) {
      return super.a($$0) || $$0 instanceof cco && ((cco)$$0).gf();
   }
}
