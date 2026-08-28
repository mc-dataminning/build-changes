public class gtl extends gsv<cnb, gzj, gcy> {
   private static final alz a = alz.b("textures/entity/illager/ravager.png");

   public gtl(grp.a $$0) {
      super($$0, new gcy($$0.a(gem.cs)), 1.1F);
   }

   public alz a(gzj $$0) {
      return a;
   }

   public gzj b() {
      return new gzj();
   }

   public void a(cnb $$0, gzj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
