public class gxo extends gxc<cle, hed, ghh> {
   private static final ali a = ali.b("textures/entity/camel/camel.png");

   public gxo(gyi.a $$0) {
      super($$0, new ghh($$0.a(gld.M)), new ghh($$0.a(gld.N)), 0.7F);
      this.a(new hcz<>(this, $$0.h(), hng.d.i, $$0x -> $$0x.a, new ghi($$0.a(gld.O)), new ghi($$0.a(gld.P))));
   }

   public ali a(hed $$0) {
      return a;
   }

   public hed a() {
      return new hed();
   }

   public void a(cle $$0, hed $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxd.h).v();
      $$1.b = $$0.bZ();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bO);
      $$1.e.a($$0.bP);
      $$1.f.a($$0.bQ);
      $$1.g.a($$0.bR);
      $$1.h.a($$0.bS);
   }
}
