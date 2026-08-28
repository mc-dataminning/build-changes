public class gih extends gkb<cfj, fto<cfj>> {
   private static final ale a = new ale("textures/entity/fish/cod.png");

   public gih(giv.a $$0) {
      super($$0, new fto<>($$0.a(fwx.A)), 0.3F);
   }

   public ale a(cfj $$0) {
      return a;
   }

   protected void a(cfj $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayx.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
