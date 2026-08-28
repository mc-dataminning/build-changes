import javax.annotation.Nullable;

public class gie extends gkh<cig, fti> {
   public static final akk a = new akk("textures/entity/armorstand/wood.png");

   public gie(gjg.a $$0) {
      super($$0, new ftj($$0.a(fxh.c)), 0.0F);
      this.a(new gni<>(this, new fti($$0.a(fxh.d)), new fti($$0.a(fxh.e)), $$0.g()));
      this.a(new gnl<>(this, $$0.d()));
      this.a(new gnb<>(this, $$0.f()));
      this.a(new gmx<>(this, $$0.f(), $$0.d()));
   }

   public akk a(cig $$0) {
      return a;
   }

   protected void a(cig $$0, fag $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bP) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aye.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cig $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gef a(cig $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akk $$4 = this.a($$0);
         if ($$2) {
            return gef.c($$4, false);
         } else {
            return $$1 ? gef.a($$4, false) : null;
         }
      }
   }
}
