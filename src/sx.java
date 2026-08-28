import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;

class sx implements sm {
   private int a = 0;
   private int b = 0;

   public sx() {
   }

   @Override
   public void a(sl $$0) {
      a($$0, djo.eD);
      this.a++;
   }

   private void a(sl $$0, so $$1, boolean $$2) {
      sy $$3 = $$0.A();
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
   public void a(sl $$0, so $$1) {
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
   public void b(sl $$0, so $$1) {
      if (!$$0.x()) {
         a($$0, $$0.n());
         if ($$0.A().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         tf $$2 = $$0.v();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.g(), n.o, $$3);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            $$1.a($$0);
         } else {
            a($$0, new sb(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(sl $$0, sl $$1, so $$2) {
      $$1.a(this);
   }

   public static void a(sl $$0, String $$1) {
      b($$0, djo.eA);
      b($$0, $$1);
   }

   private static void b(sl $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      st.b($$0);
   }

   protected static void a(sl $$0, Throwable $$1) {
      b($$0, $$0.r() ? djo.eJ : djo.ew);
      c($$0, af.c($$1));
      b($$0, $$1);
   }

   protected static void b(sl $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + af.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof se $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      st.a($$0);
   }

   protected static void a(sl $$0, djm $$1) {
      ard $$2 = $$0.g();
      ji $$3 = b($$0);
      $$2.b($$3, djo.gj.m().a($$0.u()));
      b($$0, $$1);

      for (int $$4 = -1; $$4 <= 1; $$4++) {
         for (int $$5 = -1; $$5 <= 1; $$5++) {
            ji $$6 = $$3.b($$4, -1, $$5);
            $$2.b($$6, djo.cp.m());
         }
      }
   }

   private static ji b(sl $$0) {
      ji $$1 = $$0.c();
      ji $$2 = new ji(-1, -2, -1);
      return ero.a($$1.a((km)$$2), dol.a, $$0.u(), $$1);
   }

   private static void b(sl $$0, djm $$1) {
      ard $$2 = $$0.g();
      ji $$3 = b($$0);
      if ($$2.a_($$3).a(djo.gj)) {
         ji $$4 = $$3.b(0, 1, 0);
         $$2.b($$4, $$1.m());
      }
   }

   private static void c(sl $$0, String $$1) {
      ard $$2 = $$0.g();
      ji $$3 = $$0.c();
      ji $$4 = new ji(-1, 0, -1);
      ji $$5 = ero.a($$3.a((km)$$4), dol.a, $$0.u(), $$3);
      $$2.b($$5, djo.oC.m().a($$0.u()));
      dwx $$6 = $$2.a_($$5);
      cwp $$7 = a($$0.b(), $$0.r(), $$1);
      dnz.a(null, $$2, $$5, $$6, $$7);
   }

   private static cwp a(String $$0, boolean $$1, String $$2) {
      StringBuffer $$3 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$3.append($$1x).append('\n'));
      if (!$$1) {
         $$3.append("(optional)\n");
      }

      $$3.append("-------------------\n");
      cwp $$4 = new cwp(cwt.uX);
      $$4.b(kv.S, new czw(List.of(arv.a($$3 + $$2))));
      return $$4;
   }

   protected static void a(ard $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wp.b($$2).a($$1)));
   }

   private static void a(ard $$0, ji $$1, String $$2) {
      agd.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
