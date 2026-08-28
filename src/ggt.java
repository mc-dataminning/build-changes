import com.mojang.authlib.GameProfile;

public class ggt extends ggp {
   private ezh i = ezh.c;
   private int cw;

   public ggt(gbx $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cS().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cL();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
   }

   @Override
   public void n_() {
      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      if (this.cw > 0) {
         this.i(new ezh((this.i.d - this.dA().d) / (double)this.cw, (this.i.e - this.dA().e) / (double)this.cw, (this.i.f - this.dA().f) / (double)this.cw));
         this.cw--;
      }

      this.cd = this.ce;
      this.eZ();
      float $$1;
      if (this.aJ() && !this.eH()) {
         $$1 = (float)Math.min(0.1, this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.ce = this.ce + ($$1 - this.ce) * 0.4F;
      this.dX().ah().a("push");
      this.r();
      this.dX().ah().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.i = new ezh($$0, $$1, $$2);
      this.cw = this.aq().p() + 1;
   }

   @Override
   protected void ge() {
   }

   @Override
   public void a(xh $$0) {
      fja $$1 = fja.Q();
      $$1.m.d().a($$0);
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      this.bA();
   }
}
