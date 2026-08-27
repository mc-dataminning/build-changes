public class fzw<T extends bky> extends fzs<T, fja<T>> {
   private final fhc<T> a;

   public fzw(fxf<T, fja<T>> $$0, fjx $$1) {
      super($$0);
      this.a = new fja<>($$1.a(fka.bn));
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      esr $$10 = esr.N();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         eno $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fqp.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fqp.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fwl.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
