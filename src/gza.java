public class gza extends gzy<hbf, geo> {
   private static final ale a = ale.b("textures/entity/cat/cat_collar.png");
   private final geo b;
   private final geo c;

   public gza(gxh<hbf, geo> $$0, gic $$1) {
      super($$0);
      this.b = new geo($$1.a(gif.T));
      this.c = new geo($$1.a(gif.S));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hbf $$3, float $$4, float $$5) {
      cxq $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         geo $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
