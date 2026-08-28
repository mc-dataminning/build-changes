public class gwu extends gvj<bxf, hck> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final heq h;
   private final azt i = azt.a();

   protected gwu(gvk.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hck a() {
      return new hck();
   }

   public void a(bxf $$0, hck $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cys $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hck $$0, fiq $$1, gpd $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azk.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gwg.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
