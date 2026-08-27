import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class sw implements sl {
   private int a = 0;
   private int b = 0;

   public sw() {
   }

   @Override
   public void a(sk $$0) {
      a($$0, dcj.eq);
      this.a++;
   }

   private void a(sk $$0, sn $$1, boolean $$2) {
      sx $$3 = $$0.z();
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
   public void a(sk $$0, sn $$1) {
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
   public void b(sk $$0, sn $$1) {
      if (!$$0.w()) {
         a($$0, $$0.m());
         if ($$0.z().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         te $$2 = $$0.u();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.f(), n.o, $$3);
         if ($$0.x() - this.a + this.b >= $$0.y()) {
            $$1.a($$0);
         } else {
            a($$0, new sa(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(sk $$0, sk $$1, sn $$2) {
      $$1.a(this);
   }

   public static void a(sk $$0, String $$1) {
      a($$0, dcj.en);
      b($$0, $$1);
   }

   private static void b(sk $$0, String $$1) {
      a($$0.f(), n.k, $$1);
      ss.b($$0);
   }

   protected static void a(sk $$0, Throwable $$1) {
      a($$0, $$0.q() ? dcj.ew : dcj.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(sk $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.q() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.f(), $$0.q() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof sd $$5) {
         a($$0.f(), $$5.c(), $$5.a());
      }

      ss.a($$0);
   }

   protected static void a(sk $$0, dch $$1) {
      apu $$2 = $$0.f();
      id $$3 = $$0.c();
      id $$4 = new id(-1, -1, -1);
      id $$5 = ejq.a($$3.a((ji)$$4), dhd.a, $$0.t(), $$3);
      $$2.b($$5, dcj.fO.n().a($$0.t()));
      id $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.n());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            id $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, dcj.ci.n());
         }
      }
   }

   private static void c(sk $$0, String $$1) {
      apu $$2 = $$0.f();
      id $$3 = $$0.c();
      id $$4 = new id(-1, 1, -1);
      id $$5 = ejq.a($$3.a((ji)$$4), dhd.a, $$0.t(), $$3);
      $$2.b($$5, dcj.oa.n().a($$0.t()));
      dpi $$6 = $$2.a_($$5);
      crs $$7 = a($$0.b(), $$0.q(), $$1);
      dgr.a(null, $$2, $$5, $$6, $$7);
   }

   private static crs a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      crs $$4 = new crs(crv.tY);
      $$4.b(jr.z, new cuu(List.of(aql.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(apu $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wi.b($$2).a($$1)));
   }

   private static void a(apu $$0, id $$1, String $$2) {
      afk.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
