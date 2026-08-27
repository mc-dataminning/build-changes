import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fzu extends fyw<bmh, fkt<bmh>> {
   private static final Map<blt<?>, ahd> a = ImmutableMap.of(
      blt.ax,
      new ahd("textures/entity/piglin/piglin.png"),
      blt.bu,
      new ahd("textures/entity/piglin/zombified_piglin.png"),
      blt.ay,
      new ahd("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public fzu(fyf.a $$0, fmn $$1, fmn $$2, fmn $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gcg<>(this, new fkb($$0.a($$2)), new fkb($$0.a($$3)), $$0.g()));
   }

   private static fkt<bmh> a(fml $$0, fmn $$1, boolean $$2) {
      fkt<bmh> $$3 = new fkt<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public ahd b(bmh $$0) {
      ahd $$1 = a.get($$0.ai());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ai());
      } else {
         return $$1;
      }
   }

   protected boolean c(bmh $$0) {
      return super.a($$0) || $$0 instanceof cdq && ((cdq)$$0).ge();
   }
}
