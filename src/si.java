import com.google.common.base.MoreObjects;
import java.util.Arrays;
import org.apache.commons.lang3.exception.ExceptionUtils;

class si implements rx {
   private int a = 0;
   private int b = 0;

   public si() {
   }

   @Override
   public void a(rw $$0) {
      a($$0, dae.eq);
      this.a++;
   }

   private void a(rw $$0, rz $$1, boolean $$2) {
      sj $$3 = $$0.z();
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
   public void a(rw $$0, rz $$1) {
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
   public void b(rw $$0, rz $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         sq $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.i();
         if ($$2.j() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.j() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new rm(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(rw $$0, rw $$1, rz $$2) {
      $$1.a(this);
   }

   public static void a(rw $$0, String $$1) {
      a($$0, dae.en);
      b($$0, $$1);
   }

   private static void b(rw $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      se.b($$0);
   }

   protected static void a(rw $$0, Throwable $$1) {
      a($$0, $$0.q() ? dae.ew : dae.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(rw $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof rp $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      se.a($$0);
   }

   protected static void a(rw $$0, dac $$1) {
      apf $$2 = $$0.f();
      ib $$3 = $$0.c();
      ib $$4 = new ib(-1, -1, -1);
      ib $$5 = ehe.a($$3.a((jg)$$4), dey.a, $$0.t(), $$3);
      $$2.b($$5, dae.fO.o().a($$0.t()));
      ib $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.o());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            ib $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, dae.ci.o());
         }
      }
   }

   private static void c(rw $$0, String $$1) {
      apf $$2 = $$0.f();
      ib $$3 = $$0.c();
      ib $$4 = new ib(-1, 1, -1);
      ib $$5 = ehe.a($$3.a((jg)$$4), dey.a, $$0.t(), $$3);
      $$2.b($$5, dae.oa.o().a($$0.t()));
      dnb $$6 = $$2.a_($$5);
      cqm $$7 = a($$0.b(), $$0.q(), $$1);
      dem.a(null, $$2, $$5, $$6, $$7);
   }

   private static cqm a(String $$0, boolean $$1, String $$2) {
      cqm $$3 = new cqm(cqp.tY);
      tg $$4 = new tg();
      StringBuffer $$5 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$5.append($$1x).append('\n'));
      if (!$$1) {
         $$5.append("(optional)\n");
      }

      $$5.append("-------------------\n");
      $$4.add(tv.a($$5 + $$2));
      $$3.a("pages", $$4);
      return $$3;
   }

   protected static void a(apf $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vu.b($$2).a($$1)));
   }

   private static void a(apf $$0, ib $$1, String $$2) {
      aew.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
