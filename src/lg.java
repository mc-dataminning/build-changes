public class lg implements lh {
   private static final int c = 6;

   @Override
   public final czy dispense(le $$0, czy $$1) {
      czy $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dpi.b));
      return $$2;
   }

   protected czy a(le $$0, czy $$1) {
      jb $$2 = $$0.d().c(dpi.b);
      jp $$3 = dpi.a($$0);
      czy $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(djx $$0, czy $$1, int $$2, jb $$3, jp $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jb.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      coc $$8 = new coc($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n(
         $$0.A.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.A.a(0.2, 0.0172275 * (double)$$2),
         $$0.A.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(le $$0) {
      b($$0);
   }

   protected void a(le $$0, jb $$1) {
      b($$0, $$1);
   }

   private static void b(le $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(le $$0, jb $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected czy a(le $$0, czy $$1, czy $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(le $$0, czy $$1) {
      czy $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jb $$3 = $$0.d().c(dpi.b);
         a($$0.b(), $$2, 6, $$3, dpi.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
