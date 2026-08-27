public class gcu<T extends bmf> extends gcq<T, fln<T>> {
   private final fjp<T> a;

   public gcu(gaa<T, fln<T>> $$0, fml $$1) {
      super($$0);
      this.a = new fln<>($$1.a(fmo.bq));
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eva $$10 = eva.N();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         epx $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fth.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fth.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fzg.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
