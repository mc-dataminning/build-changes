import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tz implements to {
   private int a = 0;
   private int b = 0;

   public tz() {
   }

   @Override
   public void a(tn $$0) {
      a($$0, dew.eq);
      this.a++;
   }

   private void a(tn $$0, tq $$1, boolean $$2) {
      ua $$3 = $$0.z();
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
   public void a(tn $$0, tq $$1) {
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
   public void b(tn $$0, tq $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         uh $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new td(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(tn $$0, tn $$1, tq $$2) {
      $$1.a(this);
   }

   public static void a(tn $$0, String $$1) {
      a($$0, dew.en);
      b($$0, $$1);
   }

   private static void b(tn $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      tv.b($$0);
   }

   protected static void a(tn $$0, Throwable $$1) {
      a($$0, $$0.q() ? dew.ew : dew.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(tn $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof tg $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      tv.a($$0);
   }

   protected static void a(tn $$0, deu $$1) {
      arb $$2 = $$0.f();
      iz $$3 = $$0.c();
      iz $$4 = new iz(-1, -2, -1);
      iz $$5 = emf.a($$3.a((kd)$$4), djr.a, $$0.t(), $$3);
      $$2.b($$5, dew.fO.n().a($$0.t()));
      iz $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.n());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            iz $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, dew.ci.n());
         }
      }
   }

   private static void c(tn $$0, String $$1) {
      arb $$2 = $$0.f();
      iz $$3 = $$0.c();
      iz $$4 = new iz(-1, 0, -1);
      iz $$5 = emf.a($$3.a((kd)$$4), djr.a, $$0.t(), $$3);
      $$2.b($$5, dew.oa.n().a($$0.t()));
      drx $$6 = $$2.a_($$5);
      cuk $$7 = a($$0.b(), $$0.q(), $$1);
      djf.a(null, $$2, $$5, $$6, $$7);
   }

   private static cuk a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cuk $$4 = new cuk(cun.tZ);
      $$4.b(km.H, new cxs(List.of(ars.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(arb $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xl.b($$2).a($$1)));
   }

   private static void a(arb $$0, iz $$1, String $$2) {
      agp.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
