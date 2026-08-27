public class kk extends kh {
   private final cui c;
   private final cui.a d;

   public kk(ctl $$0) {
      if ($$0 instanceof cui $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cui.class.getSimpleName());
      }
   }

   @Override
   public ctq a(kf $$0, ctq $$1) {
      daz $$2 = $$0.b();
      it $$3 = $$0.d().c(dgf.b);
      jh $$4 = this.d.b().getDispensePosition($$0, $$3);
      cmq $$5 = this.c.a($$2, $$4, $$1, $$3);
      this.c.a($$5, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(kf $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
