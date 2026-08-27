import com.mojang.authlib.GameProfile;

public class fwv extends fwr {
   private ept g = ept.b;
   private int cu;

   public fwv(fsa $$0, GameProfile $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void m_() {
      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      if (this.cu > 0) {
         this.h(new ept((this.g.c - this.dp().c) / (double)this.cu, (this.g.d - this.dp().d) / (double)this.cu, (this.g.e - this.dp().e) / (double)this.cu));
         this.cu--;
      }

      this.cc = this.cd;
      this.eS();
      float $$1;
      if (this.aC() && !this.ey()) {
         $$1 = (float)Math.min(0.1, this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.cd = this.cd + ($$1 - this.cd) * 0.4F;
      this.dM().ae().a("push");
      this.q();
      this.dM().ae().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new ept($$0, $$1, $$2);
      this.cu = this.ai().p() + 1;
   }

   @Override
   protected void fS() {
   }

   @Override
   public void a(vu $$0) {
      ezi $$1 = ezi.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.bs();
   }
}
