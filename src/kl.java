public class kl extends kj {
   @Override
   protected cto a(kf $$0, cto $$1) {
      aqm $$2 = $$0.b();
      if (!$$2.x_()) {
         io $$3 = $$0.c().a($$0.d().c(dgd.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqm $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      if ($$2.a(avw.aG, $$0x -> $$0x.b(dds.c) && $$0x.b() instanceof dds)) {
         int $$3 = $$2.c(dds.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avh.bX, avi.e, 1.0F, 1.0F);
            dds.a($$0, $$1);
            ((dds)$$2.b()).a($$0, $$2, $$1, null, dod.b.b);
            $$0.a(null, dvu.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqm $$0, io $$1) {
      for (bso $$3 : $$0.a(bso.class, new euf($$1), brz.f)) {
         if ($$3 instanceof btf $$4 && $$4.a()) {
            $$4.a(avi.e);
            $$0.a(null, dvu.M, $$1);
            return true;
         }
      }

      return false;
   }
}
