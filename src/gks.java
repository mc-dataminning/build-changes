public class gks extends gkb<cfy, fvm<cfy>> {
   private static final ale a = new ale("textures/entity/fish/salmon.png");

   public gks(giv.a $$0) {
      super($$0, new fvm<>($$0.a(fwx.bg)), 0.4F);
   }

   public ale a(cfy $$0) {
      return a;
   }

   protected void a(cfy $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.be()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      float $$8 = $$6 * 4.3F * ayx.a($$7 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$8));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
