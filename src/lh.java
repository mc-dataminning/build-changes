public class lh extends lf {
   @Override
   protected cwn a(kz $$0, cwn $$1) {
      arc $$2 = $$0.b();
      if (!$$2.B_()) {
         ji $$3 = $$0.c().a($$0.d().c(dlq.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arc $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      if ($$2.a(awo.aJ, $$0x -> $$0x.b(dje.c) && $$0x.b() instanceof dje)) {
         int $$3 = $$2.c(dje.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avz.bX, awa.e, 1.0F, 1.0F);
            dje.a($$0, $$1);
            ((dje)$$2.b()).a($$0, $$2, $$1, null, dtu.b.b);
            $$0.a(null, ebr.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arc $$0, ji $$1, cwn $$2) {
      for (bvf $$4 : $$0.a(bvf.class, new fat($$1), buo.f)) {
         if ($$4 instanceof bvw $$5 && $$5.a()) {
            $$5.a($$0, awa.e, $$2);
            $$0.a(null, ebr.M, $$1);
            return true;
         }
      }

      return false;
   }
}
