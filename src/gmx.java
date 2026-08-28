import com.mojang.authlib.GameProfile;

public class gmx extends gmt {
   private fcu h = fcu.c;
   private int i;

   public gmx(ghz $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean b(buh $$0) {
      return true;
   }

   @Override
   public void h() {
      super.h();
      this.r(false);
   }

   @Override
   public void k_() {
      if (this.bR()) {
         this.N_().e();
      }

      if (this.bk > 0) {
         this.a(this.bk, this.bj);
         this.bk--;
      }

      if (this.i > 0) {
         this.j(new fcu((this.h.d - this.dy().d) / (double)this.i, (this.h.e - this.dy().e) / (double)this.i, (this.h.f - this.dy().f) / (double)this.i));
         this.i--;
      }

      this.bT = this.bU;
      this.eY();
      float $$1;
      if (this.aJ() && !this.eG()) {
         $$1 = (float)Math.min(0.1, this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bU = this.bU + ($$1 - this.bU) * 0.4F;

      try (bqg $$2 = bqa.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.h = new fcu($$0, $$1, $$2);
      this.i = this.aq().p() + 1;
   }

   @Override
   protected void gb() {
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      this.by();
   }
}
