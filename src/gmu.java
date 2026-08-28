public class gmu extends gns<cer, ftt<cer>> {
   private static final akk a = new akk("textures/entity/cat/cat_collar.png");
   private final ftt<cer> b;

   public gmu(glc<cer, ftt<cer>> $$0, fxe $$1) {
      super($$0);
      this.b = new ftt<>($$1.a(fxh.u));
   }

   public void a(fag $$0, gdx $$1, int $$2, cer $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s()) {
         float[] $$10 = $$3.gw().d();
         a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$10[0], $$10[1], $$10[2]);
      }
   }
}
