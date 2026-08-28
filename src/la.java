public class la extends ky {
   @Override
   protected cuq a(ku $$0, cuq $$1) {
      aqu $$2 = $$0.b();
      if (!$$2.x_()) {
         jd $$3 = $$0.c().a($$0.d().c(did.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(aqu $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.a(awe.aG, $$0x -> $$0x.b(dfs.c) && $$0x.b() instanceof dfs)) {
         int $$3 = $$2.c(dfs.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avp.bX, avq.e, 1.0F, 1.0F);
            dfs.a($$0, $$1);
            ((dfs)$$2.b()).a($$0, $$2, $$1, null, dqe.b.b);
            $$0.a(null, dxz.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqu $$0, jd $$1) {
      for (btn $$3 : $$0.a(btn.class, new ewv($$1), bsw.f)) {
         if ($$3 instanceof buf $$4 && $$4.a()) {
            $$4.a(avq.e);
            $$0.a(null, dxz.M, $$1);
            return true;
         }
      }

      return false;
   }
}
