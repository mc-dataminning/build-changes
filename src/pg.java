import java.util.List;

public class pg {
   public static final duj a = duc.a(dkm.a.e);
   public static final duj b = duc.a(dkm.a.c);
   public static final duj c = duc.a(dkm.a.a);
   public static final duj d = duc.a(dkm.a.d);
   public static final duj e = dub.a(dlg.a(), dlg.b());
   public static final duj f = dub.a(dlg.b(10), dlg.c(10));
   public static final duj g = dub.a(dlg.b(8), dlg.c(8));
   public static final duj h = dub.a(dlg.b(4), dlg.c(4));
   public static final duj i = dub.a(dlg.a(), dlg.a(256));

   public static void a(nr<dug> $$0) {
      pa.a($$0);
      pb.a($$0);
      pc.a($$0);
      pd.a($$0);
      pe.a($$0);
      pf.a($$0);
      ph.a($$0);
      pi.a($$0);
      pj.a($$0);
   }

   public static aey<dug> a(String $$0) {
      return aey.a(jc.az, new aez($$0));
   }

   public static void a(nr<dug> $$0, aey<dug> $$1, he<dnd<?, ?>> $$2, List<duj> $$3) {
      $$0.a($$1, new dug($$2, List.copyOf($$3)));
   }

   public static void a(nr<dug> $$0, aey<dug> $$1, he<dnd<?, ?>> $$2, duj... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static duj a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfo<bgj> $$4 = bfo.<bgj>a().a(bgg.a($$0), (int)$$3 - 1).a(bgg.a($$0 + $$2), 1).a();
         return dtz.a(new bgq($$4));
      }
   }

   public static dui a() {
      return dtv.a(dlt.c);
   }

   public static dtv a(ctc $$0) {
      return dtv.a(dlt.a($$0.o(), gw.b));
   }

   public static he<dug> a(he<dnd<?, ?>> $$0, duj... $$1) {
      return he.a(new dug($$0, List.of($$1)));
   }

   public static <FC extends dpu, F extends dnq<FC>> he<dug> a(F $$0, FC $$1, duj... $$2) {
      return a(he.a(new dnd($$0, $$1)), $$2);
   }

   public static <FC extends dpu, F extends dnq<FC>> he<dug> a(F $$0, FC $$1) {
      return a($$0, $$1, dlt.c);
   }

   public static <FC extends dpu, F extends dnq<FC>> he<dug> a(F $$0, FC $$1, dlt $$2) {
      return a($$0, $$1, dtv.a($$2));
   }
}
