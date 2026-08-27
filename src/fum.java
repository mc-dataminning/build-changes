import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fum extends fto<bja, ffx<bja>> {
   private static final Map<bim<?>, aer> a = ImmutableMap.of(
      bim.aw,
      new aer("textures/entity/piglin/piglin.png"),
      bim.bs,
      new aer("textures/entity/piglin/zombified_piglin.png"),
      bim.ax,
      new aer("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fum(fsx.a $$0, fhq $$1, fhq $$2, fhq $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new fwv<>(this, new fff($$0.a($$2)), new fff($$0.a($$3)), $$0.g()));
   }

   private static ffx<bja> a(fho $$0, fhq $$1, boolean $$2) {
      ffx<bja> $$3 = new ffx<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public aer b(bja $$0) {
      aer $$1 = a.get($$0.ag());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ag());
      } else {
         return $$1;
      }
   }

   protected boolean c(bja $$0) {
      return super.a($$0) || $$0 instanceof cab && ((cab)$$0).ga();
   }
}
