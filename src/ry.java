import java.util.List;

public class ry {
   public static final eru a = ern.a(ehp.a.e);
   public static final eru b = ern.a(ehp.a.f);
   public static final eru c = ern.a(ehp.a.c);
   public static final eru d = ern.a(ehp.a.a);
   public static final eru e = ern.a(ehp.a.d);
   public static final eru f = erm.a(eij.a(), eij.b());
   public static final eru g = erm.a(eij.b(10), eij.c(10));
   public static final eru h = erm.a(eij.b(8), eij.c(8));
   public static final eru i = erm.a(eij.b(4), eij.c(4));
   public static final eru j = erm.a(eij.a(), eij.a(256));

   public static void a(qi<err> $$0) {
      rs.a($$0);
      rt.a($$0);
      ru.a($$0);
      rv.a($$0);
      rw.a($$0);
      rx.a($$0);
      rz.a($$0);
      sa.a($$0);
      sb.a($$0);
   }

   public static alq<err> a(String $$0) {
      return alq.a(mi.bb, alr.b($$0));
   }

   public static void a(qi<err> $$0, alq<err> $$1, jg<ekh<?, ?>> $$2, List<eru> $$3) {
      $$0.a($$1, new err($$2, List.copyOf($$3)));
   }

   public static void a(qi<err> $$0, alq<err> $$1, jg<ekh<?, ?>> $$2, eru... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static eru a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         btm<buh> $$4 = btm.<buh>b().a(bue.a($$0), (int)$$3 - 1).a(bue.a($$0 + $$2), 1).a();
         return erj.a(new buo($$4));
      }
   }

   public static ert a() {
      return erg.a(eiw.c);
   }

   public static erg a(dno $$0) {
      return erg.a(eiw.a($$0.m(), iw.c));
   }

   public static jg<err> a(jg<ekh<?, ?>> $$0, eru... $$1) {
      return jg.a(new err($$0, List.of($$1)));
   }

   public static <FC extends enb, F extends ekw<FC>> jg<err> a(F $$0, FC $$1, eru... $$2) {
      return a(jg.a(new ekh($$0, $$1)), $$2);
   }

   public static <FC extends enb, F extends ekw<FC>> jg<err> a(F $$0, FC $$1) {
      return a($$0, $$1, eiw.c);
   }

   public static <FC extends enb, F extends ekw<FC>> jg<err> a(F $$0, FC $$1, eiw $$2) {
      return a($$0, $$1, erg.a($$2));
   }
}
