import javax.annotation.Nullable;

public class fwn extends fyp<cau, fhz> {
   public static final agt a = new agt("textures/entity/armorstand/wood.png");

   public fwn(fxo.a $$0) {
      super($$0, new fia($$0.a(flx.b)), 0.0F);
      this.a(new gbp<>(this, new fhz($$0.a(flx.c)), new fhz($$0.a(flx.d)), $$0.g()));
      this.a(new gbs<>(this, $$0.d()));
      this.a(new gbi<>(this, $$0.f()));
      this.a(new gbe<>(this, $$0.f(), $$0.d()));
   }

   public agt a(cau $$0) {
      return a;
   }

   protected void a(cau $$0, epd $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dM().W() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aty.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(cau $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fsq a(cau $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.A()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         agt $$4 = this.a($$0);
         if ($$2) {
            return fsq.c($$4, false);
         } else {
            return $$1 ? fsq.a($$4, false) : null;
         }
      }
   }
}
