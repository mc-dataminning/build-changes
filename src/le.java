public class le extends la {
   private final cww c;
   private final cww.a d;

   public le(cvx $$0) {
      if ($$0 instanceof cww $$1) {
         this.c = $$1;
         this.d = $$1.b();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cww.class.getSimpleName());
      }
   }

   @Override
   public cwb a(ky $$0, cwb $$1) {
      arn $$2 = $$0.b();
      jm $$3 = $$0.d().c(dkj.b);
      ka $$4 = this.d.b().getDispensePosition($$0, $$3);
      cpg.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(ky $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
