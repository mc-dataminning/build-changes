import com.mojang.authlib.GameProfile;

public class glw extends gls {
   private fbx h = fbx.c;
   private int i;

   public glw(ggy $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cQ().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cJ();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean b(btp $$0) {
      return true;
   }

   @Override
   public void h() {
      super.h();
      this.r(false);
   }

   @Override
   public void k_() {
      if (this.bQ()) {
         this.N_().e();
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      if (this.i > 0) {
         this.j(new fbx((this.h.d - this.dx().d) / (double)this.i, (this.h.e - this.dx().e) / (double)this.i, (this.h.f - this.dx().f) / (double)this.i));
         this.i--;
      }

      this.bU = this.bV;
      this.eX();
      float $$1;
      if (this.aJ() && !this.eF()) {
         $$1 = (float)Math.min(0.1, this.dx().i());
      } else {
         $$1 = 0.0F;
      }

      this.bV = this.bV + ($$1 - this.bV) * 0.4F;

      try (bpo $$2 = bpi.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.h = new fbx($$0, $$1, $$2);
      this.i = this.aq().p() + 1;
   }

   @Override
   protected void ge() {
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.bx();
   }
}
