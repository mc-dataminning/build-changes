import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xk(byte[] c) {
   public static final Codec<xk> a = ayu.r.xmap(xk::new, xk::b);
   public static final int b = 256;

   public xk(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xk a(vu $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xk($$1);
   }

   public static void a(vu $$0, xk $$1) {
      $$0.c($$1.c);
   }

   public boolean a(bab $$0, baa $$1) {
      return $$0.validate($$1, this.c);
   }

   public ByteBuffer a() {
      return ByteBuffer.wrap(this.c);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xk $$1 && Arrays.equals(this.c, $$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public String toString() {
      return Base64.getEncoder().encodeToString(this.c);
   }

   public xk.a a(xl $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xk.a($$1) : new xk.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xk c) {
      public static final int a = -1;

      public a(xk $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xk.a a(vu $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xk.a(xk.a($$0)) : new xk.a($$1);
      }

      public static void a(vu $$0, xk.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xk.a($$0, $$1.b());
         }
      }

      public Optional<xk> a(xl $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xk b() {
         return this.c;
      }
   }
}
