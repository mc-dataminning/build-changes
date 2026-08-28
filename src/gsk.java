import java.util.List;

public record gsk(List<gry> b) implements hml {
   @Override
   public hmh bake(gsl $$0, hlz $$1, hmf $$2, hmb $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static hmh a(List<gry> $$0, gsl $$1, hmk $$2, hmf $$3, hmb $$4) {
      hmh.a $$5 = new hmh.a();

      for (gry $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hjq $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jb.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static grx a(gry $$0, grz $$1, hjq $$2, jb $$3, hmf $$4) {
      return gse.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<gry> a() {
      return this.b;
   }
}
