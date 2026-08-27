import javax.annotation.Nullable;

public class ggr extends giu<chy, frw> {
   public static final akn a = new akn("textures/entity/armorstand/wood.png");

   public ggr(ght.a $$0) {
      super($$0, new frx($$0.a(fvv.c)), 0.0F);
      this.a(new glv<>(this, new frw($$0.a(fvv.d)), new frw($$0.a(fvv.e)), $$0.g()));
      this.a(new gly<>(this, $$0.d()));
      this.a(new glo<>(this, $$0.f()));
      this.a(new glk<>(this, $$0.f(), $$0.d()));
   }

   public akn a(chy $$0) {
      return a;
   }

   protected void a(chy $$0, eyu $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Y() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayf.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(chy $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gcs a(chy $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         akn $$4 = this.a($$0);
         if ($$2) {
            return gcs.c($$4, false);
         } else {
            return $$1 ? gcs.a($$4, false) : null;
         }
      }
   }
}
