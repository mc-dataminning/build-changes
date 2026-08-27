public class fwy<T extends bjg, M extends ffd<T>> extends fxp<T, M> {
   private static final aex a = new aex("textures/entity/elytra.png");
   private final ffa<T> b;

   public fwy(fvc<T, M> $$0, fhy $$1) {
      super($$0);
      this.b = new ffa<>($$1.a(fib.Q));
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjf $$10 = $$3.c(biv.e);
      if ($$10.a(cji.nh)) {
         aex $$13;
         if ($$3 instanceof fnd $$11) {
            gae $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cbv.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         elt $$17 = fuf.a($$1, fom.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
