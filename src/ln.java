public class ln extends ll {
   @Override
   protected daa a(lf $$0, daa $$1) {
      aru $$2 = $$0.b();
      if (!$$2.A_()) {
         iw $$3 = $$0.c().a($$0.d().c(dpk.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(aru $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      if ($$2.a(axg.aJ, $$0x -> $$0x.b(dmy.c) && $$0x.b() instanceof dmy)) {
         int $$3 = $$2.c(dmy.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awr.bX, aws.e, 1.0F, 1.0F);
            dmy.a($$0, $$1);
            ((dmy)$$2.b()).a($$0, $$2, $$1, null, dyb.b.b);
            $$0.a(null, egg.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(aru $$0, iw $$1, daa $$2) {
      for (bxw $$4 : $$0.a(bxw.class, new ffn($$1), bxc.f)) {
         if ($$4 instanceof bym $$5 && $$5.a()) {
            $$5.a($$0, aws.e, $$2);
            $$0.a(null, egg.M, $$1);
            return true;
         }
      }

      return false;
   }
}
