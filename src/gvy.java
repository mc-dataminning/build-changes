public class gvy extends gwr<haz, gbv> {
   private static final aku a = aku.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbv b;
   private final gbv c;

   public gvy(gtz<haz, gbv> $$0, gey $$1) {
      super($$0);
      this.b = new gbv($$1.a(gfb.aD));
      this.c = new gbv($$1.a(gfb.aA));
   }

   public void a(ffu $$0, glx $$1, int $$2, haz $$3, float $$4, float $$5) {
      gbv $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
