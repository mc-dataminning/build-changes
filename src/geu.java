public class geu extends ggo<ccj, fqc<ccj>> {
   private static final ajt a = new ajt("textures/entity/fish/cod.png");

   public geu(gfi.a $$0) {
      super($$0, new fqc<>($$0.a(ftl.A)), 0.3F);
   }

   public ajt a(ccj $$0) {
      return a;
   }

   protected void a(ccj $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axk.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
