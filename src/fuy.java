import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fuy extends fua<bjk, fgj<bjk>> {
   private static final Map<biw<?>, aey> a = ImmutableMap.of(
      biw.aw,
      new aey("textures/entity/piglin/piglin.png"),
      biw.bs,
      new aey("textures/entity/piglin/zombified_piglin.png"),
      biw.ax,
      new aey("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fuy(ftj.a $$0, fic $$1, fic $$2, fic $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fxh<>(this, new ffr($$0.a($$2)), new ffr($$0.a($$3)), $$0.g()));
   }

   private static fgj<bjk> a(fia $$0, fic $$1, boolean $$2) {
      fgj<bjk> $$3 = new fgj<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aey b(bjk $$0) {
      aey $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bjk $$0) {
      return super.a($$0) || $$0 instanceof cal && ((cal)$$0).gd();
   }
}
