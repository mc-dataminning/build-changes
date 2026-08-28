public class la extends ky {
   @Override
   protected cuo a(ku $$0, cuo $$1) {
      aqt $$2 = $$0.b();
      if (!$$2.x_()) {
         jd $$3 = $$0.c().a($$0.d().c(dib.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(aqt $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      if ($$2.a(awd.aG, $$0x -> $$0x.b(dfq.c) && $$0x.b() instanceof dfq)) {
         int $$3 = $$2.c(dfq.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avo.bX, avp.e, 1.0F, 1.0F);
            dfq.a($$0, $$1);
            ((dfq)$$2.b()).a($$0, $$2, $$1, null, dqc.b.b);
            $$0.a(null, dxw.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqt $$0, jd $$1) {
      for (btl $$3 : $$0.a(btl.class, new ewr($$1), bsv.f)) {
         if ($$3 instanceof bud $$4 && $$4.a()) {
            $$4.a(avp.e);
            $$0.a(null, dxw.M, $$1);
            return true;
         }
      }

      return false;
   }
}
