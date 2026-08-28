import com.mojang.authlib.GameProfile;

public class gqn extends gqj {
   private fgc h = fgc.c;
   private int i;

   public gqn(glo $$0, GameProfile $$1) {
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
   public boolean b(bvt $$0) {
      return true;
   }

   @Override
   public void g() {
      super.g();
      this.r(false);
   }

   @Override
   public void d_() {
      if (this.bQ()) {
         this.l_().e();
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      if (this.i > 0) {
         this.j(new fgc((this.h.d - this.dy().d) / (double)this.i, (this.h.e - this.dy().e) / (double)this.i, (this.h.f - this.dy().f) / (double)this.i));
         this.i--;
      }

      this.bV = this.bW;
      this.eZ();
      float $$1;
      if (this.aH() && !this.eH()) {
         $$1 = (float)Math.min(0.1, this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;

      try (brr $$2 = brl.a().d("push")) {
         this.n();
      }
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.h = new fgc($$0, $$1, $$2);
      this.i = this.an().p() + 1;
   }

   @Override
   protected void gc() {
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.bx();
   }
}
