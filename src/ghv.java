import javax.annotation.Nullable;

public class ghv extends gjy<cix, fta> {
   public static final alf a = new alf("textures/entity/armorstand/wood.png");

   public ghv(gix.a $$0) {
      super($$0, new ftb($$0.a(fwz.c)), 0.0F);
      this.a(new gmz<>(this, new fta($$0.a(fwz.d)), new fta($$0.a(fwz.e)), $$0.g()));
      this.a(new gnc<>(this, $$0.d()));
      this.a(new gms<>(this, $$0.f()));
      this.a(new gmo<>(this, $$0.f(), $$0.d()));
   }

   public alf a(cix $$0) {
      return a;
   }

   protected void a(cix $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cix $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdw a(cix $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alf $$4 = this.a($$0);
         if ($$2) {
            return gdw.c($$4, false);
         } else {
            return $$1 ? gdw.a($$4, false) : null;
         }
      }
   }
}
