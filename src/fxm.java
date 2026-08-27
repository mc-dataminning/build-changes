import javax.annotation.Nullable;

public class fxm extends fzo<cbk, fiy> {
   public static final ahg a = new ahg("textures/entity/armorstand/wood.png");

   public fxm(fyn.a $$0) {
      super($$0, new fiz($$0.a(fmw.b)), 0.0F);
      this.a(new gco<>(this, new fiy($$0.a(fmw.c)), new fiy($$0.a(fmw.d)), $$0.g()));
      this.a(new gcr<>(this, $$0.d()));
      this.a(new gch<>(this, $$0.f()));
      this.a(new gcd<>(this, $$0.f(), $$0.d()));
   }

   public ahg a(cbk $$0) {
      return a;
   }

   protected void a(cbk $$0, eqb $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dM().X() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(auo.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cbk $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected ftp a(cbk $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ahg $$4 = this.a($$0);
         if ($$2) {
            return ftp.c($$4, false);
         } else {
            return $$1 ? ftp.a($$4, false) : null;
         }
      }
   }
}
