public class grg extends gqq<cmd, gxd, gaw> {
   private static final alj a = alj.b("textures/entity/illager/ravager.png");

   public grg(gpk.a $$0) {
      super($$0, new gaw($$0.a(gck.cp)), 1.1F);
   }

   public alj a(gxd $$0) {
      return a;
   }

   public gxd b() {
      return new gxd();
   }

   public void a(cmd $$0, gxd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.gm() > 0.0F ? (float)$$0.gm() - $$2 : 0.0F;
      $$1.b = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      if ($$0.gw() > 0) {
         $$1.c = ((float)(20 - $$0.gw()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
