public class grd extends gsb<gth, fxb> {
   private static final ale a = ale.b("textures/entity/cat/cat_collar.png");
   private final fxb b;
   private final fxb c;

   public grd(gpk<gth, fxb> $$0, gam $$1) {
      super($$0);
      this.b = new fxb($$1.a(gap.F));
      this.c = new fxb($$1.a(gap.G));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gth $$3, float $$4, float $$5) {
      cum $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fxb $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
