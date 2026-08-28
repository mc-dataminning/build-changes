import com.mojang.authlib.GameProfile;

public class gdi extends gde {
   private ewh g = ewh.b;
   private int h;

   public gdi(fyl $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cF();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
   }

   @Override
   public void m_() {
      if (this.bs > 0) {
         this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
         this.bs--;
      }

      if (this.bz > 0) {
         this.a(this.bz, this.by);
         this.bz--;
      }

      if (this.h > 0) {
         this.k(new ewh((this.g.c - this.du().c) / (double)this.h, (this.g.d - this.du().d) / (double)this.h, (this.g.e - this.du().e) / (double)this.h));
         this.h--;
      }

      this.ch = this.ci;
      this.eT();
      float $$1;
      if (this.aG() && !this.ez()) {
         $$1 = (float)Math.min(0.1, this.du().h());
      } else {
         $$1 = 0.0F;
      }

      this.ci = this.ci + ($$1 - this.ci) * 0.4F;
      this.dR().ag().a("push");
      this.r();
      this.dR().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new ewh($$0, $$1, $$2);
      this.h = this.am().p() + 1;
   }

   @Override
   protected void fT() {
   }

   @Override
   public void a(wu $$0) {
      ffw $$1 = ffw.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.bw();
   }
}
