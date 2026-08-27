public class fwt<T extends bjb, M extends fey<T>> extends fxk<T, M> {
   private static final aeu a = new aeu("textures/entity/elytra.png");
   private final fev<T> b;

   public fwt(fux<T, M> $$0, fht $$1) {
      super($$0);
      this.b = new fev<>($$1.a(fhw.Q));
   }

   public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cja $$10 = $$3.c(biq.e);
      if ($$10.a(cjd.nh)) {
         aeu $$13;
         if ($$3 instanceof fmy $$11) {
            fzz $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cbq.a)) {
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
         elo $$17 = fua.a($$1, foh.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
