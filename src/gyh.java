public class gyh extends gwd<coi, hch> {
   private static final ale a = ale.b("textures/entity/illager/vindicator.png");

   public gyh(gvk.a $$0) {
      super($$0, new gfs<>($$0.a(gif.dH)), 0.5F);
      this.a(new gzq<hch, gfs<hch>>(this) {
         public void a(fiq $$0, gpd $$1, int $$2, hch $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ale a(hch $$0) {
      return a;
   }

   public hch b() {
      return new hch();
   }
}
