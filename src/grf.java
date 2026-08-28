public class grf extends gqg<cht, gwb, gba> {
   private static final all a = all.b("textures/entity/snow_golem.png");

   public grf(gpa.a $$0) {
      super($$0, new gba($$0.a(gcb.cw)), 0.5F);
      this.a(new gts(this, $$0.d(), $$0.b()));
   }

   @Override
   public all b(gwb $$0) {
      return a;
   }

   public gwb c() {
      return new gwb();
   }

   public void a(cht $$0, gwb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.t() ? new cwf(cwj.fl) : cwf.k;
      $$1.an = this.i.a($$1.ao, $$0, cwd.f);
   }
}
