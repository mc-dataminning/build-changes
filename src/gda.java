import com.mojang.authlib.GameProfile;

public class gda extends gcw {
   private evz g = evz.b;
   private int cB;

   public gda(fyd $$0, GameProfile $$1) {
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
   public boolean a(bqw $$0, float $$1) {
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

      if (this.cB > 0) {
         this.i(new evz((this.g.c - this.ds().c) / (double)this.cB, (this.g.d - this.ds().d) / (double)this.cB, (this.g.e - this.ds().e) / (double)this.cB));
         this.cB--;
      }

      this.cg = this.ch;
      this.eR();
      float $$1;
      if (this.aE() && !this.ex()) {
         $$1 = (float)Math.min(0.1, this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      this.dP().ag().a("push");
      this.q();
      this.dP().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new evz($$0, $$1, $$2);
      this.cB = this.ak().p() + 1;
   }

   @Override
   protected void fR() {
   }

   @Override
   public void a(wu $$0) {
      ffn $$1 = ffn.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.bu();
   }
}
