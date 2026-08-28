public class gox extends gny<cgt, gts, fza> {
   private static final alb a = alb.b("textures/entity/snow_golem.png");

   public gox(gms.a $$0) {
      super($$0, new fza($$0.a(gaa.cv)), 0.5F);
      this.a(new grk(this, $$0.d(), $$0.b()));
   }

   public alb g(gts $$0) {
      return a;
   }

   public gts c() {
      return new gts();
   }

   public void a(cgt $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cvl(cvo.fl) : cvl.k;
      $$1.an = this.i.a($$1.ao, $$0, cvi.f);
   }
}
