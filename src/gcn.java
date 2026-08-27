public class gcn extends geh<cbk, fnu<cbk>> {
   private static final ajh a = new ajh("textures/entity/fish/cod.png");

   public gcn(gdb.a $$0) {
      super($$0, new fnu<>($$0.a(fre.A)), 0.3F);
   }

   public ajh a(cbk $$0) {
      return a;
   }

   protected void a(cbk $$0, eub $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aww.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
