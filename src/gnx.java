public class gnx<T extends bsy> extends gns<T, fwg<T>> {
   private final fui<T> a;

   public gnx(glc<T, fwg<T>> $$0, fxe $$1) {
      super($$0);
      this.a = new fwg<>($$1.a(fxh.bt));
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffn $$10 = ffn.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         fak $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gef.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gef.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gkh.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
