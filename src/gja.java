public class gja extends gku<cey, fug<cey>> {
   private static final akk a = new akk("textures/entity/fish/cod.png");

   public gja(gjo.a $$0) {
      super($$0, new fug<>($$0.a(fxp.A)), 0.3F);
   }

   public akk a(cey $$0) {
      return a;
   }

   protected void a(cey $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayg.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bg()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
