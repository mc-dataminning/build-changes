import java.util.List;

public class ri {
   public static void a(qh<eif<?, ?>> $$0) {
      rf.a($$0);
      rg.a($$0);
      rh.a($$0);
      rj.a($$0);
      rk.a($$0);
      rl.a($$0);
      rm.a($$0);
      rn.a($$0);
      ro.a($$0);
   }

   private static egu a(List<dlu> $$0) {
      egu $$1;
      if (!$$0.isEmpty()) {
         $$1 = egu.a(egu.c, egu.a(ja.a.q(), $$0));
      } else {
         $$1 = egu.c;
      }

      return $$1;
   }

   public static elk a(int $$0, je<epm> $$1) {
      return new elk($$0, 7, 3, $$1);
   }

   public static <FC extends ekx, F extends eit<FC>> elk a(F $$0, FC $$1, List<dlu> $$2, int $$3) {
      return a($$3, rx.a($$0, $$1, a($$2)));
   }

   public static <FC extends ekx, F extends eit<FC>> elk a(F $$0, FC $$1, List<dlu> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends ekx, F extends eit<FC>> elk a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static ald<eif<?, ?>> a(String $$0) {
      return ald.a(mg.aK, ale.b($$0));
   }

   public static void a(qh<eif<?, ?>> $$0, ald<eif<?, ?>> $$1, eit<ele> $$2) {
      a($$0, $$1, $$2, ekx.m);
   }

   public static <FC extends ekx, F extends eit<FC>> void a(qh<eif<?, ?>> $$0, ald<eif<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new eif($$2, $$3));
   }
}
