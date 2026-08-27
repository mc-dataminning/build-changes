import java.util.List;

public class si {
   public static final egq a = egj.a(dwt.a.e);
   public static final egq b = egj.a(dwt.a.c);
   public static final egq c = egj.a(dwt.a.a);
   public static final egq d = egj.a(dwt.a.d);
   public static final egq e = egi.a(dxn.a(), dxn.b());
   public static final egq f = egi.a(dxn.b(10), dxn.c(10));
   public static final egq g = egi.a(dxn.b(8), dxn.c(8));
   public static final egq h = egi.a(dxn.b(4), dxn.c(4));
   public static final egq i = egi.a(dxn.a(), dxn.a(256));

   public static void a(qo<egn> $$0) {
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
      sg.a($$0);
      sh.a($$0);
      sj.a($$0);
      sk.a($$0);
      sl.a($$0);
   }

   public static akl<egn> a(String $$0) {
      return akl.a(lf.aI, new akm($$0));
   }

   public static void a(qo<egn> $$0, akl<egn> $$1, ix<dzk<?, ?>> $$2, List<egq> $$3) {
      $$0.a($$1, new egn($$2, List.copyOf($$3)));
   }

   public static void a(qo<egn> $$0, akl<egn> $$1, ix<dzk<?, ?>> $$2, egq... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static egq a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         boe<boz> $$4 = boe.<boz>a().a(bow.a($$0), (int)$$3 - 1).a(bow.a($$0 + $$2), 1).a();
         return egg.a(new bpg($$4));
      }
   }

   public static egp a() {
      return egc.a(dya.c);
   }

   public static egc a(ddy $$0) {
      return egc.a(dya.a($$0.n(), io.c));
   }

   public static ix<egn> a(ix<dzk<?, ?>> $$0, egq... $$1) {
      return ix.a(new egn($$0, List.of($$1)));
   }

   public static <FC extends ecb, F extends dzx<FC>> ix<egn> a(F $$0, FC $$1, egq... $$2) {
      return a(ix.a(new dzk($$0, $$1)), $$2);
   }

   public static <FC extends ecb, F extends dzx<FC>> ix<egn> a(F $$0, FC $$1) {
      return a($$0, $$1, dya.c);
   }

   public static <FC extends ecb, F extends dzx<FC>> ix<egn> a(F $$0, FC $$1, dya $$2) {
      return a($$0, $$1, egc.a($$2));
   }
}
