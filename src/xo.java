import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xo(byte[] c) {
   public static final Codec<xo> a = ayy.r.xmap(xo::new, xo::b);
   public static final int b = 256;

   public xo(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xo a(vy $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xo($$1);
   }

   public static void a(vy $$0, xo $$1) {
      $$0.c($$1.c);
   }

   public boolean a(baf $$0, bae $$1) {
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
         if ($$0 instanceof xo $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public xo.a a(xp $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xo.a($$1) : new xo.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xo c) {
      public static final int a = -1;

      public a(xo $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xo.a a(vy $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xo.a(xo.a($$0)) : new xo.a($$1);
      }

      public static void a(vy $$0, xo.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xo.a($$0, $$1.b());
         }
      }

      public Optional<xo> a(xp $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xo b() {
         return this.c;
      }
   }
}
