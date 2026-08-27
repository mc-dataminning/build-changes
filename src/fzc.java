import com.mojang.authlib.GameProfile;

public class fzc extends fyy {
   private esa g = esa.b;
   private int ct;

   public fzc(fuh $$0, GameProfile $$1) {
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
   public boolean a(bot $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void n_() {
      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      if (this.ct > 0) {
         this.h(new esa((this.g.c - this.dp().c) / (double)this.ct, (this.g.d - this.dp().d) / (double)this.ct, (this.g.e - this.dp().e) / (double)this.ct));
         this.ct--;
      }

      this.cb = this.cc;
      this.eS();
      float $$1;
      if (this.aC() && !this.ey()) {
         $$1 = (float)Math.min(0.1, this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.cc = this.cc + ($$1 - this.cc) * 0.4F;
      this.dM().af().a("push");
      this.q();
      this.dM().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new esa($$0, $$1, $$2);
      this.ct = this.ai().p() + 1;
   }

   @Override
   protected void fS() {
   }

   @Override
   public void a(wg $$0) {
      fbp $$1 = fbp.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(aaz $$0) {
      super.a($$0);
      this.bs();
   }
}
