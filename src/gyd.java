public class gyd extends gxn<coi, hed, ghm> {
   private static final alg a = alg.b("textures/entity/illager/ravager.png");

   public gyd(gwh.a $$0) {
      super($$0, new ghm($$0.a(gjb.cJ)), 1.1F);
   }

   public alg a(hed $$0) {
      return a;
   }

   public hed b() {
      return new hed();
   }

   public void a(coi $$0, hed $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gy() > 0) {
         $$1.c = ((float)(20 - $$0.gy()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
