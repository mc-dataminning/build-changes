public class jg extends jf {
   @Override
   protected ckj a(jb $$0, ckj $$1) {
      alq $$2 = $$0.b();
      if (!$$2.x_()) {
         ht $$3 = $$0.c().a($$0.d().c(cwd.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.E_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(alq $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      if ($$2.a(aqs.aF, $$0x -> $$0x.b(ctu.c) && $$0x.b() instanceof ctu)) {
         int $$3 = $$2.c(ctu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aqd.bI, aqe.e, 1.0F, 1.0F);
            ctu.a($$0, $$1);
            ((ctu)$$2.b()).a($$0, $$2, $$1, null, ddu.b.b);
            $$0.a(null, dkl.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(alq $$0, ht $$1) {
      for (bkj $$3 : $$0.a(bkj.class, new eia($$1), bjw.f)) {
         if ($$3 instanceof bla $$4 && $$4.a()) {
            $$4.a(aqe.e);
            $$0.a(null, dkl.M, $$1);
            return true;
         }
      }

      return false;
   }
}
