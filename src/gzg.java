public class gzg extends gzy<hef, gey> {
   private static final ale a = ale.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gey b;
   private final gey c;

   public gzg(gxh<hef, gey> $$0, gic $$1) {
      super($$0);
      this.b = new gey($$1.a(gif.aJ));
      this.c = new gey($$1.a(gif.aG));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hef $$3, float $$4, float $$5) {
      gey $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
