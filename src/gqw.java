public class gqw extends gpf<cnz, gwl, gal> {
   private static final alh a = alh.b("textures/entity/wandering_trader.png");

   public gqw(gnz.a $$0) {
      super($$0, new gal($$0.a(gba.cW)), 0.5F);
      this.a(new grr<>(this, $$0.f(), $$0.b()));
      this.a(new grq<>(this, $$0.b()));
   }

   public alh a(gwl $$0) {
      return a;
   }

   protected void a(gwl $$0, fdt $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gwl c() {
      return new gwl();
   }

   public void a(cnz $$0, gwl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
