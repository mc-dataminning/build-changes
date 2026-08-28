public class grq extends gqq<chw, gwm, gbj> {
   private static final alj a = alj.b("textures/entity/snow_golem.png");

   public grq(gpk.a $$0) {
      super($$0, new gbj($$0.a(gck.cM)), 0.5F);
      this.a(new gud(this, $$0.d(), $$0.b()));
   }

   @Override
   public alj b(gwm $$0) {
      return a;
   }

   public gwm b() {
      return new gwm();
   }

   public void a(chw $$0, gwm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.q() ? new cwm(cwq.fl) : cwm.k;
      $$1.an = this.i.a($$1.ao, $$0, cwk.f);
   }
}
