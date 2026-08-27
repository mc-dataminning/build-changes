import com.mojang.authlib.GameProfile;

public class fuo extends fuk {
   private ens g = ens.b;
   private int cq;

   public fuo(fpx $$0, GameProfile $$1) {
      super($$0, $$1);
      this.ae = true;
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
   public boolean a(bmn $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void d_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cq > 0) {
         this.h(new ens((this.g.c - this.dp().c) / (double)this.cq, (this.g.d - this.dp().d) / (double)this.cq, (this.g.e - this.dp().e) / (double)this.cq));
         this.cq--;
      }

      this.bZ = this.ca;
      this.eR();
      float $$1;
      if (this.aC() && !this.ex()) {
         $$1 = (float)Math.min(0.1, this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.ca = this.ca + ($$1 - this.ca) * 0.4F;
      this.dM().af().a("push");
      this.M_();
      this.dM().af().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.g = new ens($$0, $$1, $$2);
      this.cq = this.ai().p() + 1;
   }

   @Override
   protected void fM() {
   }

   @Override
   public void a(vq $$0) {
      exh $$1 = exh.O();
      $$1.l.d().a($$0);
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      this.bp();
   }
}
