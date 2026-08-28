import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tf implements su {
   private int a = 0;
   private int b = 0;

   public tf() {
   }

   @Override
   public void a(st $$0) {
      a($$0, dfj.eq);
      this.a++;
   }

   private void a(st $$0, sw $$1, boolean $$2) {
      tg $$3 = $$0.z();
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
   public void a(st $$0, sw $$1) {
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
   public void b(st $$0, sw $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         tn $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new sj(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(st $$0, st $$1, sw $$2) {
      $$1.a(this);
   }

   public static void a(st $$0, String $$1) {
      a($$0, dfj.en);
      b($$0, $$1);
   }

   private static void b(st $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      tb.b($$0);
   }

   protected static void a(st $$0, Throwable $$1) {
      a($$0, $$0.q() ? dfj.ew : dfj.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(st $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof sm $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      tb.a($$0);
   }

   protected static void a(st $$0, dfh $$1) {
      aqm $$2 = $$0.f();
      ja $$3 = $$0.c();
      ja $$4 = new ja(-1, -2, -1);
      ja $$5 = emw.a($$3.a((ke)$$4), dke.a, $$0.t(), $$3);
      $$2.b($$5, dfj.fO.o().a($$0.t()));
      ja $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.o());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            ja $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, dfj.ci.o());
         }
      }
   }

   private static void c(st $$0, String $$1) {
      aqm $$2 = $$0.f();
      ja $$3 = $$0.c();
      ja $$4 = new ja(-1, 0, -1);
      ja $$5 = emw.a($$3.a((ke)$$4), dke.a, $$0.t(), $$3);
      $$2.b($$5, dfj.oa.o().a($$0.t()));
      dsk $$6 = $$2.a_($$5);
      cuc $$7 = a($$0.b(), $$0.q(), $$1);
      djs.a(null, $$2, $$5, $$6, $$7);
   }

   private static cuc a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cuc $$4 = new cuc(cuf.tZ);
      $$4.b(kn.I, new cxj(List.of(ard.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(aqm $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wu.b($$2).a($$1)));
   }

   private static void a(aqm $$0, ja $$1, String $$2) {
      afy.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
