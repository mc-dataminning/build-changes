import javax.annotation.Nullable;

public class gik extends gkn<cij, fto> {
   public static final akk a = new akk("textures/entity/armorstand/wood.png");

   public gik(gjm.a $$0) {
      super($$0, new ftp($$0.a(fxn.c)), 0.0F);
      this.a(new gno<>(this, new fto($$0.a(fxn.d)), new fto($$0.a(fxn.e)), $$0.g()));
      this.a(new gnr<>(this, $$0.d()));
      this.a(new gnh<>(this, $$0.f()));
      this.a(new gnd<>(this, $$0.f(), $$0.d()));
   }

   public akk a(cij $$0) {
      return a;
   }

   protected void a(cij $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dQ().Z() - $$0.bP) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayg.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cij $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.cb() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cF();
   }

   @Nullable
   protected gel a(cij $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akk $$4 = this.a($$0);
         if ($$2) {
            return gel.c($$4, false);
         } else {
            return $$1 ? gel.a($$4, false) : null;
         }
      }
   }
}
