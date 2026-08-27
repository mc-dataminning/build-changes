import javax.annotation.Nullable;

public class fxe extends fzg<cbe, fiq> {
   public static final ahd a = new ahd("textures/entity/armorstand/wood.png");

   public fxe(fyf.a $$0) {
      super($$0, new fir($$0.a(fmo.b)), 0.0F);
      this.a(new gcg<>(this, new fiq($$0.a(fmo.c)), new fiq($$0.a(fmo.d)), $$0.g()));
      this.a(new gcj<>(this, $$0.d()));
      this.a(new gbz<>(this, $$0.f()));
      this.a(new gbv<>(this, $$0.f(), $$0.d()));
   }

   public ahd a(cbe $$0) {
      return a;
   }

   protected void a(cbe $$0, ept $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dM().X() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aui.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cbe $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fth a(cbe $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ahd $$4 = this.a($$0);
         if ($$2) {
            return fth.c($$4, false);
         } else {
            return $$1 ? fth.a($$4, false) : null;
         }
      }
   }
}
