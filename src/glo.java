public class glo<T extends bso, M extends fsw<T>> extends gmf<T, M> {
   private static final akm a = new akm("textures/entity/elytra.png");
   private final fst<T> b;

   public glo(gjp<T, M> $$0, fvs $$1) {
      super($$0);
      this.b = new fst<>($$1.a(fvv.W));
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cto $$10 = $$3.a(bsb.e);
      if ($$10.a(ctr.nT)) {
         akm $$13;
         if ($$3 instanceof gbj $$11) {
            gov $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(clx.a)) {
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
         eyw $$17 = gir.a($$1, gcs.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
