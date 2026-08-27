public class gae extends gby<bzz, flr<bzz>> {
   private static final aiy a = new aiy("textures/entity/fish/cod.png");

   public gae(gas.a $$0) {
      super($$0, new flr<>($$0.a(fpb.w)), 0.3F);
   }

   public aiy a(bzz $$0) {
      return a;
   }

   protected void a(bzz $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * awh.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
