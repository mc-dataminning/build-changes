public class lb extends kz {
   @Override
   protected cvl a(kv $$0, cvl $$1) {
      arg $$2 = $$0.b();
      if (!$$2.w_()) {
         je $$3 = $$0.c().a($$0.d().c(dja.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arg $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      if ($$2.a(aws.aH, $$0x -> $$0x.b(dgp.c) && $$0x.b() instanceof dgp)) {
         int $$3 = $$2.c(dgp.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awd.bX, awe.e, 1.0F, 1.0F);
            dgp.a($$0, $$1);
            ((dgp)$$2.b()).a($$0, $$2, $$1, null, drb.b.b);
            $$0.a(null, dyx.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arg $$0, je $$1) {
      for (buf $$3 : $$0.a(buf.class, new exz($$1), bto.f)) {
         if ($$3 instanceof buv $$4 && $$4.a()) {
            $$4.a(awe.e);
            $$0.a(null, dyx.M, $$1);
            return true;
         }
      }

      return false;
   }
}
