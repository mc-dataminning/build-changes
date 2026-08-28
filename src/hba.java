public class hba extends gwp<cmx, hgu, gkg> {
   public hba(gxv.a $$0) {
      super($$0, new gkg($$0.a(gkq.eb)), new gkg($$0.a(gkq.ed)), 0.5F);
      this.a(new hcy(this, $$0.f(), $$0.h()));
      this.a(new hcz(this));
   }

   protected int a(hgu $$0) {
      float $$1 = $$0.f;
      return $$1 == 1.0F ? -1 : ayh.a(1.0F, $$1, $$1, $$1);
   }

   public alr b(hgu $$0) {
      return $$0.g;
   }

   public hgu b() {
      return new hgu();
   }

   public void a(cmx $$0, hgu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.af_();
      $$1.b = $$0.x();
      $$1.c = $$0.gI();
      $$1.d = $$0.L($$2);
      $$1.e = $$0.K($$2);
      $$1.g = $$0.gG();
      $$1.f = $$0.J($$2);
      $$1.h = $$0.q() ? $$0.gJ() : null;
      $$1.i = $$0.fY().v();
   }
}
