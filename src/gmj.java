public class gmj extends gnh<cfg, ftj<cfg>> {
   private static final ale a = new ale("textures/entity/cat/cat_collar.png");
   private final ftj<cfg> b;

   public gmj(gkr<cfg, ftj<cfg>> $$0, fwu $$1) {
      super($$0);
      this.b = new ftj<>($$1.a(fwx.u));
   }

   public void a(ezw $$0, gdm $$1, int $$2, cfg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.s()) {
         float[] $$10 = $$3.gz().d();
         a(this.c(), this.b, a, $$0, $$1, $$2, $$3, $$4, $$5, $$7, $$8, $$9, $$6, $$10[0], $$10[1], $$10[2]);
      }
   }
}
