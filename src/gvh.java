public class gvh extends gqw<cia, hay, ger> {
   public gvh(gsc.a $$0) {
      super($$0, new ger($$0.a(gfb.dH)), new ger($$0.a(gfb.dJ)), 0.5F);
      this.a(new gxf(this, $$0.f(), $$0.h()));
      this.a(new gxg(this));
   }

   protected int a(hay $$0) {
      float $$1 = $$0.f;
      return $$1 == 1.0F ? -1 : axk.a(1.0F, $$1, $$1, $$1);
   }

   public aku b(hay $$0) {
      return $$0.g;
   }

   public hay b() {
      return new hay();
   }

   public void a(cia $$0, hay $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ac_();
      $$1.b = $$0.x();
      $$1.c = $$0.gE();
      $$1.d = $$0.L($$2);
      $$1.e = $$0.K($$2);
      $$1.g = $$0.gB();
      $$1.f = $$0.J($$2);
      $$1.h = $$0.p() ? $$0.gF() : null;
      $$1.i = $$0.ag().v();
   }
}
