public class gis extends gkm<ceu, fty<ceu>> {
   private static final akk a = new akk("textures/entity/fish/cod.png");

   public gis(gjg.a $$0) {
      super($$0, new fty<>($$0.a(fxh.A)), 0.3F);
   }

   public akk a(ceu $$0) {
      return a;
   }

   protected void a(ceu $$0, fag $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aye.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
