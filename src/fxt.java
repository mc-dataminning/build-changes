public class fxt<T extends bjg> extends fxp<T, fhb<T>> {
   private final ffd<T> a;

   public fxt(fvc<T, fhb<T>> $$0, fhy $$1) {
      super($$0);
      this.a = new fhb<>($$1.a(fib.bn));
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eqv $$10 = eqv.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         elt $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fom.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fom.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fui.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
