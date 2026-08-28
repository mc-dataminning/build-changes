import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tq implements tf {
   private int a = 0;
   private int b = 0;

   public tq() {
   }

   @Override
   public void a(te $$0) {
      a($$0, dia.eq);
      this.a++;
   }

   private void a(te $$0, th $$1, boolean $$2) {
      tr $$3 = $$0.z();
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
   public void a(te $$0, th $$1) {
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
   public void b(te $$0, th $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         ty $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new su(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(te $$0, te $$1, th $$2) {
      $$1.a(this);
   }

   public static void a(te $$0, String $$1) {
      b($$0, dia.en);
      b($$0, $$1);
   }

   private static void b(te $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      tm.b($$0);
   }

   protected static void a(te $$0, Throwable $$1) {
      b($$0, $$0.q() ? dia.ew : dia.ej);
      c($$0, ad.c($$1));
      b($$0, $$1);
   }

   protected static void b(te $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ad.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof sx $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      tm.a($$0);
   }

   protected static void a(te $$0, dhy $$1) {
      arm $$2 = $$0.f();
      jg $$3 = b($$0);
      $$2.b($$3, dia.fO.m().a($$0.t()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            jg $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, dia.ci.m());
         }
      }
   }

   private static jg b(te $$0) {
      jg $$1 = $$0.c();
      jg $$2 = new jg(-1, -2, -1);
      return ept.a($$1.a((kk)$$2), dmu.a, $$0.t(), $$1);
   }

   private static void b(te $$0, dhy $$1) {
      arm $$2 = $$0.f();
      jg $$3 = b($$0);
      if ($$2.a_($$3).a(dia.fO)) {
         jg $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.m());
      }
   }

   private static void c(te $$0, String $$1) {
      arm $$2 = $$0.f();
      jg $$3 = $$0.c();
      jg $$4 = new jg(-1, 0, -1);
      jg $$5 = ept.a($$3.a((kk)$$4), dmu.a, $$0.t(), $$3);
      $$2.b($$5, dia.oa.m().a($$0.t()));
      dvd $$6 = $$2.a_($$5);
      cvx $$7 = a($$0.b(), $$0.q(), $$1);
      dmi.a(null, $$2, $$5, $$6, $$7);
   }

   private static cvx a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cvx $$4 = new cvx(cwb.ua);
      $$4.b(kt.R, new czc(List.of(ase.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(arm $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xh.b($$2).a($$1)));
   }

   private static void a(arm $$0, jg $$1, String $$2) {
      agr.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
