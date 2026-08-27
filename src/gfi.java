public class gfi<T extends bog> extends gfe<T, fnz<T>> {
   private final fmb<T> a;

   public gfi(gco<T, fnz<T>> $$0, foy $$1) {
      super($$0);
      this.a = new fnz<>($$1.a(fpb.bp));
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      exh $$10 = exh.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         ese $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fvu.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fvu.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gbu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
