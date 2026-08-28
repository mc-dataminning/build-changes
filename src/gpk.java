import com.mojang.authlib.GameProfile;

public class gpk extends gpg {
   private fex h = fex.c;
   private int i;

   public gpk(gkl $$0, GameProfile $$1) {
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
   public boolean b(bux $$0) {
      return true;
   }

   @Override
   public void h() {
      super.h();
      this.r(false);
   }

   @Override
   public void k_() {
      if (this.bP()) {
         this.N_().e();
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      if (this.i > 0) {
         this.j(new fex((this.h.d - this.dx().d) / (double)this.i, (this.h.e - this.dx().e) / (double)this.i, (this.h.f - this.dx().f) / (double)this.i));
         this.i--;
      }

      this.bV = this.bW;
      this.eY();
      float $$1;
      if (this.aH() && !this.eG()) {
         $$1 = (float)Math.min(0.1, this.dx().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;

      try (bqv $$2 = bqp.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.h = new fex($$0, $$1, $$2);
      this.i = this.an().p() + 1;
   }

   @Override
   protected void gb() {
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.bw();
   }
}
