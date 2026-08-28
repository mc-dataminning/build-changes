import com.mojang.authlib.GameProfile;

public class gcm extends gci {
   private evm g = evm.b;
   private int cz;

   public gcm(fxq $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.r(false);
   }

   @Override
   public void n_() {
      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      if (this.cz > 0) {
         this.i(new evm((this.g.c - this.ds().c) / (double)this.cz, (this.g.d - this.ds().d) / (double)this.cz, (this.g.e - this.ds().e) / (double)this.cz));
         this.cz--;
      }

      this.ce = this.cf;
      this.eV();
      float $$1;
      if (this.aE() && !this.eB()) {
         $$1 = (float)Math.min(0.1, this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      this.dP().ag().a("push");
      this.q();
      this.dP().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new evm($$0, $$1, $$2);
      this.cz = this.ak().p() + 1;
   }

   @Override
   protected void fV() {
   }

   @Override
   public void a(xl $$0) {
      ffa $$1 = ffa.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.bu();
   }
}
