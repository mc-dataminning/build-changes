import com.mojang.authlib.GameProfile;

public class gej extends gef {
   private ewu g = ewu.b;
   private int h;

   public gej(fzn $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ah = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cI();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.r(false);
   }

   @Override
   public void m_() {
      if (this.bC > 0) {
         this.a(this.bC, this.bD, this.bE, this.bF, this.bG, this.bH);
         this.bC--;
      }

      if (this.bJ > 0) {
         this.a(this.bJ, this.bI);
         this.bJ--;
      }

      if (this.h > 0) {
         this.h(new ewu((this.g.c - this.dx().c) / (double)this.h, (this.g.d - this.dx().d) / (double)this.h, (this.g.e - this.dx().e) / (double)this.h));
         this.h--;
      }

      this.ct = this.cu;
      this.fe();
      float $$1;
      if (this.aE() && !this.eJ()) {
         $$1 = (float)Math.min(0.1, this.dx().h());
      } else {
         $$1 = 0.0F;
      }

      this.cu = this.cu + ($$1 - this.cu) * 0.4F;
      this.dU().ag().a("push");
      this.s();
      this.dU().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new ewu($$0, $$1, $$2);
      this.h = this.ak().p() + 1;
   }

   @Override
   protected void ge() {
   }

   @Override
   public void a(xe $$0) {
      fgj $$1 = fgj.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.bz();
   }
}
