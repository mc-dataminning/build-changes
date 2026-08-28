import com.mojang.authlib.GameProfile;

public class gdw extends gds {
   private eww g = eww.b;
   private int h;

   public gdw(fyz $$0, GameProfile $$1) {
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
   public boolean a(brj $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.s(false);
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
         this.j(new eww((this.g.c - this.dt().c) / (double)this.h, (this.g.d - this.dt().d) / (double)this.h, (this.g.e - this.dt().e) / (double)this.h));
         this.h--;
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
      this.r();
      this.dQ().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new eww($$0, $$1, $$2);
      this.h = this.am().p() + 1;
   }

   @Override
   protected void fS() {
   }

   @Override
   public void a(wy $$0) {
      fgi $$1 = fgi.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      this.bv();
   }
}
