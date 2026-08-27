import com.mojang.authlib.GameProfile;

public class gbn extends gbj {
   private euk g = euk.b;
   private int h;

   public gbn(fwr $$0, GameProfile $$1) {
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
   public boolean a(bqn $$0, float $$1) {
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
         this.h(new euk((this.g.c - this.ds().c) / (double)this.h, (this.g.d - this.ds().d) / (double)this.h, (this.g.e - this.ds().e) / (double)this.h));
         this.h--;
      }

      this.cf = this.cg;
      this.eV();
      float $$1;
      if (this.aE() && !this.eB()) {
         $$1 = (float)Math.min(0.1, this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      this.dP().af().a("push");
      this.q();
      this.dP().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new euk($$0, $$1, $$2);
      this.h = this.ak().p() + 1;
   }

   @Override
   protected void fV() {
   }

   @Override
   public void a(wx $$0) {
      fdz $$1 = fdz.Q();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      this.bu();
   }
}
