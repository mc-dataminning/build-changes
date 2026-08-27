public class gef extends gfd<bzw, flm<bzw>> {
   private static final aiy a = new aiy("textures/entity/cat/cat_collar.png");
   private final flm<bzw> b;

   public gef(gcn<bzw, flm<bzw>> $$0, foy $$1) {
      super($$0);
      this.b = new flm<>($$1.a(fpb.q));
   }

   public void a(esa $$0, fvl $$1, int $$2, bzw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         float[] $$10 = $$3.gq().d();
         a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$10[0], $$10[1], $$10[2]);
      }
   }
}
