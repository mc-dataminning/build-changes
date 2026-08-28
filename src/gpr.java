public class gpr extends gou<clm, gvm, fzm> {
   public static final ale a = ale.b("textures/entity/slime/slime.png");

   public gpr(gno.a $$0) {
      super($$0, new fzm($$0.a(gap.cs)), 0.25F);
      this.a(new gsf(this, $$0.f()));
   }

   public void a(gvm $$0, fdi $$1, ghl $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvm $$0, fdi $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public ale a(gvm $$0) {
      return a;
   }

   public gvm c() {
      return new gvm();
   }

   public void a(clm $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azf.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gp();
   }
}
