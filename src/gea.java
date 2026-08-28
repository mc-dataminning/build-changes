import com.mojang.authlib.GameProfile;

public class gea extends gdw {
   private exa g = exa.b;
   private int h;

   public gea(fzd $$0, GameProfile $$1) {
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
   public boolean a(brk $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.r(false);
   }

   @Override
   public void m_() {
      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      if (this.h > 0) {
         this.j(new exa((this.g.c - this.ds().c) / (double)this.h, (this.g.d - this.ds().d) / (double)this.h, (this.g.e - this.ds().e) / (double)this.h));
         this.h--;
      }

      this.cg = this.ch;
      this.eS();
      float $$1;
      if (this.aF() && !this.ey()) {
         $$1 = (float)Math.min(0.1, this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      this.dP().ag().a("push");
      this.r();
      this.dP().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new exa($$0, $$1, $$2);
      this.h = this.am().p() + 1;
   }

   @Override
   protected void fS() {
   }

   @Override
   public void a(wz $$0) {
      fgm $$1 = fgm.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.bv();
   }
}
