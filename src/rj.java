import java.util.List;

public class rj {
   public static void a(qi<ekh<?, ?>> $$0) {
      rg.a($$0);
      rh.a($$0);
      ri.a($$0);
      rk.a($$0);
      rl.a($$0);
      rm.a($$0);
      rn.a($$0);
      ro.a($$0);
      rp.a($$0);
   }

   private static eiw a(List<dno> $$0) {
      eiw $$1;
      if (!$$0.isEmpty()) {
         $$1 = eiw.a(eiw.c, eiw.a(jc.a.q(), $$0));
      } else {
         $$1 = eiw.c;
      }

      return $$1;
   }

   public static eno a(int $$0, jg<err> $$1) {
      return new eno($$0, 7, 3, $$1);
   }

   public static <FC extends enb, F extends ekw<FC>> eno a(F $$0, FC $$1, List<dno> $$2, int $$3) {
      return a($$3, ry.a($$0, $$1, a($$2)));
   }

   public static <FC extends enb, F extends ekw<FC>> eno a(F $$0, FC $$1, List<dno> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends enb, F extends ekw<FC>> eno a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static alq<ekh<?, ?>> a(String $$0) {
      return alq.a(mi.aL, alr.b($$0));
   }

   public static void a(qi<ekh<?, ?>> $$0, alq<ekh<?, ?>> $$1, ekw<eni> $$2) {
      a($$0, $$1, $$2, enb.m);
   }

   public static <FC extends enb, F extends ekw<FC>> void a(qi<ekh<?, ?>> $$0, alq<ekh<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new ekh($$2, $$3));
   }
}
