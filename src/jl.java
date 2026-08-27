public class jl extends jk {
   @Override
   protected cmr a(jg $$0, cmr $$1) {
      amz $$2 = $$0.b();
      if (!$$2.y_()) {
         hx $$3 = $$0.c().a($$0.d().c(cyo.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(amz $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      if ($$2.a(asb.aF, $$0x -> $$0x.b(cwd.c) && $$0x.b() instanceof cwd)) {
         int $$3 = $$2.c(cwd.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, arm.bI, arn.e, 1.0F, 1.0F);
            cwd.a($$0, $$1);
            ((cwd)$$2.b()).a($$0, $$2, $$1, null, dgl.b.b);
            $$0.a(null, dnk.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(amz $$0, hx $$1) {
      for (bmf $$3 : $$0.a(bmf.class, new elh($$1), bls.f)) {
         if ($$3 instanceof bmw $$4 && $$4.a()) {
            $$4.a(arn.e);
            $$0.a(null, dnk.M, $$1);
            return true;
         }
      }

      return false;
   }
}
