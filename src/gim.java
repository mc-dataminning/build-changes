import javax.annotation.Nullable;

public class gim extends gkp<cik, ftq> {
   public static final akk a = new akk("textures/entity/armorstand/wood.png");

   public gim(gjo.a $$0) {
      super($$0, new ftr($$0.a(fxp.c)), 0.0F);
      this.a(new gnq<>(this, new ftq($$0.a(fxp.d)), new ftq($$0.a(fxp.e)), $$0.g()));
      this.a(new gnt<>(this, $$0.d()));
      this.a(new gnj<>(this, $$0.f()));
      this.a(new gnf<>(this, $$0.f(), $$0.d()));
   }

   public akk a(cik $$0) {
      return a;
   }

   protected void a(cik $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dR().Z() - $$0.bP) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayg.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cik $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.cc() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cG();
   }

   @Nullable
   protected gen a(cik $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akk $$4 = this.a($$0);
         if ($$2) {
            return gen.c($$4, false);
         } else {
            return $$1 ? gen.a($$4, false) : null;
         }
      }
   }
}
