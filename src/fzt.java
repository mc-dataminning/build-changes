public class fzt<T extends bll, M extends fhu<T>> extends gak<T, M> {
   private static final agm a = new agm("textures/entity/elytra.png");
   private final fhr<T> b;

   public fzt(fxx<T, M> $$0, fkp $$1) {
      super($$0);
      this.b = new fhr<>($$1.a(fks.Q));
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clo $$10 = $$3.c(bla.e);
      if ($$10.a(clr.nS)) {
         agm $$13;
         if ($$3 instanceof fpy $$11) {
            gcz $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cea.a)) {
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
         eof $$17 = fxa.a($$1, frh.a($$13), false, $$10.B());
         this.b.a($$0, $$17, $$2, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
