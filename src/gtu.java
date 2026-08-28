public class gtu extends gsu<ciu, gyr, gdk> {
   private static final alz a = alz.b("textures/entity/snow_golem.png");

   public gtu(gro.a $$0) {
      super($$0, new gdk($$0.a(gel.cP)), 0.5F);
      this.a(new gwi(this, $$0.d(), $$0.b()));
   }

   @Override
   public alz b(gyr $$0) {
      return a;
   }

   public gyr b() {
      return new gyr();
   }

   public void a(ciu $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.p() ? new cxo(cxs.fy) : cxo.k;
      $$1.an = this.i.a($$1.ao, $$0, cxm.f);
   }
}
