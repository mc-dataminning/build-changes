import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xv(byte[] c) {
   public static final Codec<xv> a = ayv.r.xmap(xv::new, xv::b);
   public static final int b = 256;

   public xv(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xv a(wg $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xv($$1);
   }

   public static void a(wg $$0, xv $$1) {
      $$0.c($$1.c);
   }

   public boolean a(azz $$0, azy $$1) {
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
         if ($$0 instanceof xv $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public xv.a a(xw $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xv.a($$1) : new xv.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xv c) {
      public static final int a = -1;

      public a(xv $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xv.a a(wg $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xv.a(xv.a($$0)) : new xv.a($$1);
      }

      public static void a(wg $$0, xv.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xv.a($$0, $$1.b());
         }
      }

      public Optional<xv> a(xw $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xv b() {
         return this.c;
      }
   }
}
