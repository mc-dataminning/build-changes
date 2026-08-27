public class jl extends jk {
   @Override
   protected cmy a(jg $$0, cmy $$1) {
      and $$2 = $$0.b();
      if (!$$2.y_()) {
         hx $$3 = $$0.c().a($$0.d().c(cyv.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(and $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      if ($$2.a(ash.aF, $$0x -> $$0x.b(cwk.c) && $$0x.b() instanceof cwk)) {
         int $$3 = $$2.c(cwk.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, ars.bI, art.e, 1.0F, 1.0F);
            cwk.a($$0, $$1);
            ((cwk)$$2.b()).a($$0, $$2, $$1, null, dgs.b.b);
            $$0.a(null, dnr.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(and $$0, hx $$1) {
      for (bml $$3 : $$0.a(bml.class, new elo($$1), bly.f)) {
         if ($$3 instanceof bnc $$4 && $$4.a()) {
            $$4.a(art.e);
            $$0.a(null, dnr.M, $$1);
            return true;
         }
      }

      return false;
   }
}
