import com.mojang.authlib.GameProfile;

public class gra extends gqw {
   private ffq h = ffq.c;
   private int i;

   public gra(gmb $$0, GameProfile $$1) {
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
   public boolean b(bvi $$0) {
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
         this.R_().e();
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      if (this.i > 0) {
         this.j(new ffq((this.h.d - this.dy().d) / (double)this.i, (this.h.e - this.dy().e) / (double)this.i, (this.h.f - this.dy().f) / (double)this.i));
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

      try (brg $$2 = bra.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.h = new ffq($$0, $$1, $$2);
      this.i = this.an().p() + 1;
   }

   @Override
   protected void gc() {
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.bx();
   }
}
