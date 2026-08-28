public class gmz extends gou<cgj, guo, fxe> {
   private static final ale a = ale.b("textures/entity/fish/cod.png");

   public gmz(gno.a $$0) {
      super($$0, new fxe($$0.a(gap.O)), 0.3F);
   }

   @Override
   public ale b(guo $$0) {
      return a;
   }

   public guo a() {
      return new guo();
   }

   @Override
   protected void a(guo $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azf.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
