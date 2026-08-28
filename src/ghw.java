import javax.annotation.Nullable;

public class ghw extends gjz<ciy, ftb> {
   public static final alf a = new alf("textures/entity/armorstand/wood.png");

   public ghw(giy.a $$0) {
      super($$0, new ftc($$0.a(fxa.c)), 0.0F);
      this.a(new gna<>(this, new ftb($$0.a(fxa.d)), new ftb($$0.a(fxa.e)), $$0.g()));
      this.a(new gnd<>(this, $$0.d()));
      this.a(new gmt<>(this, $$0.f()));
      this.a(new gmp<>(this, $$0.f(), $$0.d()));
   }

   public alf a(ciy $$0) {
      return a;
   }

   protected void a(ciy $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$6 = (float)($$0.dP().Z() - $$0.bN) + $$4;
      if ($$6 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ayz.a($$6 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(ciy $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cE();
   }

   @Nullable
   protected gdx a(ciy $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.z()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alf $$4 = this.a($$0);
         if ($$2) {
            return gdx.c($$4, false);
         } else {
            return $$1 ? gdx.a($$4, false) : null;
         }
      }
   }
}
