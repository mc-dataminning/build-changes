public class gjc<T extends bqo, M extends fqm<T>> extends gjt<T, M> {
   private static final ajt a = new ajt("textures/entity/elytra.png");
   private final fqj<T> b;

   public gjc(ghd<T, M> $$0, fti $$1) {
      super($$0);
      this.b = new fqj<>($$1.a(ftl.W));
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crj $$10 = $$3.d(bqc.e);
      if ($$10.a(crm.nS)) {
         ajt $$13;
         if ($$3 instanceof fyy $$11) {
            gmi $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cju.a)) {
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
         ewm $$17 = ggg.a($$1, gah.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
