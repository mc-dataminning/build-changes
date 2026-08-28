public class gwi extends grx<civ, hbz, gfr> {
   public gwi(gtd.a $$0) {
      super($$0, new gfr($$0.a(ggb.dJ)), new gfr($$0.a(ggb.dL)), 0.5F);
      this.a(new gyg(this, $$0.f(), $$0.h()));
      this.a(new gyh(this));
   }

   protected int a(hbz $$0) {
      float $$1 = $$0.f;
      return $$1 == 1.0F ? -1 : axk.a(1.0F, $$1, $$1, $$1);
   }

   public aku b(hbz $$0) {
      return $$0.g;
   }

   public hbz b() {
      return new hbz();
   }

   public void a(civ $$0, hbz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.Z_();
      $$1.b = $$0.x();
      $$1.c = $$0.gH();
      $$1.d = $$0.M($$2);
      $$1.e = $$0.L($$2);
      $$1.g = $$0.gE();
      $$1.f = $$0.K($$2);
      $$1.h = $$0.q() ? $$0.gI() : null;
      $$1.i = $$0.aj().v();
   }
}
