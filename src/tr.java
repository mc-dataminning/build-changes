import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tr implements tg {
   private int a = 0;
   private int b = 0;

   public tr() {
   }

   @Override
   public void a(tf $$0) {
      a($$0, dig.eq);
      this.a++;
   }

   private void a(tf $$0, ti $$1, boolean $$2) {
      ts $$3 = $$0.z();
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
   public void a(tf $$0, ti $$1) {
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
   public void b(tf $$0, ti $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         tz $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new sv(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(tf $$0, tf $$1, ti $$2) {
      $$1.a(this);
   }

   public static void a(tf $$0, String $$1) {
      b($$0, dig.en);
      b($$0, $$1);
   }

   private static void b(tf $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      tn.b($$0);
   }

   protected static void a(tf $$0, Throwable $$1) {
      b($$0, $$0.q() ? dig.ew : dig.ej);
      c($$0, ae.c($$1));
      b($$0, $$1);
   }

   protected static void b(tf $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ae.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof sy $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      tn.a($$0);
   }

   protected static void a(tf $$0, die $$1) {
      arn $$2 = $$0.f();
      jh $$3 = b($$0);
      $$2.b($$3, dig.fO.m().a($$0.t()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            jh $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, dig.ci.m());
         }
      }
   }

   private static jh b(tf $$0) {
      jh $$1 = $$0.c();
      jh $$2 = new jh(-1, -2, -1);
      return epz.a($$1.a((kl)$$2), dna.a, $$0.t(), $$1);
   }

   private static void b(tf $$0, die $$1) {
      arn $$2 = $$0.f();
      jh $$3 = b($$0);
      if ($$2.a_($$3).a(dig.fO)) {
         jh $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.m());
      }
   }

   private static void c(tf $$0, String $$1) {
      arn $$2 = $$0.f();
      jh $$3 = $$0.c();
      jh $$4 = new jh(-1, 0, -1);
      jh $$5 = epz.a($$3.a((kl)$$4), dna.a, $$0.t(), $$3);
      $$2.b($$5, dig.oa.m().a($$0.t()));
      dvj $$6 = $$2.a_($$5);
      cwb $$7 = a($$0.b(), $$0.q(), $$1);
      dmo.a(null, $$2, $$5, $$6, $$7);
   }

   private static cwb a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cwb $$4 = new cwb(cwf.ua);
      $$4.b(ku.S, new czi(List.of(asf.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(arn $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xi.b($$2).a($$1)));
   }

   private static void a(arn $$0, jh $$1, String $$2) {
      ags.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
