public class gnq<T extends btr> extends gnl<T, fwa<T>> {
   private final fuc<T> a;

   public gnq(gkv<T, fwa<T>> $$0, fwy $$1) {
      super($$0);
      this.a = new fwa<>($$1.a(fxb.bt));
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffh $$10 = ffh.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         fae $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdy.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdy.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gka.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
