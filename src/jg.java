public class jg extends jf {
   @Override
   protected clj a(jb $$0, clj $$1) {
      ame $$2 = $$0.b();
      if (!$$2.x_()) {
         ht $$3 = $$0.c().a($$0.d().c(cxf.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.E_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(ame $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      if ($$2.a(arg.aF, $$0x -> $$0x.b(cuu.c) && $$0x.b() instanceof cuu)) {
         int $$3 = $$2.c(cuu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aqr.bI, aqs.e, 1.0F, 1.0F);
            cuu.a($$0, $$1);
            ((cuu)$$2.b()).a($$0, $$2, $$1, null, dfa.b.b);
            $$0.a(null, dls.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(ame $$0, ht $$1) {
      for (blg $$3 : $$0.a(blg.class, new ejp($$1), bkt.f)) {
         if ($$3 instanceof blx $$4 && $$4.a()) {
            $$4.a(aqs.e);
            $$0.a(null, dls.M, $$1);
            return true;
         }
      }

      return false;
   }
}
