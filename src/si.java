import java.util.List;

public class si {
   public static void a(rc<ean<?, ?>> $$0) {
      sf.a($$0);
      sg.a($$0);
      sh.a($$0);
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
      so.a($$0);
   }

   private static dzd a(List<dfb> $$0) {
      dzd $$1;
      if (!$$0.isEmpty()) {
         $$1 = dzd.a(dzd.c, dzd.a(je.a.q(), $$0));
      } else {
         $$1 = dzd.c;
      }

      return $$1;
   }

   public static edr a(int $$0, ji<ehq> $$1) {
      return new edr($$0, 7, 3, $$1);
   }

   public static <FC extends ede, F extends eba<FC>> edr a(F $$0, FC $$1, List<dfb> $$2, int $$3) {
      return a($$3, sx.a($$0, $$1, a($$2)));
   }

   public static <FC extends ede, F extends eba<FC>> edr a(F $$0, FC $$1, List<dfb> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends ede, F extends eba<FC>> edr a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static ale<ean<?, ?>> a(String $$0) {
      return ale.a(lq.aC, new alf($$0));
   }

   public static void a(rc<ean<?, ?>> $$0, ale<ean<?, ?>> $$1, eba<edl> $$2) {
      a($$0, $$1, $$2, ede.m);
   }

   public static <FC extends ede, F extends eba<FC>> void a(rc<ean<?, ?>> $$0, ale<ean<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ean($$2, $$3));
   }
}
