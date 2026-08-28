public class gtk extends gsu<cnb, gzi, gcx> {
   private static final alz a = alz.b("textures/entity/illager/ravager.png");

   public gtk(gro.a $$0) {
      super($$0, new gcx($$0.a(gel.cs)), 1.1F);
   }

   public alz a(gzi $$0) {
      return a;
   }

   public gzi b() {
      return new gzi();
   }

   public void a(cnb $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.x() > 0.0F ? (float)$$0.x() - $$2 : 0.0F;
      $$1.b = (float)$$0.p() > 0.0F ? (float)$$0.p() - $$2 : 0.0F;
      if ($$0.gv() > 0) {
         $$1.c = ((float)(20 - $$0.gv()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
