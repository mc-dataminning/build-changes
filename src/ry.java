import com.google.common.base.MoreObjects;
import java.util.Arrays;
import org.apache.commons.lang3.exception.ExceptionUtils;

class ry implements rn {
   private final rm c;
   private final rs d;
   private final hx e;
   int a;
   int b;

   public ry(rm $$0, rs $$1, hx $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.a = 0;
      this.b = 0;
   }

   @Override
   public void a(rm $$0) {
      a(this.c, cwl.eq);
      this.a++;
   }

   @Override
   public void b(rm $$0) {
      this.b++;
      if ($$0.B()) {
         a($$0, $$0.c() + " passed! (" + $$0.m() + "ms). Rerunning until failed.");
         this.a();
      } else if (!$$0.y()) {
         a($$0, $$0.c() + " passed! (" + $$0.m() + "ms)");
      } else {
         if (this.b >= $$0.A()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a(this.c.h(), n.k, "Flaky test " + this.c + " succeeded, attempt: " + this.a + " successes: " + this.b);
            this.a();
         }
      }
   }

   @Override
   public void c(rm $$0) {
      if (!$$0.y()) {
         a($$0, $$0.o());
      } else {
         sc $$1 = this.c.w();
         String $$2 = "Flaky test " + this.c + " failed, attempt: " + this.a + "/" + $$1.i();
         if ($$1.j() > 1) {
            $$2 = $$2 + ", successes: " + this.b + " (" + $$1.j() + " required)";
         }

         a(this.c.h(), n.o, $$2);
         if ($$0.z() - this.a + this.b >= $$0.A()) {
            this.a();
         } else {
            a($$0, new rd(this.a, this.b, $$0));
         }
      }
   }

   public static void a(rm $$0, String $$1) {
      a($$0, cwl.en);
      b($$0, $$1);
   }

   private static void b(rm $$0, String $$1) {
      a($$0.h(), n.k, $$1);
      ru.b($$0);
   }

   protected static void a(rm $$0, Throwable $$1) {
      a($$0, $$0.s() ? cwl.ew : cwl.ej);
      c($$0, ac.c($$1));
      b($$0, $$1);
   }

   protected static void b(rm $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ac.c($$1.getCause()));
      String $$3 = ($$0.s() ? "" : "(optional) ") + $$0.c() + " failed! " + $$2;
      a($$0.h(), $$0.s() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof rg $$5) {
         a($$0.h(), $$5.c(), $$5.a());
      }

      ru.a($$0);
   }

   private void a() {
      this.c.p();
      rm $$0 = new rm(this.c.w(), this.c.v(), this.c.h());
      $$0.a(this.c.B());
      this.d.a($$0);
      $$0.a(this);
      $$0.b(this.e);
   }

   protected static void a(rm $$0, cwj $$1) {
      amz $$2 = $$0.h();
      hx $$3 = $$0.d();
      hx $$4 = new hx(-1, -1, -1);
      hx $$5 = ecz.a($$3.a((jb)$$4), dbf.a, $$0.v(), $$3);
      $$2.b($$5, cwl.fO.o().a($$0.v()));
      hx $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.o());

      for (int $$7 = -1; $$7 <= 1; $$7++) {
         for (int $$8 = -1; $$8 <= 1; $$8++) {
            hx $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, cwl.ci.o());
         }
      }
   }

   private static void c(rm $$0, String $$1) {
      amz $$2 = $$0.h();
      hx $$3 = $$0.d();
      hx $$4 = new hx(-1, 1, -1);
      hx $$5 = ecz.a($$3.a((jb)$$4), dbf.a, $$0.v(), $$3);
      $$2.b($$5, cwl.oa.o().a($$0.v()));
      dja $$6 = $$2.a_($$5);
      cmr $$7 = a($$0.c(), $$0.s(), $$1);
      dat.a(null, $$2, $$5, $$6, $$7);
   }

   private static cmr a(String $$0, boolean $$1, String $$2) {
      cmr $$3 = new cmr(cmu.tT);
      sr $$4 = new sr();
      StringBuffer $$5 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$5.append($$1x).append('\n'));
      if (!$$1) {
         $$5.append("(optional)\n");
      }

      $$5.append("-------------------\n");
      $$4.add(tg.a($$5 + $$2));
      $$3.a("pages", $$4);
      return $$3;
   }

   protected static void a(amz $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(vd.b($$2).a($$1)));
   }

   private static void a(amz $$0, hx $$1, String $$2) {
      adf.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
