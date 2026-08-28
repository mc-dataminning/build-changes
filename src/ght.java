import javax.annotation.Nullable;

public class ght extends gjw<civ, fsy> {
   public static final ale a = new ale("textures/entity/armorstand/wood.png");

   public ght(giv.a $$0) {
      super($$0, new fsz($$0.a(fwx.c)), 0.0F);
      this.a(new gmx<>(this, new fsy($$0.a(fwx.d)), new fsy($$0.a(fwx.e)), $$0.g()));
      this.a(new gna<>(this, $$0.d()));
      this.a(new gmq<>(this, $$0.f()));
      this.a(new gmm<>(this, $$0.f(), $$0.d()));
   }

   public ale a(civ $$0) {
      return a;
   }

   protected void a(civ $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayx.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(civ $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdu a(civ $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ale $$4 = this.a($$0);
         if ($$2) {
            return gdu.c($$4, false);
         } else {
            return $$1 ? gdu.a($$4, false) : null;
         }
      }
   }
}
