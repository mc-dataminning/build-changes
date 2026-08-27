import java.util.List;

public class sp {
   public static final eja a = eit.a(dyu.a.e);
   public static final eja b = eit.a(dyu.a.c);
   public static final eja c = eit.a(dyu.a.a);
   public static final eja d = eit.a(dyu.a.d);
   public static final eja e = eis.a(dzo.a(), dzo.b());
   public static final eja f = eis.a(dzo.b(10), dzo.c(10));
   public static final eja g = eis.a(dzo.b(8), dzo.c(8));
   public static final eja h = eis.a(dzo.b(4), dzo.c(4));
   public static final eja i = eis.a(dzo.a(), dzo.a(256));

   public static void a(qq<eix> $$0) {
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
      so.a($$0);
      sq.a($$0);
      sr.a($$0);
      ss.a($$0);
   }

   public static aks<eix> a(String $$0) {
      return aks.a(li.aI, new akt($$0));
   }

   public static void a(qq<eix> $$0, aks<eix> $$1, ja<ebm<?, ?>> $$2, List<eja> $$3) {
      $$0.a($$1, new eix($$2, List.copyOf($$3)));
   }

   public static void a(qq<eix> $$0, aks<eix> $$1, ja<ebm<?, ?>> $$2, eja... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eja a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bok<bpf> $$4 = bok.<bpf>a().a(bpc.a($$0), (int)$$3 - 1).a(bpc.a($$0 + $$2), 1).a();
         return eiq.a(new bpm($$4));
      }
   }

   public static eiz a() {
      return eil.a(eab.c);
   }

   public static eil a(dfc $$0) {
      return eil.a(eab.a($$0.n(), ir.c));
   }

   public static ja<eix> a(ja<ebm<?, ?>> $$0, eja... $$1) {
      return ja.a(new eix($$0, List.of($$1)));
   }

   public static <FC extends eek, F extends eca<FC>> ja<eix> a(F $$0, FC $$1, eja... $$2) {
      return a(ja.a(new ebm($$0, $$1)), $$2);
   }

   public static <FC extends eek, F extends eca<FC>> ja<eix> a(F $$0, FC $$1) {
      return a($$0, $$1, eab.c);
   }

   public static <FC extends eek, F extends eca<FC>> ja<eix> a(F $$0, FC $$1, eab $$2) {
      return a($$0, $$1, eil.a($$2));
   }
}
