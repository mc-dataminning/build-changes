public class gpt extends gou<chb, guo, fzo> {
   private static final ale a = ale.b("textures/entity/snow_golem.png");

   public gpt(gno.a $$0) {
      super($$0, new fzo($$0.a(gap.cw)), 0.5F);
      this.a(new gsg(this, $$0.d(), $$0.b()));
   }

   @Override
   public ale b(guo $$0) {
      return a;
   }

   public guo c() {
      return new guo();
   }

   public void a(chb $$0, guo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cvs(cvw.fl) : cvs.k;
      $$1.an = this.i.a($$1.ao, $$0, cvp.f);
   }
}
