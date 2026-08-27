public class gao<T extends bll> extends gak<T, fjs<T>> {
   private final fhu<T> a;

   public gao(fxx<T, fjs<T>> $$0, fkp $$1) {
      super($$0);
      this.a = new fjs<>($$1.a(fks.bn));
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eti $$10 = eti.N();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eof $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(frh.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(frh.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fxd.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
