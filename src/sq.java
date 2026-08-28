import java.util.List;

public class sq {
   public static final enk a = end.a(edj.a.e);
   public static final enk b = end.a(edj.a.f);
   public static final enk c = end.a(edj.a.c);
   public static final enk d = end.a(edj.a.a);
   public static final enk e = end.a(edj.a.d);
   public static final enk f = enc.a(eed.a(), eed.b());
   public static final enk g = enc.a(eed.b(10), eed.c(10));
   public static final enk h = enc.a(eed.b(8), eed.c(8));
   public static final enk i = enc.a(eed.b(4), eed.c(4));
   public static final enk j = enc.a(eed.a(), eed.a(256));

   public static void a(ra<enh> $$0) {
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
      so.a($$0);
      sp.a($$0);
      sr.a($$0);
      ss.a($$0);
      st.a($$0);
   }

   public static alo<enh> a(String $$0) {
      return alo.a(mb.aT, alp.b($$0));
   }

   public static void a(ra<enh> $$0, alo<enh> $$1, jq<egb<?, ?>> $$2, List<enk> $$3) {
      $$0.a($$1, new enh($$2, List.copyOf($$3)));
   }

   public static void a(ra<enh> $$0, alo<enh> $$1, jq<egb<?, ?>> $$2, enk... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static enk a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bri<bsf> $$4 = bri.<bsf>a().a(bsc.a($$0), (int)$$3 - 1).a(bsc.a($$0 + $$2), 1).a();
         return emz.a(new bsm($$4));
      }
   }

   public static enj a() {
      return emw.a(eeq.c);
   }

   public static emw a(dkd $$0) {
      return emw.a(eeq.a($$0.m(), jh.c));
   }

   public static jq<enh> a(jq<egb<?, ?>> $$0, enk... $$1) {
      return jq.a(new enh($$0, List.of($$1)));
   }

   public static <FC extends eit, F extends egp<FC>> jq<enh> a(F $$0, FC $$1, enk... $$2) {
      return a(jq.a(new egb($$0, $$1)), $$2);
   }

   public static <FC extends eit, F extends egp<FC>> jq<enh> a(F $$0, FC $$1) {
      return a($$0, $$1, eeq.c);
   }

   public static <FC extends eit, F extends egp<FC>> jq<enh> a(F $$0, FC $$1, eeq $$2) {
      return a($$0, $$1, emw.a($$2));
   }
}
