import com.mojang.authlib.GameProfile;

public class ggi extends gge {
   private eyw cv = eyw.c;
   private int cw;

   public ggi(gbm $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cO().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cH();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
   }

   @Override
   public void n_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cw > 0) {
         this.i(new eyw((this.cv.d - this.dv().d) / (double)this.cw, (this.cv.e - this.dv().e) / (double)this.cw, (this.cv.f - this.dv().f) / (double)this.cw));
         this.cw--;
      }

      this.cc = this.cd;
      this.eU();
      float $$1;
      if (this.aH() && !this.eC()) {
         $$1 = (float)Math.min(0.1, this.dv().i());
      } else {
         $$1 = 0.0F;
      }

      this.cd = this.cd + ($$1 - this.cd) * 0.4F;
      this.dS().ah().a("push");
      this.r();
      this.dS().ah().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cv = new eyw($$0, $$1, $$2);
      this.cw = this.ao().p() + 1;
   }

   @Override
   protected void fX() {
   }

   @Override
   public void a(xe $$0) {
      fip $$1 = fip.Q();
      $$1.m.d().a($$0);
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      this.by();
   }
}
