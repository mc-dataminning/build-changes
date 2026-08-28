import java.util.List;

public class lf extends ld {
   public static final lf c = new lf();

   @Override
   protected cxy a(lb $$0, cxy $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(lb $$0, cxy $$1) {
      jj $$2 = $$0.c().a($$0.d().c(dna.b));
      List<bwr> $$3 = $$0.b().a(bwr.class, new fcp($$2), $$1x -> $$1x.f($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bwr $$4 = $$3.getFirst();
         bwc $$5 = $$4.g($$1);
         cxy $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bwt $$7) {
            $$7.g($$5);
            $$7.fY();
         }

         return true;
      }
   }
}
