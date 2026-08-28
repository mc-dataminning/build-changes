import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tu implements tj {
   private int a = 0;
   private int b = 0;

   public tu() {
   }

   @Override
   public void a(ti $$0) {
      a($$0, dil.eq);
      this.a++;
   }

   private void a(ti $$0, tl $$1, boolean $$2) {
      tv $$3 = $$0.A();
      String $$4 = String.format("[Run: %4d, Ok: %4d, Fail: %4d", this.a, this.b, this.a - this.b);
      if (!$$3.b()) {
         $$4 = $$4 + String.format(", Left: %4d", $$3.d() - this.a);
      }

      $$4 = $$4 + "]";
      String $$5 = $$0.b() + " " + ($$2 ? "passed" : "failed") + "! " + $$0.l() + "ms";
      String $$6 = String.format("%-53s%s", $$4, $$5);
      if ($$2) {
         a($$0, $$6);
      } else {
         a($$0.g(), n.m, $$6);
      }

      if ($$3.a(this.a, this.b)) {
         $$1.a($$0);
      }
   }

   @Override
   public void a(ti $$0, tl $$1) {
      this.b++;
      if ($$0.A().c()) {
         this.a($$0, $$1, true);
      } else if (!$$0.x()) {
         a($$0, $$0.b() + " passed! (" + $$0.l() + "ms)");
      } else {
         if (this.b >= $$0.z()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a($$0.g(), n.k, "Flaky test " + $$0 + " succeeded, attempt: " + this.a + " successes: " + this.b);
            $$1.a($$0);
         }
      }
   }

   @Override
   public void b(ti $$0, tl $$1) {
      if (!$$0.x()) {
         a($$0, $$0.n());
         if ($$0.A().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         uc $$2 = $$0.v();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.g(), n.o, $$3);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            $$1.a($$0);
         } else {
            a($$0, new sy(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(ti $$0, ti $$1, tl $$2) {
      $$1.a(this);
   }

   public static void a(ti $$0, String $$1) {
      b($$0, dil.en);
      b($$0, $$1);
   }

   private static void b(ti $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      tq.b($$0);
   }

   protected static void a(ti $$0, Throwable $$1) {
      b($$0, $$0.r() ? dil.ew : dil.ej);
      c($$0, ae.c($$1));
      b($$0, $$1);
   }

   protected static void b(ti $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ae.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof tb $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      tq.a($$0);
   }

   protected static void a(ti $$0, dij $$1) {
      arq $$2 = $$0.g();
      jh $$3 = b($$0);
      $$2.b($$3, dil.fO.m().a($$0.u()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            jh $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, dil.ci.m());
         }
      }
   }

   private static jh b(ti $$0) {
      jh $$1 = $$0.c();
      jh $$2 = new jh(-1, -2, -1);
      return eqd.a($$1.a((kl)$$2), dnf.a, $$0.u(), $$1);
   }

   private static void b(ti $$0, dij $$1) {
      arq $$2 = $$0.g();
      jh $$3 = b($$0);
      if ($$2.a_($$3).a(dil.fO)) {
         jh $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.m());
      }
   }

   private static void c(ti $$0, String $$1) {
      arq $$2 = $$0.g();
      jh $$3 = $$0.c();
      jh $$4 = new jh(-1, 0, -1);
      jh $$5 = eqd.a($$3.a((kl)$$4), dnf.a, $$0.u(), $$3);
      $$2.b($$5, dil.oa.m().a($$0.u()));
      dvo $$6 = $$2.a_($$5);
      cwf $$7 = a($$0.b(), $$0.r(), $$1);
      dmt.a(null, $$2, $$5, $$6, $$7);
   }

   private static cwf a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cwf $$4 = new cwf(cwj.uq);
      $$4.b(ku.S, new czm(List.of(asi.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(arq $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xl.b($$2).a($$1)));
   }

   private static void a(arq $$0, jh $$1, String $$2) {
      agv.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
