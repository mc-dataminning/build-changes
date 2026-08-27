public class jl extends jk {
   @Override
   protected cmx a(jg $$0, cmx $$1) {
      and $$2 = $$0.b();
      if (!$$2.y_()) {
         hx $$3 = $$0.c().a($$0.d().c(cyu.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(and $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      if ($$2.a(asg.aF, $$0x -> $$0x.b(cwj.c) && $$0x.b() instanceof cwj)) {
         int $$3 = $$2.c(cwj.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, arr.bI, ars.e, 1.0F, 1.0F);
            cwj.a($$0, $$1);
            ((cwj)$$2.b()).a($$0, $$2, $$1, null, dgr.b.b);
            $$0.a(null, dnq.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(and $$0, hx $$1) {
      for (bmk $$3 : $$0.a(bmk.class, new eln($$1), blx.f)) {
         if ($$3 instanceof bnb $$4 && $$4.a()) {
            $$4.a(ars.e);
            $$0.a(null, dnq.M, $$1);
            return true;
         }
      }

      return false;
   }
}
