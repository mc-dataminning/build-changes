public class ghe extends ggo<ccy, fsa<ccy>> {
   private static final ajt a = new ajt("textures/entity/fish/salmon.png");

   public ghe(gfi.a $$0) {
      super($$0, new fsa<>($$0.a(ftl.bg)), 0.4F);
   }

   public ajt a(ccy $$0) {
      return a;
   }

   protected void a(ccy $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.bc()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      float $$8 = $$6 * 4.3F * axk.a($$7 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$8));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
