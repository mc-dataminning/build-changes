import java.util.List;

public class rd {
   public static final ebn a = ebg.a(drq.a.e);
   public static final ebn b = ebg.a(drq.a.c);
   public static final ebn c = ebg.a(drq.a.a);
   public static final ebn d = ebg.a(drq.a.d);
   public static final ebn e = ebf.a(dsk.a(), dsk.b());
   public static final ebn f = ebf.a(dsk.b(10), dsk.c(10));
   public static final ebn g = ebf.a(dsk.b(8), dsk.c(8));
   public static final ebn h = ebf.a(dsk.b(4), dsk.c(4));
   public static final ebn i = ebf.a(dsk.a(), dsk.a(256));

   public static void a(pj<ebk> $$0) {
      qx.a($$0);
      qy.a($$0);
      qz.a($$0);
      ra.a($$0);
      rb.a($$0);
      rc.a($$0);
      re.a($$0);
      rf.a($$0);
      rg.a($$0);
   }

   public static ajb<ebk> a(String $$0) {
      return ajb.a(ki.aD, new ajc($$0));
   }

   public static void a(pj<ebk> $$0, ajb<ebk> $$1, il<duh<?, ?>> $$2, List<ebn> $$3) {
      $$0.a($$1, new ebk($$2, List.copyOf($$3)));
   }

   public static void a(pj<ebk> $$0, ajb<ebk> $$1, il<duh<?, ?>> $$2, ebn... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static ebn a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bkv<blq> $$4 = bkv.<blq>a().a(bln.a($$0), (int)$$3 - 1).a(bln.a($$0 + $$2), 1).a();
         return ebd.a(new blx($$4));
      }
   }

   public static ebm a() {
      return eaz.a(dsx.c);
   }

   public static eaz a(czf $$0) {
      return eaz.a(dsx.a($$0.o(), ib.c));
   }

   public static il<ebk> a(il<duh<?, ?>> $$0, ebn... $$1) {
      return il.a(new ebk($$0, List.of($$1)));
   }

   public static <FC extends dwy, F extends duu<FC>> il<ebk> a(F $$0, FC $$1, ebn... $$2) {
      return a(il.a(new duh($$0, $$1)), $$2);
   }

   public static <FC extends dwy, F extends duu<FC>> il<ebk> a(F $$0, FC $$1) {
      return a($$0, $$1, dsx.c);
   }

   public static <FC extends dwy, F extends duu<FC>> il<ebk> a(F $$0, FC $$1, dsx $$2) {
      return a($$0, $$1, eaz.a($$2));
   }
}
