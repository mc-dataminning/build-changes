import com.google.common.base.MoreObjects;
import java.util.Arrays;
import org.apache.commons.lang3.exception.ExceptionUtils;

class qj implements py {
   private final px c;
   private final qd d;
   private final gw e;
   int a;
   int b;

   public qj(px $$0, qd $$1, gw $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.a = 0;
      this.b = 0;
   }

   @Override
   public void a(px $$0) {
      a(this.c, csw.er);
      this.a++;
   }

   @Override
   public void b(px $$0) {
      this.b++;
      if (!$$0.x()) {
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
   public void c(px $$0) {
      if (!$$0.x()) {
         a($$0, $$0.n());
      } else {
         qo $$1 = this.c.v();
         String $$2 = "Flaky test " + this.c + " failed, attempt: " + this.a + "/" + $$1.i();
         if ($$1.j() > 1) {
            $$2 = $$2 + ", successes: " + this.b + " (" + $$1.j() + " required)";
         }

         a(this.c.g(), n.o, $$2);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            this.a();
         } else {
            a($$0, new po(this.a, this.b, $$0));
         }
      }
   }

   public static void a(px $$0, String $$1) {
      a($$0, csw.eo);
      b($$0, $$1);
   }

   private static void b(px $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      qf.b($$0);
   }

   protected static void a(px $$0, Throwable $$1) {
      a($$0, $$0.r() ? csw.ex : csw.ek);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(px $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.c() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof pr $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      qf.a($$0);
   }

   private void a() {
      this.c.o();
      px $$0 = new px(this.c.v(), this.c.u(), this.c.g());
      $$0.a();
      this.d.a($$0);
      $$0.a(this);
      $$0.a(this.e, 2);
   }

   protected static void a(px $$0, csv $$1) {
      akr $$2 = $$0.g();
      gw $$3 = $$0.d();
      gw $$4 = new gw(-1, -1, -1);
      gw $$5 = dzb.a($$3.a((ib)$$4), cxq.a, $$0.u(), $$3);
      $$2.b($$5, csw.fO.n().a($$0.u()));
      gw $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.n());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            gw $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, csw.ci.n());
         }
      }
   }

   private static void c(px $$0, String $$1) {
      akr $$2 = $$0.g();
      gw $$3 = $$0.d();
      gw $$4 = new gw(-1, 1, -1);
      gw $$5 = dzb.a($$3.a((ib)$$4), cxq.a, $$0.u(), $$3);
      $$2.b($$5, csw.oa.n().a($$0.u()));
      dfj $$6 = $$2.a_($$5);
      cjf $$7 = a($$0.c(), $$0.r(), $$1);
      cxd.a(null, $$2, $$5, $$6, $$7);
   }

   private static cjf a(String $$0, boolean $$1, String $$2) {
      cjf $$3 = new cjf(cji.tg);
      rd $$4 = new rd();
      StringBuffer $$5 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$5.append($$1x).append('\n'));
      if (!$$1) {
         $$5.append("(optional)\n");
      }

      $$5.append("-------------------\n");
      $$4.add(ro.a($$5 + $$2));
      $$3.a("pages", $$4);
      return $$3;
   }

   protected static void a(akr $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(tl.b($$2).a($$1)));
   }

   private static void a(akr $$0, gw $$1, String $$2) {
      abc.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
