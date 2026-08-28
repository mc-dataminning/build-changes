public class gml extends gnj<cfi, ftl<cfi>> {
   private static final alf a = new alf("textures/entity/cat/cat_collar.png");
   private final ftl<cfi> b;

   public gml(gkt<cfi, ftl<cfi>> $$0, fww $$1) {
      super($$0);
      this.b = new ftl<>($$1.a(fwz.u));
   }

   public void a(ezy $$0, gdo $$1, int $$2, cfi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s()) {
         float[] $$10 = $$3.gz().d();
         a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$10[0], $$10[1], $$10[2]);
      }
   }
}
