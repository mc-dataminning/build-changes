public class gtr extends gsr<cim, gyo, gdh> {
   private static final alp a = alp.b("textures/entity/snow_golem.png");

   public gtr(grl.a $$0) {
      super($$0, new gdh($$0.a(gei.cS)), 0.5F);
      this.a(new gwf(this, $$0.d(), $$0.b()));
   }

   @Override
   public alp b(gyo $$0) {
      return a;
   }

   public gyo b() {
      return new gyo();
   }

   public void a(cim $$0, gyo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.p() ? new cxg(cxk.fA) : cxg.j;
      $$1.an = this.i.a($$1.ao, $$0, cxe.f);
   }
}
