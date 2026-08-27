public class jq extends jp {
   @Override
   protected cqk a(jl $$0, cqk $$1) {
      apf $$2 = $$0.b();
      if (!$$2.x_()) {
         ib $$3 = $$0.c().a($$0.d().c(dcf.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.f(0));
         }
      }

      return $$1;
   }

   private static boolean a(apf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      if ($$2.a(aun.aG, $$0x -> $$0x.b(czu.c) && $$0x.b() instanceof czu)) {
         int $$3 = $$2.c(czu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aty.bX, atz.e, 1.0F, 1.0F);
            czu.a($$0, $$1);
            ((czu)$$2.b()).a($$0, $$2, $$1, null, dkd.b.b);
            $$0.a(null, drn.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(apf $$0, ib $$1) {
      for (bpo $$3 : $$0.a(bpo.class, new epm($$1), bpb.f)) {
         if ($$3 instanceof bqe $$4 && $$4.a()) {
            $$4.a(atz.e);
            $$0.a(null, drn.M, $$1);
            return true;
         }
      }

      return false;
   }
}
