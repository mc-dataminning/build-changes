public class hau extends hbm<hfv, ggk> {
   private static final alg a = alg.b("textures/entity/zombie/drowned_outer_layer.png");
   private final ggk b;
   private final ggk c;

   public hau(gyv<hfv, ggk> $$0, gjp $$1) {
      super($$0);
      this.b = new ggk($$1.a(gjs.aN));
      this.c = new ggk($$1.a(gjs.aK));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfv $$3, float $$4, float $$5) {
      ggk $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
