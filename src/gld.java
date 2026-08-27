public class gld<T extends bre> extends gky<T, ftp<T>> {
   private final frr<T> a;

   public gld(gii<T, ftp<T>> $$0, fun $$1) {
      super($$0);
      this.a = new ftp<>($$1.a(fuq.bt));
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fcu $$10 = fcu.Q();
      boolean $$11 = $$10.b($$3) && $$3.cf();
      if (!$$3.cf() || $$11) {
         exr $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gbm.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gbm.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gho.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
