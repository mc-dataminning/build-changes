public class gex extends geh<cbz, fpt<cbz>> {
   private static final ajh a = new ajh("textures/entity/fish/salmon.png");

   public gex(gdb.a $$0) {
      super($$0, new fpt<>($$0.a(fre.bg)), 0.4F);
   }

   public ajh a(cbz $$0) {
      return a;
   }

   protected void a(cbz $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.bc()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      float $$8 = $$6 * 4.3F * aww.a($$7 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$8));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
