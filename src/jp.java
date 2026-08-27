public class jp extends jo {
   @Override
   protected cpq a(jk $$0, cpq $$1) {
      apa $$2 = $$0.b();
      if (!$$2.y_()) {
         ib $$3 = $$0.c().a($$0.d().c(dbk.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.F_(), null, () -> $$1.f(0));
         }
      }

      return $$1;
   }

   private static boolean a(apa $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      if ($$2.a(aue.aF, $$0x -> $$0x.b(cyz.c) && $$0x.b() instanceof cyz)) {
         int $$3 = $$2.c(cyz.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, atp.bV, atq.e, 1.0F, 1.0F);
            cyz.a($$0, $$1);
            ((cyz)$$2.b()).a($$0, $$2, $$1, null, dji.b.b);
            $$0.a(null, dqr.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(apa $$0, ib $$1) {
      for (box $$3 : $$0.a(box.class, new eoq($$1), bok.f)) {
         if ($$3 instanceof bpn $$4 && $$4.a()) {
            $$4.a(atq.e);
            $$0.a(null, dqr.M, $$1);
            return true;
         }
      }

      return false;
   }
}
