public class gal<T extends bkv & bmb, M extends fhu<T>> extends gak<T, M> {
   private final agm a;
   private final M b;

   public gal(fxx<T, M> $$0, M $$1, agm $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eof $$10 = $$1.getBuffer(frh.e(this.a));
         this.b.a($$0, $$10, $$2, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
