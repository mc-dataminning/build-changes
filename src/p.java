import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class p {
   private final String a;
   private final List<p.a> b = Lists.newArrayList();
   private StackTraceElement[] c = new StackTraceElement[0];

   public p(String $$0) {
      this.a = $$0;
   }

   public static String a(ctq $$0, double $$1, double $$2, double $$3) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", $$1, $$2, $$3, a($$0, hx.a($$1, $$2, $$3)));
   }

   public static String a(ctq $$0, hx $$1) {
      return a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   public static String a(ctq $$0, int $$1, int $$2, int $$3) {
      StringBuilder $$4 = new StringBuilder();

      try {
         $$4.append(String.format(Locale.ROOT, "World: (%d,%d,%d)", $$1, $$2, $$3));
      } catch (Throwable var19) {
         $$4.append("(Error finding world loc)");
      }

      $$4.append(", ");

      try {
         int $$6 = iz.a($$1);
         int $$7 = iz.a($$2);
         int $$8 = iz.a($$3);
         int $$9 = $$1 & 15;
         int $$10 = $$2 & 15;
         int $$11 = $$3 & 15;
         int $$12 = iz.c($$6);
         int $$13 = $$0.J_();
         int $$14 = iz.c($$8);
         int $$15 = iz.c($$6 + 1) - 1;
         int $$16 = $$0.al() - 1;
         int $$17 = iz.c($$8 + 1) - 1;
         $$4.append(
            String.format(
               Locale.ROOT,
               "Section: (at %d,%d,%d in %d,%d,%d; chunk contains blocks %d,%d,%d to %d,%d,%d)",
               $$9,
               $$10,
               $$11,
               $$6,
               $$7,
               $$8,
               $$12,
               $$13,
               $$14,
               $$15,
               $$16,
               $$17
            )
         );
      } catch (Throwable var18) {
         $$4.append("(Error finding chunk loc)");
      }

      $$4.append(", ");

      try {
         int $$19 = $$1 >> 9;
         int $$20 = $$3 >> 9;
         int $$21 = $$19 << 5;
         int $$22 = $$20 << 5;
         int $$23 = ($$19 + 1 << 5) - 1;
         int $$24 = ($$20 + 1 << 5) - 1;
         int $$25 = $$19 << 9;
         int $$26 = $$0.J_();
         int $$27 = $$20 << 9;
         int $$28 = ($$19 + 1 << 9) - 1;
         int $$29 = $$0.al() - 1;
         int $$30 = ($$20 + 1 << 9) - 1;
         $$4.append(
            String.format(
               Locale.ROOT,
               "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,%d,%d to %d,%d,%d)",
               $$19,
               $$20,
               $$21,
               $$22,
               $$23,
               $$24,
               $$25,
               $$26,
               $$27,
               $$28,
               $$29,
               $$30
            )
         );
      } catch (Throwable var17) {
         $$4.append("(Error finding world loc)");
      }

      return $$4.toString();
   }

   public p a(String $$0, q<String> $$1) {
      try {
         this.a($$0, $$1.call());
      } catch (Throwable var4) {
         this.a($$0, var4);
      }

      return this;
   }

   public p a(String $$0, Object $$1) {
      this.b.add(new p.a($$0, $$1));
      return this;
   }

   public void a(String $$0, Throwable $$1) {
      this.a($$0, (Object)$$1);
   }

   public int a(int $$0) {
      StackTraceElement[] $$1 = Thread.currentThread().getStackTrace();
      if ($$1.length <= 0) {
         return 0;
      } else {
         this.c = new StackTraceElement[$$1.length - 3 - $$0];
         System.arraycopy($$1, 3 + $$0, this.c, 0, this.c.length);
         return this.c.length;
      }
   }

   public boolean a(StackTraceElement $$0, StackTraceElement $$1) {
      if (this.c.length != 0 && $$0 != null) {
         StackTraceElement $$2 = this.c[0];
         if ($$2.isNativeMethod() == $$0.isNativeMethod()
            && $$2.getClassName().equals($$0.getClassName())
            && $$2.getFileName().equals($$0.getFileName())
            && $$2.getMethodName().equals($$0.getMethodName())) {
            if ($$1 != null != this.c.length > 1) {
               return false;
            } else if ($$1 != null && !this.c[1].equals($$1)) {
               return false;
            } else {
               this.c[0] = $$0;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void b(int $$0) {
      StackTraceElement[] $$1 = new StackTraceElement[this.c.length - $$0];
      System.arraycopy(this.c, 0, $$1, 0, $$1.length);
      this.c = $$1;
   }

   public void a(StringBuilder $$0) {
      $$0.append("-- ").append(this.a).append(" --\n");
      $$0.append("Details:");

      for (p.a $$1 : this.b) {
         $$0.append("\n\t");
         $$0.append($$1.a());
         $$0.append(": ");
         $$0.append($$1.b());
      }

      if (this.c != null && this.c.length > 0) {
         $$0.append("\nStacktrace:");

         for (StackTraceElement $$2 : this.c) {
            $$0.append("\n\tat ");
            $$0.append($$2);
         }
      }
   }

   public StackTraceElement[] a() {
      return this.c;
   }

   public static void a(p $$0, ctq $$1, hx $$2, @Nullable djg $$3) {
      if ($$3 != null) {
         $$0.a("Block", $$3::toString);
      }

      $$0.a("Block location", () -> a($$1, $$2));
   }

   static class a {
      private final String a;
      private final String b;

      public a(String $$0, @Nullable Object $$1) {
         this.a = $$0;
         if ($$1 == null) {
            this.b = "~~NULL~~";
         } else if ($$1 instanceof Throwable $$2) {
            this.b = "~~ERROR~~ " + $$2.getClass().getSimpleName() + ": " + $$2.getMessage();
         } else {
            this.b = $$1.toString();
         }
      }

      public String a() {
         return this.a;
      }

      public String b() {
         return this.b;
      }
   }
}
