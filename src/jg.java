public class jg extends jf {
   @Override
   protected clb a(jb $$0, clb $$1) {
      ama $$2 = $$0.b();
      if (!$$2.x_()) {
         ht $$3 = $$0.c().a($$0.d().c(cwx.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.E_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(ama $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      if ($$2.a(arc.aF, $$0x -> $$0x.b(cun.c) && $$0x.b() instanceof cun)) {
         int $$3 = $$2.c(cun.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aqn.bI, aqo.e, 1.0F, 1.0F);
            cun.a($$0, $$1);
            ((cun)$$2.b()).a($$0, $$2, $$1, null, deo.b.b);
            $$0.a(null, dlg.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(ama $$0, ht $$1) {
      for (bky $$3 : $$0.a(bky.class, new ejd($$1), bkl.f)) {
         if ($$3 instanceof blp $$4 && $$4.a()) {
            $$4.a(aqo.e);
            $$0.a(null, dlg.M, $$1);
            return true;
         }
      }

      return false;
   }
}
