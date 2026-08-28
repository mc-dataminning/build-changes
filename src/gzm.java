public class gzm extends gzo<coy, hgl, gir> {
   private static final ali a = ali.b("textures/entity/slime/magmacube.png");

   public gzm(gyi.a $$0) {
      super($$0, new gir($$0.a(gld.bJ)), 0.25F);
   }

   protected int a(coy $$0, iv $$1) {
      return 15;
   }

   public ali a(hgl $$0) {
      return a;
   }

   public hgl b() {
      return new hgl();
   }

   public void a(coy $$0, hgl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azo.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gs();
   }

   protected float b(hgl $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgl $$0, flo $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
