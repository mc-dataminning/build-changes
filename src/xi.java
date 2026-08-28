import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xi(byte[] c) {
   public static final Codec<xi> a = ays.r.xmap(xi::new, xi::b);
   public static final int b = 256;

   public xi(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xi a(vs $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xi($$1);
   }

   public static void a(vs $$0, xi $$1) {
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
         if ($$0 instanceof xi $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public xi.a a(xj $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xi.a($$1) : new xi.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xi c) {
      public static final int a = -1;

      public a(xi $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xi.a a(vs $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xi.a(xi.a($$0)) : new xi.a($$1);
      }

      public static void a(vs $$0, xi.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xi.a($$0, $$1.b());
         }
      }

      public Optional<xi> a(xj $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xi b() {
         return this.c;
      }
   }
}
