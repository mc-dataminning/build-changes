public class gnf<T extends bsp & bua, M extends ftv<T>> extends gne<T, M> {
   private final alb a;
   private final M b;

   public gnf(gko<T, M> $$0, M $$1, alb $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         ezx $$10 = $$1.getBuffer(gdr.e(this.a));
         this.b.a($$0, $$10, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
