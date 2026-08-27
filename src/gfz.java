public class gfz extends ght<ccz, frh<ccz>> {
   private static final akf a = new akf("textures/entity/fish/cod.png");

   public gfz(ggn.a $$0) {
      super($$0, new frh<>($$0.a(fuq.A)), 0.3F);
   }

   public akf a(ccz $$0) {
      return a;
   }

   protected void a(ccz $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axw.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
