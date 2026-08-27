public class jl extends jk {
   @Override
   protected cng a(jg $$0, cng $$1) {
      ane $$2 = $$0.b();
      if (!$$2.y_()) {
         hx $$3 = $$0.c().a($$0.d().c(czd.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(ane $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      if ($$2.a(asi.aF, $$0x -> $$0x.b(cws.c) && $$0x.b() instanceof cws)) {
         int $$3 = $$2.c(cws.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, art.bU, aru.e, 1.0F, 1.0F);
            cws.a($$0, $$1);
            ((cws)$$2.b()).a($$0, $$2, $$1, null, dha.b.b);
            $$0.a(null, dnz.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(ane $$0, hx $$1) {
      for (bmo $$3 : $$0.a(bmo.class, new elx($$1), bmb.f)) {
         if ($$3 instanceof bnf $$4 && $$4.a()) {
            $$4.a(aru.e);
            $$0.a(null, dnz.M, $$1);
            return true;
         }
      }

      return false;
   }
}
