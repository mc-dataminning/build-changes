public class glx extends glz<cjc, fwl<cjc>> {
   private static final akt a = new akt("textures/entity/slime/mega_spud.png");

   public glx(gkq.a $$0) {
      super($$0, new fwl<>($$0.a(fyr.by)), 0.25F);
      this.a(new gpb<>(this, $$0.f()));
      this.a(new gpa(this, $$0.f()));
   }

   public void a(cjc $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      this.e = 0.25F * (float)$$0.t();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cjc $$0, fbc $$1, float $$2) {
      float $$3 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$4 = (float)$$0.t();
      float $$5 = aym.i($$2, $$0.d, $$0.c) / ($$4 * 0.5F + 1.0F);
      float $$6 = 1.0F / ($$5 + 1.0F);
      $$1.b($$6 * $$4, 1.5F / $$6 * $$4, $$6 * $$4);
   }

   public akt a(cjc $$0) {
      return a;
   }
}
