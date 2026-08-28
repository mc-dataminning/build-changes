public class gra extends goj<ckw, gwr> {
   private final gjk a;

   public gra(gok.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public void a(gwr $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.5F, 0.0F);
      float $$4 = $$0.a;
      if ($$0.a < 10.0F) {
         float $$5 = 1.0F - $$0.a / 10.0F;
         $$5 = azk.a($$5, 0.0F, 1.0F);
         $$5 *= $$5;
         $$5 *= $$5;
         float $$6 = 1.0F + $$5 * 0.3F;
         $$1.b($$6, $$6, $$6);
      }

      $$1.a(a.d.rotationDegrees(-90.0F));
      $$1.a(-0.5F, -0.5F, 0.5F);
      $$1.a(a.d.rotationDegrees(90.0F));
      if ($$0.b != null) {
         gqz.a(this.a, $$0.b, $$1, $$2, $$3, (int)$$4 / 5 % 2 == 0);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwr a() {
      return new gwr();
   }

   public void a(ckw $$0, gwr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.o() - $$2 + 1.0F;
      $$1.b = $$0.q();
   }
}
