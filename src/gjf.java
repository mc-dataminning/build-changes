import javax.annotation.Nullable;

public class gjf extends gli<ciw, fui> {
   public static final akr a = akr.b("textures/entity/armorstand/wood.png");

   public gjf(gkh.a $$0) {
      super($$0, new fuj($$0.a(fyh.c)), 0.0F);
      this.a(new goj<>(this, new fui($$0.a(fyh.d)), new fui($$0.a(fyh.e)), $$0.g()));
      this.a(new gom<>(this, $$0.d()));
      this.a(new goc<>(this, $$0.f()));
      this.a(new gny<>(this, $$0.f(), $$0.d()));
   }

   public akr a(ciw $$0) {
      return a;
   }

   protected void a(ciw $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bO) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayo.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciw $$0) {
      double $$1 = this.d.b($$0);
      float $$2 = $$0.cb() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cF();
   }

   @Nullable
   protected gff a(ciw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akr $$4 = this.a($$0);
         if ($$2) {
            return gff.c($$4, false);
         } else {
            return $$1 ? gff.a($$4, false) : null;
         }
      }
   }
}
