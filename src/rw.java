import java.util.List;

public class rw {
   public static final eon a = eog.a(eel.a.e);
   public static final eon b = eog.a(eel.a.f);
   public static final eon c = eog.a(eel.a.c);
   public static final eon d = eog.a(eel.a.a);
   public static final eon e = eog.a(eel.a.d);
   public static final eon f = eof.a(eff.a(), eff.b());
   public static final eon g = eof.a(eff.b(10), eff.c(10));
   public static final eon h = eof.a(eff.b(8), eff.c(8));
   public static final eon i = eof.a(eff.b(4), eff.c(4));
   public static final eon j = eof.a(eff.a(), eff.a(256));

   public static void a(qg<eok> $$0) {
      rq.a($$0);
      rr.a($$0);
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
      rv.a($$0);
      rx.a($$0);
      ry.a($$0);
      rz.a($$0);
   }

   public static alc<eok> a(String $$0) {
      return alc.a(me.aY, ald.b($$0));
   }

   public static void a(qg<eok> $$0, alc<eok> $$1, js<ehd<?, ?>> $$2, List<eon> $$3) {
      $$0.a($$1, new eok($$2, List.copyOf($$3)));
   }

   public static void a(qg<eok> $$0, alc<eok> $$1, js<ehd<?, ?>> $$2, eon... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eon a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bsb<bsv> $$4 = bsb.<bsv>b().a(bss.a($$0), (int)$$3 - 1).a(bss.a($$0 + $$2), 1).a();
         return eoc.a(new btc($$4));
      }
   }

   public static eom a() {
      return enz.a(efs.c);
   }

   public static enz a(dku $$0) {
      return enz.a(efs.a($$0.m(), jj.c));
   }

   public static js<eok> a(js<ehd<?, ?>> $$0, eon... $$1) {
      return js.a(new eok($$0, List.of($$1)));
   }

   public static <FC extends ejv, F extends ehr<FC>> js<eok> a(F $$0, FC $$1, eon... $$2) {
      return a(js.a(new ehd($$0, $$1)), $$2);
   }

   public static <FC extends ejv, F extends ehr<FC>> js<eok> a(F $$0, FC $$1) {
      return a($$0, $$1, efs.c);
   }

   public static <FC extends ejv, F extends ehr<FC>> js<eok> a(F $$0, FC $$1, efs $$2) {
      return a($$0, $$1, enz.a($$2));
   }
}
