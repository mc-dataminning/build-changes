import com.mojang.authlib.GameProfile;

public class ghu extends ghq {
   private ezr i = ezr.c;
   private int j;

   public ghu(gcy $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cT().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cM();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
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
         this.i(new ezr((this.i.d - this.dB().d) / (double)this.j, (this.i.e - this.dB().e) / (double)this.j, (this.i.f - this.dB().f) / (double)this.j));
         this.j--;
      }

      this.cg = this.ch;
      this.fa();
      float $$1;
      if (this.aL() && !this.eI()) {
         $$1 = (float)Math.min(0.1, this.dB().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;

      try (bow $$2 = boq.a().d("push")) {
         this.r();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.i = new ezr($$0, $$1, $$2);
      this.j = this.ar().p() + 1;
   }

   @Override
   protected void gf() {
   }

   @Override
   public void a(xl $$0) {
      fjx $$1 = fjx.Q();
      $$1.m.d().a($$0);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.bB();
   }
}
