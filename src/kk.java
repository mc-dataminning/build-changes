public class kk extends kh {
   private final cug c;
   private final cug.a d;

   public kk(ctj $$0) {
      if ($$0 instanceof cug $$1) {
         this.c = $$1;
         this.d = $$1.c();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + cug.class.getSimpleName());
      }
   }

   @Override
   public cto a(kf $$0, cto $$1) {
      dax $$2 = $$0.b();
      it $$3 = $$0.d().c(dgd.b);
      jh $$4 = this.d.b().getDispensePosition($$0, $$3);
      cmo $$5 = this.c.a($$2, $$4, $$1, $$3);
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
