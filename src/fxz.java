public class fxz extends fzt<bye, fjn<bye>> {
   private static final ahg a = new ahg("textures/entity/fish/cod.png");

   public fxz(fyn.a $$0) {
      super($$0, new fjn<>($$0.a(fmw.x)), 0.3F);
   }

   public ahg a(bye $$0) {
      return a;
   }

   protected void a(bye $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * auo.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
