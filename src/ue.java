import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class ue implements tt {
   private int a = 0;
   private int b = 0;

   public ue() {
   }

   @Override
   public void a(ts $$0) {
      a($$0, dkg.eD);
      this.a++;
   }

   private void a(ts $$0, tv $$1, boolean $$2) {
      uf $$3 = $$0.A();
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
   public void a(ts $$0, tv $$1) {
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
   public void b(ts $$0, tv $$1) {
      if (!$$0.x()) {
         a($$0, $$0.n());
         if ($$0.A().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         um $$2 = $$0.v();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.g(), n.o, $$3);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            $$1.a($$0);
         } else {
            a($$0, new ti(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(ts $$0, ts $$1, tv $$2) {
      $$1.a(this);
   }

   public static void a(ts $$0, String $$1) {
      b($$0, dkg.eA);
      b($$0, $$1);
   }

   private static void b(ts $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      ua.b($$0);
   }

   protected static void a(ts $$0, Throwable $$1) {
      b($$0, $$0.r() ? dkg.eJ : dkg.ew);
      c($$0, ae.c($$1));
      b($$0, $$1);
   }

   protected static void b(ts $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ae.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof tl $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      ua.a($$0);
   }

   protected static void a(ts $$0, dke $$1) {
      ash $$2 = $$0.g();
      jh $$3 = b($$0);
      $$2.b($$3, dkg.gc.m().a($$0.u()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            jh $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, dkg.cp.m());
         }
      }
   }

   private static jh b(ts $$0) {
      jh $$1 = $$0.c();
      jh $$2 = new jh(-1, -2, -1);
      return ese.a($$1.a((kl)$$2), dpd.a, $$0.u(), $$1);
   }

   private static void b(ts $$0, dke $$1) {
      ash $$2 = $$0.g();
      jh $$3 = b($$0);
      if ($$2.a_($$3).a(dkg.gc)) {
         jh $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.m());
      }
   }

   private static void c(ts $$0, String $$1) {
      ash $$2 = $$0.g();
      jh $$3 = $$0.c();
      jh $$4 = new jh(-1, 0, -1);
      jh $$5 = ese.a($$3.a((kl)$$4), dpd.a, $$0.u(), $$3);
      $$2.b($$5, dkg.ov.m().a($$0.u()));
      dxn $$6 = $$2.a_($$5);
      cxk $$7 = a($$0.b(), $$0.r(), $$1);
      dor.a(null, $$2, $$5, $$6, $$7);
   }

   private static cxk a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cxk $$4 = new cxk(cxo.uO);
      $$4.b(ku.S, new dar(List.of(asz.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(ash $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(xv.b($$2).a($$1)));
   }

   private static void a(ash $$0, jh $$1, String $$2) {
      ahj.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
