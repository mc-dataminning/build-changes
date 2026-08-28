import com.mojang.authlib.GameProfile;

public class gkw extends gks {
   private fba h = fba.c;
   private int i;

   public gkw(gfy $$0, GameProfile $$1) {
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
   public boolean b(bta $$0) {
      return true;
   }

   @Override
   public void h() {
      super.h();
      this.s(false);
   }

   @Override
   public void d_() {
      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      if (this.i > 0) {
         this.i(new fba((this.h.d - this.dz().d) / (double)this.i, (this.h.e - this.dz().e) / (double)this.i, (this.h.f - this.dz().f) / (double)this.i));
         this.i--;
      }

      this.ch = this.ci;
      this.eX();
      float $$1;
      if (this.aJ() && !this.eF()) {
         $$1 = (float)Math.min(0.1, this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ci = this.ci + ($$1 - this.ci) * 0.4F;

      try (box $$2 = bor.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.h = new fba($$0, $$1, $$2);
      this.i = this.aq().p() + 1;
   }

   @Override
   protected void gc() {
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.bz();
   }
}
