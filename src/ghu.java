import javax.annotation.Nullable;

public class ghu extends gjx<ciw, fsz> {
   public static final ale a = new ale("textures/entity/armorstand/wood.png");

   public ghu(giw.a $$0) {
      super($$0, new fta($$0.a(fwy.c)), 0.0F);
      this.a(new gmy<>(this, new fsz($$0.a(fwy.d)), new fsz($$0.a(fwy.e)), $$0.g()));
      this.a(new gnb<>(this, $$0.d()));
      this.a(new gmr<>(this, $$0.f()));
      this.a(new gmn<>(this, $$0.f(), $$0.d()));
   }

   public ale a(ciw $$0) {
      return a;
   }

   protected void a(ciw $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayy.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciw $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdv a(ciw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ale $$4 = this.a($$0);
         if ($$2) {
            return gdv.c($$4, false);
         } else {
            return $$1 ? gdv.a($$4, false) : null;
         }
      }
   }
}
