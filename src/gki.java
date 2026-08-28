import com.mojang.authlib.GameProfile;

public class gki extends gke {
   private fby h = fby.c;
   private int i;

   public gki(gfk $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean b(bua $$0) {
      return true;
   }

   @Override
   public void h() {
      super.h();
      this.s(false);
   }

   @Override
   public void d_() {
      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      if (this.i > 0) {
         this.i(new fby((this.h.d - this.dz().d) / (double)this.i, (this.h.e - this.dz().e) / (double)this.i, (this.h.f - this.dz().f) / (double)this.i));
         this.i--;
      }

      this.cg = this.ch;
      this.eX();
      float $$1;
      if (this.aJ() && !this.eF()) {
         $$1 = (float)Math.min(0.1, this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;

      try (bpy $$2 = bps.a().d("push")) {
         this.o();
      }
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.h = new fby($$0, $$1, $$2);
      this.i = this.aq().p() + 1;
   }

   @Override
   protected void gc() {
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      this.bz();
   }
}
