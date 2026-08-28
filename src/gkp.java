public class gkp extends gjy<cfv, fvj<cfv>> {
   private static final alb a = new alb("textures/entity/fish/salmon.png");

   public gkp(gis.a $$0) {
      super($$0, new fvj<>($$0.a(fwu.bg)), 0.4F);
   }

   public alb a(cfv $$0) {
      return a;
   }

   protected void a(cfv $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.be()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      float $$8 = $$6 * 4.3F * ayu.a($$7 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$8));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
