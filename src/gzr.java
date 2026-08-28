public class gzr extends gzb<cpp, hfu, gjb> {
   private static final alr a = alr.b("textures/entity/illager/ravager.png");

   public gzr(gxv.a $$0) {
      super($$0, new gjb($$0.a(gkq.cJ)), 1.1F);
   }

   public alr a(hfu $$0) {
      return a;
   }

   public hfu b() {
      return new hfu();
   }

   public void a(cpp $$0, hfu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gB() > 0) {
         $$1.c = ((float)(20 - $$0.gB()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
