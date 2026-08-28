public class gqv extends gqg<cma, gws, gan> {
   private static final all a = all.b("textures/entity/illager/ravager.png");

   public gqv(gpa.a $$0) {
      super($$0, new gan($$0.a(gcb.bZ)), 1.1F);
   }

   public all a(gws $$0) {
      return a;
   }

   public gws c() {
      return new gws();
   }

   public void a(cma $$0, gws $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.gv() > 0.0F ? (float)$$0.gv() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gF() > 0) {
         $$1.c = ((float)(20 - $$0.gF()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
