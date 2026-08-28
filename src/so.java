import java.util.List;

public class so {
   public static final ele a = ekx.a(ebf.a.e);
   public static final ele b = ekx.a(ebf.a.c);
   public static final ele c = ekx.a(ebf.a.a);
   public static final ele d = ekx.a(ebf.a.d);
   public static final ele e = ekw.a(ebz.a(), ebz.b());
   public static final ele f = ekw.a(ebz.b(10), ebz.c(10));
   public static final ele g = ekw.a(ebz.b(8), ebz.c(8));
   public static final ele h = ekw.a(ebz.b(4), ebz.c(4));
   public static final ele i = ekw.a(ebz.a(), ebz.a(256));

   public static void a(qy<elb> $$0) {
      si.a($$0);
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
      sm.a($$0);
      sn.a($$0);
      sp.a($$0);
      sq.a($$0);
      sr.a($$0);
   }

   public static alh<elb> a(String $$0) {
      return alh.a(lz.aR, ali.b($$0));
   }

   public static void a(qy<elb> $$0, alh<elb> $$1, jq<edx<?, ?>> $$2, List<ele> $$3) {
      $$0.a($$1, new elb($$2, List.copyOf($$3)));
   }

   public static void a(qy<elb> $$0, alh<elb> $$1, jq<edx<?, ?>> $$2, ele... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ele a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bql<bri> $$4 = bql.<bri>a().a(brf.a($$0), (int)$$3 - 1).a(brf.a($$0 + $$2), 1).a();
         return ekt.a(new brp($$4));
      }
   }

   public static eld a() {
      return ekq.a(ecm.c);
   }

   public static ekq a(die $$0) {
      return ekq.a(ecm.a($$0.m(), jh.c));
   }

   public static jq<elb> a(jq<edx<?, ?>> $$0, ele... $$1) {
      return jq.a(new elb($$0, List.of($$1)));
   }

   public static <FC extends egp, F extends eel<FC>> jq<elb> a(F $$0, FC $$1, ele... $$2) {
      return a(jq.a(new edx($$0, $$1)), $$2);
   }

   public static <FC extends egp, F extends eel<FC>> jq<elb> a(F $$0, FC $$1) {
      return a($$0, $$1, ecm.c);
   }

   public static <FC extends egp, F extends eel<FC>> jq<elb> a(F $$0, FC $$1, ecm $$2) {
      return a($$0, $$1, ekq.a($$2));
   }
}
