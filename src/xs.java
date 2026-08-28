import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xs(byte[] c) {
   public static final Codec<xs> a = azg.r.xmap(xs::new, xs::c);
   public static final int b = 256;

   public xs(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xs a(vy $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xs($$1);
   }

   public static void a(vy $$0, xs $$1) {
      $$0.c($$1.c);
   }

   public boolean a(bao $$0, ban $$1) {
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
         if ($$0 instanceof xs $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public static String a(@Nullable xs $$0) {
      return $$0 == null ? "<no signature>" : $$0.toString();
   }

   public xs.a a(xt $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xs.a($$1) : new xs.a(this);
   }

   public int b() {
      return Arrays.hashCode(this.c);
   }

   public static record a(int b, @Nullable xs c) {
      public static final int a = -1;

      public a(xs $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xs.a a(vy $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xs.a(xs.a($$0)) : new xs.a($$1);
      }

      public static void a(vy $$0, xs.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xs.a($$0, $$1.b());
         }
      }

      public Optional<xs> a(xt $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xs b() {
         return this.c;
      }
   }
}
