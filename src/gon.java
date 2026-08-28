public class gon extends gny<cla, guj, fyn> {
   private static final alb a = alb.b("textures/entity/illager/ravager.png");

   public gon(gms.a $$0) {
      super($$0, new fyn($$0.a(gaa.bY)), 1.1F);
   }

   public alb a(guj $$0) {
      return a;
   }

   public guj c() {
      return new guj();
   }

   public void a(cla $$0, guj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.go() > 0.0F ? (float)$$0.go() - $$2 : 0.0F;
      $$1.b = (float)$$0.t() > 0.0F ? (float)$$0.t() - $$2 : 0.0F;
      if ($$0.gy() > 0) {
         $$1.c = ((float)(20 - $$0.gy()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
