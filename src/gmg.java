public class gmg<T extends bru & bte, M extends fsw<T>> extends gmf<T, M> {
   private final akm a;
   private final M b;

   public gmg(gjp<T, M> $$0, M $$1, akm $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eyw $$10 = $$1.getBuffer(gcs.e(this.a));
         this.b.a($$0, $$10, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
