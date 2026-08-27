public class gcr<T extends blp & bmv, M extends fjp<T>> extends gcq<T, M> {
   private final ahd a;
   private final M b;

   public gcr(gaa<T, M> $$0, M $$1, ahd $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         epx $$10 = $$1.getBuffer(fth.e(this.a));
         this.b.a($$0, $$10, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
