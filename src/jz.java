public class jz extends jy {
   @Override
   protected crj a(ju $$0, crj $$1) {
      aps $$2 = $$0.b();
      if (!$$2.x_()) {
         ib $$3 = $$0.c().a($$0.d().c(ded.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aps $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      if ($$2.a(avc.aG, $$0x -> $$0x.b(dbs.c) && $$0x.b() instanceof dbs)) {
         int $$3 = $$2.c(dbs.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aum.bX, aun.e, 1.0F, 1.0F);
            dbs.a($$0, $$1);
            ((dbs)$$2.b()).a($$0, $$2, $$1, null, dmc.b.b);
            $$0.a(null, dts.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aps $$0, ib $$1) {
      for (bqo $$3 : $$0.a(bqo.class, new erv($$1), bqa.f)) {
         if ($$3 instanceof bre $$4 && $$4.a()) {
            $$4.a(aun.e);
            $$0.a(null, dts.M, $$1);
            return true;
         }
      }

      return false;
   }
}
