import java.util.List;

public class pb {
   public static final duf a = dty.a(dki.a.e);
   public static final duf b = dty.a(dki.a.c);
   public static final duf c = dty.a(dki.a.a);
   public static final duf d = dty.a(dki.a.d);
   public static final duf e = dtx.a(dlc.a(), dlc.b());
   public static final duf f = dtx.a(dlc.b(10), dlc.c(10));
   public static final duf g = dtx.a(dlc.b(8), dlc.c(8));
   public static final duf h = dtx.a(dlc.b(4), dlc.c(4));
   public static final duf i = dtx.a(dlc.a(), dlc.a(256));

   public static void a(nm<duc> $$0) {
      ov.a($$0);
      ow.a($$0);
      ox.a($$0);
      oy.a($$0);
      oz.a($$0);
      pa.a($$0);
      pc.a($$0);
      pd.a($$0);
      pe.a($$0);
   }

   public static aeq<duc> a(String $$0) {
      return aeq.a(jc.ay, new aer($$0));
   }

   public static void a(nm<duc> $$0, aeq<duc> $$1, he<dmz<?, ?>> $$2, List<duf> $$3) {
      $$0.a($$1, new duc($$2, List.copyOf($$3)));
   }

   public static void a(nm<duc> $$0, aeq<duc> $$1, he<dmz<?, ?>> $$2, duf... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static duf a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfa<bfv> $$4 = bfa.<bfv>a().a(bfs.a($$0), (int)$$3 - 1).a(bfs.a($$0 + $$2), 1).a();
         return dtv.a(new bgc($$4));
      }
   }

   public static due a() {
      return dtr.a(dlp.c);
   }

   public static dtr a(csl $$0) {
      return dtr.a(dlp.a($$0.n(), gu.b));
   }

   public static he<duc> a(he<dmz<?, ?>> $$0, duf... $$1) {
      return he.a(new duc($$0, List.of($$1)));
   }

   public static <FC extends dpq, F extends dnm<FC>> he<duc> a(F $$0, FC $$1, duf... $$2) {
      return a(he.a(new dmz($$0, $$1)), $$2);
   }

   public static <FC extends dpq, F extends dnm<FC>> he<duc> a(F $$0, FC $$1) {
      return a($$0, $$1, dlp.c);
   }

   public static <FC extends dpq, F extends dnm<FC>> he<duc> a(F $$0, FC $$1, dlp $$2) {
      return a($$0, $$1, dtr.a($$2));
   }
}
