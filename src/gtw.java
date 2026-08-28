public class gtw extends gsw<civ, gyt, gdm> {
   private static final alz a = alz.b("textures/entity/snow_golem.png");

   public gtw(grq.a $$0) {
      super($$0, new gdm($$0.a(gen.cP)), 0.5F);
      this.a(new gwk(this, $$0.d(), $$0.b()));
   }

   @Override
   public alz b(gyt $$0) {
      return a;
   }

   public gyt b() {
      return new gyt();
   }

   public void a(civ $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.p() ? new cxp(cxt.fy) : cxp.j;
      $$1.an = this.i.a($$1.ao, $$0, cxn.f);
   }
}
