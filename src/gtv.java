public class gtv extends gsv<ciu, gys, gdl> {
   private static final alz a = alz.b("textures/entity/snow_golem.png");

   public gtv(grp.a $$0) {
      super($$0, new gdl($$0.a(gem.cP)), 0.5F);
      this.a(new gwj(this, $$0.d(), $$0.b()));
   }

   @Override
   public alz b(gys $$0) {
      return a;
   }

   public gys b() {
      return new gys();
   }

   public void a(ciu $$0, gys $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.p() ? new cxo(cxs.fy) : cxo.j;
      $$1.an = this.i.a($$1.ao, $$0, cxm.f);
   }
}
