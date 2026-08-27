import com.mojang.authlib.GameProfile;

public class fvt extends fvp {
   private eov g = eov.b;
   private int cr;

   public fvt(fra $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cx();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void d_() {
      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      if (this.cr > 0) {
         this.h(new eov((this.g.c - this.dm().c) / (double)this.cr, (this.g.d - this.dm().d) / (double)this.cr, (this.g.e - this.dm().e) / (double)this.cr));
         this.cr--;
      }

      this.ca = this.cb;
      this.eP();
      float $$1;
      if (this.aC() && !this.ev()) {
         $$1 = (float)Math.min(0.1, this.dm().h());
      } else {
         $$1 = 0.0F;
      }

      this.cb = this.cb + ($$1 - this.cb) * 0.4F;
      this.dJ().ae().a("push");
      this.M_();
      this.dJ().ae().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new eov($$0, $$1, $$2);
      this.cr = this.ai().p() + 1;
   }

   @Override
   protected void fO() {
   }

   @Override
   public void a(vs $$0) {
      eyk $$1 = eyk.P();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      this.bp();
   }
}
