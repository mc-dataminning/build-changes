public class gnn<T extends bto> extends gni<T, fvx<T>> {
   private final ftz<T> a;

   public gnn(gks<T, fvx<T>> $$0, fwv $$1) {
      super($$0);
      this.a = new fvx<>($$1.a(fwy.bt));
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffe $$10 = ffe.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         fab $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdv.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdv.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gjx.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
