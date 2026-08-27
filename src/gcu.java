public class gcu<T extends bmo, M extends fkj<T>> extends gdl<T, M> {
   private static final ahh a = new ahh("textures/entity/elytra.png");
   private final fkg<T> b;

   public gcu(gav<T, M> $$0, fnf $$1) {
      super($$0);
      this.b = new fkg<>($$1.a(fni.S));
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cng $$10 = $$3.c(bmd.e);
      if ($$10.a(cnj.nS)) {
         ahh $$13;
         if ($$3 instanceof fss $$11) {
            gga $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cfr.a)) {
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
         eqo $$17 = fzy.a($$1, fub.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
