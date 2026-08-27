public class il extends ik {
   @Override
   protected cja a(gx $$0, cja $$1) {
      akn $$2 = $$0.g();
      if (!$$2.r_()) {
         gw $$3 = $$0.d().a($$0.e().c(cur.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.y_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(akn $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      if ($$2.a(apo.aF, $$0x -> $$0x.b(csk.b) && $$0x.b() instanceof csk)) {
         int $$3 = $$2.c(csk.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aoz.bI, apa.e, 1.0F, 1.0F);
            csk.a($$0, $$1);
            ((csk)$$2.b()).a($$0, $$2, $$1, null, dcn.b.b);
            $$0.a(null, djo.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(akn $$0, gw $$1) {
      for (bjb $$3 : $$0.a(bjb.class, new ehd($$1), bio.f)) {
         if ($$3 instanceof bjs $$4 && $$4.a()) {
            $$4.a(apa.e);
            $$0.a(null, djo.M, $$1);
            return true;
         }
      }

      return false;
   }
}
