import java.util.List;

public class qh {
   public static void a(pc<dra<?, ?>> $$0) {
      qe.a($$0);
      qf.a($$0);
      qg.a($$0);
      qi.a($$0);
      qj.a($$0);
      qk.a($$0);
      ql.a($$0);
      qm.a($$0);
      qn.a($$0);
   }

   private static dpq a(List<cwj> $$0) {
      dpq $$1;
      if (!$$0.isEmpty()) {
         $$1 = dpq.a(dpq.c, dpq.a(ic.a.q(), $$0));
      } else {
         $$1 = dpq.c;
      }

      return $$1;
   }

   public static due a(int $$0, ih<dyd> $$1) {
      return new due($$0, 7, 3, $$1);
   }

   public static <FC extends dtr, F extends drn<FC>> due a(F $$0, FC $$1, List<cwj> $$2, int $$3) {
      return a($$3, qw.a($$0, $$1, a($$2)));
   }

   public static <FC extends dtr, F extends drn<FC>> due a(F $$0, FC $$1, List<cwj> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends dtr, F extends drn<FC>> due a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static ahc<dra<?, ?>> a(String $$0) {
      return ahc.a(ke.aw, new ahd($$0));
   }

   public static void a(pc<dra<?, ?>> $$0, ahc<dra<?, ?>> $$1, drn<dty> $$2) {
      a($$0, $$1, $$2, dtr.m);
   }

   public static <FC extends dtr, F extends drn<FC>> void a(pc<dra<?, ?>> $$0, ahc<dra<?, ?>> $$1, F $$2, FC $$3) {
      $$0.a($$1, new dra($$2, $$3));
   }
}
