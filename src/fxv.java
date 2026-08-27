public class fxv<T extends bji> extends fxr<T, fhd<T>> {
   private final fff<T> a;

   public fxv(fve<T, fhd<T>> $$0, fia $$1) {
      super($$0);
      this.a = new fhd<>($$1.a(fid.bn));
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eqx $$10 = eqx.O();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         elv $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(foo.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(foo.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fuk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
