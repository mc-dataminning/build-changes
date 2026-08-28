import com.mojang.authlib.GameProfile;

public class ghe extends gha {
   private ezn i = ezn.c;
   private int j;

   public ghe(gci $$0, GameProfile $$1) {
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
   public boolean a(bsu $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
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

      if (this.j > 0) {
         this.i(new ezn((this.i.d - this.dA().d) / (double)this.j, (this.i.e - this.dA().e) / (double)this.j, (this.i.f - this.dA().f) / (double)this.j));
         this.j--;
      }

      this.cg = this.ch;
      this.eZ();
      float $$1;
      if (this.aK() && !this.eH()) {
         $$1 = (float)Math.min(0.1, this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;

      try (bos $$2 = bom.a().d("push")) {
         this.r();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.i = new ezn($$0, $$1, $$2);
      this.j = this.ar().p() + 1;
   }

   @Override
   protected void ge() {
   }

   @Override
   public void a(xi $$0) {
      fji $$1 = fji.Q();
      $$1.m.d().a($$0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.bA();
   }
}
