public class kx implements ky {
   private static final int c = 6;

   @Override
   public final cvl dispense(kv $$0, cvl $$1) {
      cvl $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dja.b));
      return $$2;
   }

   protected cvl a(kv $$0, cvl $$1) {
      jj $$2 = $$0.d().c(dja.b);
      jx $$3 = dja.a($$0);
      cvl $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dds $$0, cvl $$1, int $$2, jj $$3, jx $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jj.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cjz $$8 = new cjz($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.n(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(kv $$0) {
      b($$0);
   }

   protected void a(kv $$0, jj $$1) {
      b($$0, $$1);
   }

   private static void b(kv $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(kv $$0, jj $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected cvl a(kv $$0, cvl $$1, cvl $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(kv $$0, cvl $$1) {
      cvl $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jj $$3 = $$0.d().c(dja.b);
         a($$0.b(), $$2, 6, $$3, dja.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
