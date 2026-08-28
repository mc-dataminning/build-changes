public class ham extends gzo<cpi, hgl, gjz> {
   public static final ali a = ali.b("textures/entity/slime/slime.png");

   public ham(gyi.a $$0) {
      super($$0, new gjz($$0.a(gld.dg)), 0.25F);
      this.a(new hdb(this, $$0.f()));
   }

   protected float a(hgl $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hgl $$0, flo $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public ali b(hgl $$0) {
      return a;
   }

   public hgl b() {
      return new hgl();
   }

   public void a(cpi $$0, hgl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azo.h($$2, $$0.f, $$0.e);
      $$1.b = $$0.gs();
   }
}
