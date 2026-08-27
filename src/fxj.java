public class fxj<T extends biy> extends fxf<T, fgr<T>> {
   private final fet<T> a;

   public fxj(fus<T, fgr<T>> $$0, fho $$1) {
      super($$0);
      this.a = new fgr<>($$1.a(fhr.bn));
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eql $$10 = eql.O();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         elj $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(foc.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(foc.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fty.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
