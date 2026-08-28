public class gwz extends gxs<hca, gcv> {
   private static final aku a = aku.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gcv b;
   private final gcv c;

   public gwz(gva<hca, gcv> $$0, gfy $$1) {
      super($$0);
      this.b = new gcv($$1.a(ggb.aF));
      this.c = new gcv($$1.a(ggb.aC));
   }

   public void a(fgr $$0, gmx $$1, int $$2, hca $$3, float $$4, float $$5) {
      gcv $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
