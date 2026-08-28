public class ll extends lg {
   private final dah c;
   private final dah.a d;

   public ll(czj $$0) {
      if ($$0 instanceof dah $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + dah.class.getSimpleName());
      }
   }

   @Override
   public czn a(le $$0, czn $$1) {
      arq $$2 = $$0.b();
      jb $$3 = $$0.d().c(dox.b);
      jp $$4 = this.d.b().getDispensePosition($$0, $$3);
      csh.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(le $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
