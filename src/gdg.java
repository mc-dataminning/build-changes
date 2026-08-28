import com.mojang.authlib.GameProfile;

public class gdg extends gdc {
   private ewf g = ewf.b;
   private int cB;

   public gdg(fyj $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cE();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
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
         this.j(new ewf((this.g.c - this.dt().c) / (double)this.cB, (this.g.d - this.dt().d) / (double)this.cB, (this.g.e - this.dt().e) / (double)this.cB));
         this.cB--;
      }

      this.cg = this.ch;
      this.eS();
      float $$1;
      if (this.aF() && !this.ey()) {
         $$1 = (float)Math.min(0.1, this.dt().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      this.dQ().ag().a("push");
      this.q();
      this.dQ().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new ewf($$0, $$1, $$2);
      this.cB = this.al().p() + 1;
   }

   @Override
   protected void fS() {
   }

   @Override
   public void a(wu $$0) {
      fft $$1 = fft.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.bv();
   }
}
