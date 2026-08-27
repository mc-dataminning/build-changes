public class ggn<T extends box> extends ggj<T, fpd<T>> {
   private final fne<T> a;

   public ggn(gdt<T, fpd<T>> $$0, fqb $$1) {
      super($$0);
      this.a = new fpd<>($$1.a(fqe.bp));
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eyk $$10 = eyk.P();
      boolean $$11 = $$10.b($$3) && $$3.cb();
      if (!$$3.cb() || $$11) {
         eth $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fwy.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fwy.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gcz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
