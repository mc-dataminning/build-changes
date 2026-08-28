public class gxx extends gxz<coj, hev, ghb> {
   private static final alg a = alg.b("textures/entity/slime/magmacube.png");

   public gxx(gwt.a $$0) {
      super($$0, new ghb($$0.a(gjn.bJ)), 0.25F);
   }

   protected int a(coj $$0, iv $$1) {
      return 15;
   }

   public alg a(hev $$0) {
      return a;
   }

   public hev b() {
      return new hev();
   }

   public void a(coj $$0, hev $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bG, $$0.bF);
      $$1.b = $$0.gr();
   }

   protected float b(hev $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hev $$0, fjy $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
