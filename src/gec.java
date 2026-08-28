import com.mojang.authlib.GameProfile;

public class gec extends gdy {
   private exc g = exc.b;
   private int h;

   public gec(fzf $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
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
         this.j(new exc((this.g.c - this.dr().c) / (double)this.h, (this.g.d - this.dr().d) / (double)this.h, (this.g.e - this.dr().e) / (double)this.h));
         this.h--;
      }

      this.cg = this.ch;
      this.eR();
      float $$1;
      if (this.aF() && !this.ex()) {
         $$1 = (float)Math.min(0.1, this.dr().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      this.dO().ag().a("push");
      this.r();
      this.dO().ag().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new exc($$0, $$1, $$2);
      this.h = this.am().p() + 1;
   }

   @Override
   protected void fR() {
   }

   @Override
   public void a(wz $$0) {
      fgo $$1 = fgo.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.bv();
   }
}
