public class gii extends gkc<cfk, ftp<cfk>> {
   private static final ale a = new ale("textures/entity/fish/cod.png");

   public gii(giw.a $$0) {
      super($$0, new ftp<>($$0.a(fwy.A)), 0.3F);
   }

   public ale a(cfk $$0) {
      return a;
   }

   protected void a(cfk $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayy.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
