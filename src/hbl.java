public class hbl extends hcj<hdr, ggw> {
   private static final alr a = alr.b("textures/entity/cat/cat_collar.png");
   private final ggw b;
   private final ggw c;

   public hbl(gzs<hdr, ggw> $$0, gkn $$1) {
      super($$0);
      this.b = new ggw($$1.a(gkq.T));
      this.c = new ggw($$1.a(gkq.S));
   }

   public void a(fld $$0, grn $$1, int $$2, hdr $$3, float $$4, float $$5) {
      czi $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         ggw $$8 = $$3.am ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
