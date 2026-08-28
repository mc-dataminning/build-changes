import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class gy {
   private static final char c = '~';
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.pos.missing.int"));
   private final boolean d;
   private final double e;

   public gy(boolean $$0, double $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public double a(double $$0) {
      return this.d ? this.e + $$0 : this.e;
   }

   public static gy a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '^') {
         throw gx.b.createWithContext($$0);
      } else if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         boolean $$2 = b($$0);
         int $$3 = $$0.getCursor();
         double $$4 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
         String $$5 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$2 && $$5.isEmpty()) {
            return new gy(true, 0.0);
         } else {
            if (!$$5.contains(".") && !$$2 && $$1) {
               $$4 += 0.5;
            }

            return new gy($$2, $$4);
         }
      }
   }

   public static gy a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '^') {
         throw gx.b.createWithContext($$0);
      } else if (!$$0.canRead()) {
         throw b.createWithContext($$0);
      } else {
         boolean $$1 = b($$0);
         double $$2;
         if ($$0.canRead() && $$0.peek() != ' ') {
            $$2 = $$1 ? $$0.readDouble() : (double)$$0.readInt();
         } else {
            $$2 = 0.0;
         }

         return new gy($$1, $$2);
      }
   }

   public static boolean b(StringReader $$0) {
      boolean $$1;
      if ($$0.peek() == '~') {
         $$1 = true;
         $$0.skip();
      } else {
         $$1 = false;
      }

      return $$1;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof gy $$1)) {
         return false;
      } else {
         return this.d != $$1.d ? false : Double.compare($$1.e, this.e) == 0;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d ? 1 : 0;
      long $$1 = Double.doubleToLongBits(this.e);
      return 31 * $$0 + (int)($$1 ^ $$1 >>> 32);
   }

   public boolean a() {
      return this.d;
   }
}
