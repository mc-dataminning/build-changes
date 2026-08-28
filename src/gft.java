import com.mojang.authlib.GameProfile;

public class gft extends gfp {
   private eye cw = eye.c;
   private int cx;

   public gft(gax $$0, GameProfile $$1) {
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
   public boolean a(bsb $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
   }

   @Override
   public void m_() {
      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      if (this.cx > 0) {
         this.i(new eye((this.cw.d - this.dv().d) / (double)this.cx, (this.cw.e - this.dv().e) / (double)this.cx, (this.cw.f - this.dv().f) / (double)this.cx));
         this.cx--;
      }

      this.cd = this.ce;
      this.eU();
      float $$1;
      if (this.aH() && !this.eB()) {
         $$1 = (float)Math.min(0.1, this.dv().i());
      } else {
         $$1 = 0.0F;
      }

      this.ce = this.ce + ($$1 - this.ce) * 0.4F;
      this.dS().ah().a("push");
      this.r();
      this.dS().ah().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.cw = new eye($$0, $$1, $$2);
      this.cx = this.ao().p() + 1;
   }

   @Override
   protected void fV() {
   }

   @Override
   public void a(xd $$0) {
      fib $$1 = fib.Q();
      $$1.m.d().a($$0);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.by();
   }
}
