import javax.annotation.Nullable;

public class fzz extends gcb<cdm, flj> {
   public static final aiy a = new aiy("textures/entity/armorstand/wood.png");

   public fzz(gba.a $$0) {
      super($$0, new flk($$0.a(fpi.c)), 0.0F);
      this.a(new gfb<>(this, new flj($$0.a(fpi.d)), new flj($$0.a(fpi.e)), $$0.g()));
      this.a(new gfe<>(this, $$0.d()));
      this.a(new geu<>(this, $$0.f()));
      this.a(new geq<>(this, $$0.f(), $$0.d()));
   }

   public aiy a(cdm $$0) {
      return a;
   }

   protected void a(cdm $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dM().X() - $$0.bJ) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(awi.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cdm $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fwb a(cdm $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.B()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aiy $$4 = this.a($$0);
         if ($$2) {
            return fwb.c($$4, false);
         } else {
            return $$1 ? fwb.a($$4, false) : null;
         }
      }
   }
}
