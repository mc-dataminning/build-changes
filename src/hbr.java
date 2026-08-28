public class hbr extends hcj<hgv, ghi> {
   private static final alr a = alr.b("textures/entity/zombie/drowned_outer_layer.png");
   private final ghi b;
   private final ghi c;

   public hbr(gzs<hgv, ghi> $$0, gkn $$1) {
      super($$0);
      this.b = new ghi($$1.a(gkq.aN));
      this.c = new ghi($$1.a(gkq.aK));
   }

   public void a(fld $$0, grn $$1, int $$2, hgv $$3, float $$4, float $$5) {
      ghi $$6 = $$3.am ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
