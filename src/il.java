public class il extends ik {
   @Override
   protected cjh a(gx $$0, cjh $$1) {
      aks $$2 = $$0.g();
      if (!$$2.w_()) {
         gw $$3 = $$0.d().a($$0.e().c(cuy.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.D_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(aks $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      if ($$2.a(apu.aF, $$0x -> $$0x.b(csr.b) && $$0x.b() instanceof csr)) {
         int $$3 = $$2.c(csr.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, apf.bI, apg.e, 1.0F, 1.0F);
            csr.a($$0, $$1);
            ((csr)$$2.b()).a($$0, $$2, $$1, null, dcu.b.b);
            $$0.a(null, djv.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aks $$0, gw $$1) {
      for (bji $$3 : $$0.a(bji.class, new ehk($$1), biv.f)) {
         if ($$3 instanceof bjz $$4 && $$4.a()) {
            $$4.a(apg.e);
            $$0.a(null, djv.M, $$1);
            return true;
         }
      }

      return false;
   }
}
