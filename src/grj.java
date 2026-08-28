public class grj extends gsb<gwf, fxj> {
   private static final ale a = ale.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fxj b;
   private final fxj c;

   public grj(gpk<gwf, fxj> $$0, gam $$1) {
      super($$0);
      this.b = new fxj($$1.a(gap.al));
      this.c = new fxj($$1.a(gap.ap));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gwf $$3, float $$4, float $$5) {
      fxj $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
