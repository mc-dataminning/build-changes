public class gvn<T extends cod> extends gwd<T, hbs> {
   private static final ale a = ale.b("textures/entity/illager/evoker.png");

   public gvn(gvk.a $$0) {
      super($$0, new gfs<>($$0.a(gif.aR)), 0.5F);
      this.a(new gzq<hbs, gfs<hbs>>(this) {
         public void a(fiq $$0, gpd $$1, int $$2, hbs $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public ale a(hbs $$0) {
      return a;
   }

   public hbs b() {
      return new hbs();
   }

   public void a(T $$0, hbs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gx();
   }
}
