public class gnh<T extends btb, M extends fuo<T>> extends gny<T, M> {
   private static final akk a = new akk("textures/entity/elytra.png");
   private final ful<T> b;

   public gnh(gli<T, M> $$0, fxk $$1) {
      super($$0);
      this.b = new ful<>($$1.a(fxn.W));
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuc $$10 = $$3.a(bsn.e);
      if ($$10.a(cuf.nT)) {
         akk $$13;
         if ($$3 instanceof gdc $$11) {
            gqo $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cml.a)) {
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
         faq $$17 = gkk.a($$1, gel.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
