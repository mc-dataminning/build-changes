public class gnp<T extends btq> extends gnk<T, fvz<T>> {
   private final fub<T> a;

   public gnp(gku<T, fvz<T>> $$0, fwx $$1) {
      super($$0);
      this.a = new fvz<>($$1.a(fxa.bt));
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffg $$10 = ffg.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         fad $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdx.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdx.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gjz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
