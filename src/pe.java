import java.util.List;

public class pe {
   public static final duk a = dud.a(dkn.a.e);
   public static final duk b = dud.a(dkn.a.c);
   public static final duk c = dud.a(dkn.a.a);
   public static final duk d = dud.a(dkn.a.d);
   public static final duk e = duc.a(dlh.a(), dlh.b());
   public static final duk f = duc.a(dlh.b(10), dlh.c(10));
   public static final duk g = duc.a(dlh.b(8), dlh.c(8));
   public static final duk h = duc.a(dlh.b(4), dlh.c(4));
   public static final duk i = duc.a(dlh.a(), dlh.a(256));

   public static void a(np<duh> $$0) {
      oy.a($$0);
      oz.a($$0);
      pa.a($$0);
      pb.a($$0);
      pc.a($$0);
      pd.a($$0);
      pf.a($$0);
      pg.a($$0);
      ph.a($$0);
   }

   public static aet<duh> a(String $$0) {
      return aet.a(je.ay, new aeu($$0));
   }

   public static void a(np<duh> $$0, aet<duh> $$1, hg<dne<?, ?>> $$2, List<duk> $$3) {
      $$0.a($$1, new duh($$2, List.copyOf($$3)));
   }

   public static void a(np<duh> $$0, aet<duh> $$1, hg<dne<?, ?>> $$2, duk... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static duk a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bfd<bfy> $$4 = bfd.<bfy>a().a(bfv.a($$0), (int)$$3 - 1).a(bfv.a($$0 + $$2), 1).a();
         return dua.a(new bgf($$4));
      }
   }

   public static duj a() {
      return dtw.a(dlu.c);
   }

   public static dtw a(csq $$0) {
      return dtw.a(dlu.a($$0.n(), gw.b));
   }

   public static hg<duh> a(hg<dne<?, ?>> $$0, duk... $$1) {
      return hg.a(new duh($$0, List.of($$1)));
   }

   public static <FC extends dpv, F extends dnr<FC>> hg<duh> a(F $$0, FC $$1, duk... $$2) {
      return a(hg.a(new dne($$0, $$1)), $$2);
   }

   public static <FC extends dpv, F extends dnr<FC>> hg<duh> a(F $$0, FC $$1) {
      return a($$0, $$1, dlu.c);
   }

   public static <FC extends dpv, F extends dnr<FC>> hg<duh> a(F $$0, FC $$1, dlu $$2) {
      return a($$0, $$1, dtw.a($$2));
   }
}
