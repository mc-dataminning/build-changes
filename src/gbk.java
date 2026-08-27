public class gbk extends gde<cas, fmu<cas>> {
   private static final ajc a = new ajc("textures/entity/fish/cod.png");

   public gbk(gby.a $$0) {
      super($$0, new fmu<>($$0.a(fqe.w)), 0.3F);
   }

   public ajc a(cas $$0) {
      return a;
   }

   protected void a(cas $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * awm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
