public class gqp extends gpq<chp, gvl, gak> {
   private static final ali a = ali.b("textures/entity/snow_golem.png");

   public gqp(gok.a $$0) {
      super($$0, new gak($$0.a(gbl.cw)), 0.5F);
      this.a(new gtc(this, $$0.d(), $$0.b()));
   }

   @Override
   public ali b(gvl $$0) {
      return a;
   }

   public gvl c() {
      return new gvl();
   }

   public void a(chp $$0, gvl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cwb(cwf.fl) : cwb.k;
      $$1.an = this.i.a($$1.ao, $$0, cvz.f);
   }
}
