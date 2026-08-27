import java.util.List;

public class sd {
   public static final efn a = efg.a(dvq.a.e);
   public static final efn b = efg.a(dvq.a.c);
   public static final efn c = efg.a(dvq.a.a);
   public static final efn d = efg.a(dvq.a.d);
   public static final efn e = eff.a(dwk.a(), dwk.b());
   public static final efn f = eff.a(dwk.b(10), dwk.c(10));
   public static final efn g = eff.a(dwk.b(8), dwk.c(8));
   public static final efn h = eff.a(dwk.b(4), dwk.c(4));
   public static final efn i = eff.a(dwk.a(), dwk.a(256));

   public static void a(qj<efk> $$0) {
      rx.a($$0);
      ry.a($$0);
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
      sc.a($$0);
      se.a($$0);
      sf.a($$0);
      sg.a($$0);
   }

   public static ake<efk> a(String $$0) {
      return ake.a(ld.aH, new akf($$0));
   }

   public static void a(qj<efk> $$0, ake<efk> $$1, iv<dyh<?, ?>> $$2, List<efn> $$3) {
      $$0.a($$1, new efk($$2, List.copyOf($$3)));
   }

   public static void a(qj<efk> $$0, ake<efk> $$1, iv<dyh<?, ?>> $$2, efn... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static efn a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bna<bnv> $$4 = bna.<bnv>a().a(bns.a($$0), (int)$$3 - 1).a(bns.a($$0 + $$2), 1).a();
         return efd.a(new boc($$4));
      }
   }

   public static efm a() {
      return eez.a(dwx.c);
   }

   public static eez a(dcv $$0) {
      return eez.a(dwx.a($$0.n(), im.c));
   }

   public static iv<efk> a(iv<dyh<?, ?>> $$0, efn... $$1) {
      return iv.a(new efk($$0, List.of($$1)));
   }

   public static <FC extends eay, F extends dyu<FC>> iv<efk> a(F $$0, FC $$1, efn... $$2) {
      return a(iv.a(new dyh($$0, $$1)), $$2);
   }

   public static <FC extends eay, F extends dyu<FC>> iv<efk> a(F $$0, FC $$1) {
      return a($$0, $$1, dwx.c);
   }

   public static <FC extends eay, F extends dyu<FC>> iv<efk> a(F $$0, FC $$1, dwx $$2) {
      return a($$0, $$1, eez.a($$2));
   }
}
