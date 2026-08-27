import com.mojang.authlib.GameProfile;

public class gah extends gad {
   private etf g = etf.b;
   private int h;

   public gah(fvm $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cB();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.r(false);
   }

   @Override
   public void n_() {
      if (this.bs > 0) {
         this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
         this.bs--;
      }

      if (this.bz > 0) {
         this.a(this.bz, this.by);
         this.bz--;
      }

      if (this.h > 0) {
         this.h(new etf((this.g.c - this.dq().c) / (double)this.h, (this.g.d - this.dq().d) / (double)this.h, (this.g.e - this.dq().e) / (double)this.h));
         this.h--;
      }

      this.cf = this.cg;
      this.eT();
      float $$1;
      if (this.aC() && !this.ez()) {
         $$1 = (float)Math.min(0.1, this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      this.dN().af().a("push");
      this.q();
      this.dN().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new etf($$0, $$1, $$2);
      this.h = this.ai().p() + 1;
   }

   @Override
   protected void fT() {
   }

   @Override
   public void a(ws $$0) {
      fcu $$1 = fcu.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.bs();
   }
}
