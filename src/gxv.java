public class gxv extends gxf<coe, hdv, ghe> {
   private static final alg a = alg.b("textures/entity/illager/ravager.png");

   public gxv(gvz.a $$0) {
      super($$0, new ghe($$0.a(git.cH)), 1.1F);
   }

   public alg a(hdv $$0) {
      return a;
   }

   public hdv b() {
      return new hdv();
   }

   public void a(coe $$0, hdv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
