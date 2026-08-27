import java.util.List;

public class pc {
   public static final due a = dtx.a(dkh.a.e);
   public static final due b = dtx.a(dkh.a.c);
   public static final due c = dtx.a(dkh.a.a);
   public static final due d = dtx.a(dkh.a.d);
   public static final due e = dtw.a(dlb.a(), dlb.b());
   public static final due f = dtw.a(dlb.b(10), dlb.c(10));
   public static final due g = dtw.a(dlb.b(8), dlb.c(8));
   public static final due h = dtw.a(dlb.b(4), dlb.c(4));
   public static final due i = dtw.a(dlb.a(), dlb.a(256));

   public static void a(nn<dub> $$0) {
      ow.a($$0);
      ox.a($$0);
      oy.a($$0);
      oz.a($$0);
      pa.a($$0);
      pb.a($$0);
      pd.a($$0);
      pe.a($$0);
      pf.a($$0);
   }

   public static aeo<dub> a(String $$0) {
      return aeo.a(jd.ay, new aep($$0));
   }

   public static void a(nn<dub> $$0, aeo<dub> $$1, hf<dmy<?, ?>> $$2, List<due> $$3) {
      $$0.a($$1, new dub($$2, List.copyOf($$3)));
   }

   public static void a(nn<dub> $$0, aeo<dub> $$1, hf<dmy<?, ?>> $$2, due... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static due a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bey<bft> $$4 = bey.<bft>a().a(bfq.a($$0), (int)$$3 - 1).a(bfq.a($$0 + $$2), 1).a();
         return dtu.a(new bga($$4));
      }
   }

   public static dud a() {
      return dtq.a(dlo.c);
   }

   public static dtq a(csk $$0) {
      return dtq.a(dlo.a($$0.n(), gv.b));
   }

   public static hf<dub> a(hf<dmy<?, ?>> $$0, due... $$1) {
      return hf.a(new dub($$0, List.of($$1)));
   }

   public static <FC extends dpp, F extends dnl<FC>> hf<dub> a(F $$0, FC $$1, due... $$2) {
      return a(hf.a(new dmy($$0, $$1)), $$2);
   }

   public static <FC extends dpp, F extends dnl<FC>> hf<dub> a(F $$0, FC $$1) {
      return a($$0, $$1, dlo.c);
   }

   public static <FC extends dpp, F extends dnl<FC>> hf<dub> a(F $$0, FC $$1, dlo $$2) {
      return a($$0, $$1, dtq.a($$2));
   }
}
