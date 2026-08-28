import com.google.common.base.MoreObjects;
import java.util.Optional;
import org.apache.commons.lang3.exception.ExceptionUtils;

class td implements sr {
   private int a = 0;
   private int b = 0;

   public td() {
   }

   @Override
   public void a(so $$0) {
      this.a++;
   }

   private void a(so $$0, st $$1, boolean $$2) {
      te $$3 = $$0.B();
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
   public void a(so $$0, st $$1) {
      this.b++;
      if ($$0.B().c()) {
         this.a($$0, $$1, true);
      } else if (!$$0.y()) {
         a($$0, $$0.b() + " passed! (" + $$0.l() + "ms)");
      } else {
         if (this.b >= $$0.A()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a($$0.g(), n.k, "Flaky test " + $$0 + " succeeded, attempt: " + this.a + " successes: " + this.b);
            $$1.a($$0);
         }
      }
   }

   @Override
   public void b(so $$0, st $$1) {
      if (!$$0.y()) {
         a($$0, $$0.n());
         if ($$0.B().c()) {
            this.a($$0, $$1, false);
         }
      } else {
         sp $$2 = $$0.v();
         String $$3 = "Flaky test " + $$0 + " failed, attempt: " + this.a + "/" + $$2.j();
         if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
         }

         a($$0.g(), n.o, $$3);
         if ($$0.z() - this.a + this.b >= $$0.A()) {
            $$1.a($$0);
         } else {
            a($$0, new sd(this.a, this.b, $$0));
         }
      }
   }

   @Override
   public void a(so $$0, so $$1, st $$2) {
      $$1.a(this);
   }

   public static void a(so $$0, String $$1) {
      b($$0).ifPresent($$0x -> $$0x.w());
      b($$0, $$1);
   }

   private static void b(so $$0, String $$1) {
      a($$0.g(), n.k, $$1);
      sz.b($$0);
   }

   protected static void a(so $$0, Throwable $$1) {
      wv $$3;
      if ($$1 instanceof sg $$2) {
         $$3 = $$2.a();
      } else {
         $$3 = wv.b(af.c($$1));
      }

      b($$0).ifPresent($$1x -> $$1x.a($$3));
      b($$0, $$1);
   }

   protected static void b(so $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + af.c($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.b() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? n.m : n.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof sh $$5) {
         a($$0.g(), $$5.d(), $$5.b());
      }

      sz.a($$0);
   }

   private static Optional<dxg> b(so $$0) {
      arn $$1 = $$0.g();
      Optional<jj> $$2 = Optional.ofNullable($$0.c());
      return $$2.flatMap($$1x -> $$1.a($$1x, dvn.U));
   }

   protected static void a(arn $$0, n $$1, String $$2) {
      $$0.a($$0x -> true).forEach($$2x -> $$2x.a(wv.b($$2).a($$1)));
   }

   private static void a(arn $$0, jj $$1, String $$2) {
      agj.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
