public class gnm<T extends btn> extends gnh<T, fvw<T>> {
   private final fty<T> a;

   public gnm(gkr<T, fvw<T>> $$0, fwu $$1) {
      super($$0);
      this.a = new fvw<>($$1.a(fwx.bt));
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffd $$10 = ffd.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         faa $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdu.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdu.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gjw.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
