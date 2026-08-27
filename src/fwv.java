public class fwv<T extends biw> extends fwr<T, fgi<T>> {
   private final fek<T> a;

   public fwv(fue<T, fgi<T>> $$0, fhf $$1) {
      super($$0);
      this.a = new fgi<>($$1.a(fhi.bn));
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eqn $$10 = eqn.N();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         ell $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fno.p(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fno.h(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, ftk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
