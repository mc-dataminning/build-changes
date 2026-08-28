import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tn implements tc {
   private int a = 0;
   private int b = 0;

   public tn() {
   }

   @Override
   public void a(tb $$0) {
      a($$0, dho.eq);
      this.a++;
   }

   private void a(tb $$0, te $$1, boolean $$2) {
      to $$3 = $$0.z();
      String $$4 = String.format("[Run: %4d, Ok: %4d, Fail: %4d", this.a, this.b, this.a - this.b);
      if (!$$3.b()) {
         $$4 = $$4 + String.format(", Left: %4d", $$3.d() - this.a);
      }

      $$4 = $$4 + "]";
      String $$5 = $$0.b() + " " + ($$2 ? "passed" : "failed") + "! " + $$0.k() + "ms";
      String $$6 = String.format("%-53s%s", $$4, $$5);
      if ($$2) {
         a($$0, $$6);
      } else {
         a($$0.f(), n.m, $$6);
      }

      if ($$3.a(this.a, this.b)) {
         $$1.a($$0);
      }
   }

   @Override
   public void a(tb $$0, te $$1) {
      this.b++;
      if ($$0.z().c()) {
         this.a($$0, $$1, true);
      } else if (!$$0.w()) {
         a($$0, $$0.b() + " passed! (" + $$0.k() + "ms)");
      } else {
         if (this.b >= $$0.y()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a($$0.f(), n.k, "Flaky test " + $$0 + " succeeded, attempt: " + this.a + " successes: " + this.b);
            $$1.a($$0);
         }
      }
   }

   @Override
   public void b(tb $$0, te $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         tv $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new sr(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(tb $$0, tb $$1, te $$2) {
      $$1.a(this);
   }

   public static void a(tb $$0, String $$1) {
      b($$0, dho.en);
      b($$0, $$1);
   }

   private static void b(tb $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      tj.b($$0);
   }

   protected static void a(tb $$0, Throwable $$1) {
      b($$0, $$0.q() ? dho.ew : dho.ej);
      c($$0, ad.c($$1));
      b($$0, $$1);
   }

   protected static void b(tb $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ad.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof su $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      tj.a($$0);
   }

   protected static void a(tb $$0, dhm $$1) {
      arj $$2 = $$0.f();
      jf $$3 = b($$0);
      $$2.b($$3, dho.fO.n().a($$0.t()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            jf $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, dho.ci.n());
         }
      }
   }

   private static jf b(tb $$0) {
      jf $$1 = $$0.c();
      jf $$2 = new jf(-1, -2, -1);
      return epi.a($$1.a((kj)$$2), dmj.a, $$0.t(), $$1);
   }

   private static void b(tb $$0, dhm $$1) {
      arj $$2 = $$0.f();
      jf $$3 = b($$0);
      if ($$2.a_($$3).a(dho.fO)) {
         jf $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.n());
      }
   }

   private static void c(tb $$0, String $$1) {
      arj $$2 = $$0.f();
      jf $$3 = $$0.c();
      jf $$4 = new jf(-1, 0, -1);
      jf $$5 = epi.a($$3.a((kj)$$4), dmj.a, $$0.t(), $$3);
      $$2.b($$5, dho.oa.n().a($$0.t()));
      dus $$6 = $$2.a_($$5);
      cvs $$7 = a($$0.b(), $$0.q(), $$1);
      dlx.a(null, $$2, $$5, $$6, $$7);
   }

   private static cvs a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cvs $$4 = new cvs(cvw.ua);
      $$4.b(ks.N, new czd(List.of(asa.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(arj $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xe.b($$2).a($$1)));
   }

   private static void a(arj $$0, jf $$1, String $$2) {
      ago.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
