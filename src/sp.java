import java.util.List;

public class sp {
   public static final elp a = eli.a(ebq.a.e);
   public static final elp b = eli.a(ebq.a.c);
   public static final elp c = eli.a(ebq.a.a);
   public static final elp d = eli.a(ebq.a.d);
   public static final elp e = elh.a(eck.a(), eck.b());
   public static final elp f = elh.a(eck.b(10), eck.c(10));
   public static final elp g = elh.a(eck.b(8), eck.c(8));
   public static final elp h = elh.a(eck.b(4), eck.c(4));
   public static final elp i = elh.a(eck.a(), eck.a(256));

   public static void a(qz<elm> $$0) {
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

   public static ali<elm> a(String $$0) {
      return ali.a(ma.aR, alj.b($$0));
   }

   public static void a(qz<elm> $$0, ali<elm> $$1, jq<eei<?, ?>> $$2, List<elp> $$3) {
      $$0.a($$1, new elm($$2, List.copyOf($$3)));
   }

   public static void a(qz<elm> $$0, ali<elm> $$1, jq<eei<?, ?>> $$2, elp... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static elp a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bqs<brp> $$4 = bqs.<brp>a().a(brm.a($$0), (int)$$3 - 1).a(brm.a($$0 + $$2), 1).a();
         return ele.a(new brw($$4));
      }
   }

   public static elo a() {
      return elb.a(ecx.c);
   }

   public static elb a(diq $$0) {
      return elb.a(ecx.a($$0.m(), jh.c));
   }

   public static jq<elm> a(jq<eei<?, ?>> $$0, elp... $$1) {
      return jq.a(new elm($$0, List.of($$1)));
   }

   public static <FC extends eha, F extends eew<FC>> jq<elm> a(F $$0, FC $$1, elp... $$2) {
      return a(jq.a(new eei($$0, $$1)), $$2);
   }

   public static <FC extends eha, F extends eew<FC>> jq<elm> a(F $$0, FC $$1) {
      return a($$0, $$1, ecx.c);
   }

   public static <FC extends eha, F extends eew<FC>> jq<elm> a(F $$0, FC $$1, ecx $$2) {
      return a($$0, $$1, elb.a($$2));
   }
}
