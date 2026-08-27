public class fuy extends fui<bvh, fgm<bvh>> {
   private static final aeu a = new aeu("textures/entity/fish/salmon.png");

   public fuy(ftc.a $$0) {
      super($$0, new fgm<>($$0.a(fhw.ba)), 0.4F);
   }

   public aeu a(bvh $$0) {
      return a;
   }

   protected void a(bvh $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      if (!$$0.aX()) {
         $$5 = 1.3F;
         $$6 = 1.7F;
      }

      float $$7 = $$5 * 4.3F * ars.a($$6 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
