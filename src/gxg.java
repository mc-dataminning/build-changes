public class gxg extends gwq<cny, hdf, ggr> {
   private static final ale a = ale.b("textures/entity/illager/ravager.png");

   public gxg(gvk.a $$0) {
      super($$0, new ggr($$0.a(gif.cF)), 1.1F);
   }

   public ale a(hdf $$0) {
      return a;
   }

   public hdf b() {
      return new hdf();
   }

   public void a(cny $$0, hdf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.q() > 0.0F ? (float)$$0.q() - $$2 : 0.0F;
      $$1.b = (float)$$0.m() > 0.0F ? (float)$$0.m() - $$2 : 0.0F;
      if ($$0.gx() > 0) {
         $$1.c = ((float)(20 - $$0.gx()) + $$2) / 20.0F;
      } else {
         $$1.c = 0.0F;
      }
   }
}
