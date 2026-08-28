public class gzw extends gzo<cpb, hfy, gja> {
   private static final ali a = ali.b("textures/entity/phantom.png");

   public gzw(gyi.a $$0) {
      super($$0, new gja($$0.a(gld.cc)), 0.75F);
      this.a(new hcu(this));
   }

   public ali a(hfy $$0) {
      return a;
   }

   public hfy b() {
      return new hfy();
   }

   public void a(cpb $$0, hfy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hfy $$0, flo $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hfy $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
