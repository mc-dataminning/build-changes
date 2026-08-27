public class fzb<T extends bky, M extends fhc<T>> extends fzs<T, M> {
   private static final agg a = new agg("textures/entity/elytra.png");
   private final fgz<T> b;

   public fzb(fxf<T, M> $$0, fjx $$1) {
      super($$0);
      this.b = new fgz<>($$1.a(fka.Q));
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clb $$10 = $$3.c(bkn.e);
      if ($$10.a(cle.nh)) {
         agg $$13;
         if ($$3 instanceof fpg $$11) {
            gch $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cdn.a)) {
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
         eno $$17 = fwi.a($$1, fqp.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
