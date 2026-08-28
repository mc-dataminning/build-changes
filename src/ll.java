public class ll extends lg {
   private final das c;
   private final das.a d;

   public ll(czu $$0) {
      if ($$0 instanceof das $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + das.class.getSimpleName());
      }
   }

   @Override
   public czy a(le $$0, czy $$1) {
      ars $$2 = $$0.b();
      jb $$3 = $$0.d().c(dpi.b);
      jp $$4 = this.d.b().getDispensePosition($$0, $$3);
      css.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
