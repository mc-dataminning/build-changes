import com.google.common.base.MoreObjects;
import java.util.Arrays;
import org.apache.commons.lang3.exception.ExceptionUtils;

class rl implements ra {
   private final qz c;
   private final rf d;
   private final ht e;
   int a;
   int b;

   public rl(qz $$0, rf $$1, ht $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.a = 0;
      this.b = 0;
   }

   @Override
   public void a(qz $$0) {
      a(this.c, cuv.eq);
      this.a++;
   }

   @Override
   public void b(qz $$0) {
      this.b++;
      if ($$0.A()) {
         a($$0, $$0.c() + " passed! (" + $$0.l() + "ms). Rerunning until failed.");
         this.a();
      } else if (!$$0.x()) {
         a($$0, $$0.c() + " passed! (" + $$0.l() + "ms)");
      } else {
         if (this.b >= $$0.z()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a(this.c.g(), n.k, "Flaky test " + this.c + " succeeded, attempt: " + this.a + " successes: " + this.b);
            this.a();
         }
      }
   }

   @Override
   public void c(qz $$0) {
      if (!$$0.x()) {
         a($$0, $$0.n());
      } else {
         rq $$1 = this.c.v();
         String $$2 = "Flaky test " + this.c + " failed, attempt: " + this.a + "/" + $$1.i();
         if ($$1.j() > 1) {
            $$2 = $$2 + ", successes: " + this.b + " (" + $$1.j() + " required)";
         }

         a(this.c.g(), n.o, $$2);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            this.a();
         } else {
            a($$0, new qq(this.a, this.b, $$0));
         }
      }
   }

   public static void a(qz $$0, String $$1) {
      a($$0, cuv.en);
      b($$0, $$1);
   }

   private static void b(qz $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      rh.b($$0);
   }

   protected static void a(qz $$0, Throwable $$1) {
      a($$0, $$0.r() ? cuv.ew : cuv.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(qz $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.c() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof qt $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      rh.a($$0);
   }

   private void a() {
      this.c.o();
      qz $$0 = new qz(this.c.v(), this.c.u(), this.c.g());
      $$0.a(this.c.A());
      $$0.a();
      this.d.a($$0);
      $$0.a(this);
      $$0.a(this.e, 2);
   }

   protected static void a(qz $$0, cut $$1) {
      ama $$2 = $$0.g();
      ht $$3 = $$0.d();
      ht $$4 = new ht(-1, -1, -1);
      ht $$5 = eav.a($$3.a((iw)$$4), czp.a, $$0.u(), $$3);
      $$2.b($$5, cuv.fO.o().a($$0.u()));
      ht $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.o());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            ht $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, cuv.ci.o());
         }
      }
   }

   private static void c(qz $$0, String $$1) {
      ama $$2 = $$0.g();
      ht $$3 = $$0.d();
      ht $$4 = new ht(-1, 1, -1);
      ht $$5 = eav.a($$3.a((iw)$$4), czp.a, $$0.u(), $$3);
      $$2.b($$5, cuv.oa.o().a($$0.u()));
      dgw $$6 = $$2.a_($$5);
      clb $$7 = a($$0.c(), $$0.r(), $$1);
      czd.a(null, $$2, $$5, $$6, $$7);
   }

   private static clb a(String $$0, boolean $$1, String $$2) {
      clb $$3 = new clb(cle.th);
      sf $$4 = new sf();
      StringBuffer $$5 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$5.append($$1x).append('\n'));
      if (!$$1) {
         $$5.append("(optional)\n");
      }

      $$5.append("-------------------\n");
      $$4.add(su.a($$5 + $$2));
      $$3.a("pages", $$4);
      return $$3;
   }

   protected static void a(ama $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(ur.b($$2).a($$1)));
   }

   private static void a(ama $$0, ht $$1, String $$2) {
      aci.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
