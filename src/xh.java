import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xh(byte[] c) {
   public static final Codec<xh> a = ays.r.xmap(xh::new, xh::b);
   public static final int b = 256;

   public xh(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xh a(vr $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xh($$1);
   }

   public static void a(vr $$0, xh $$1) {
      $$0.c($$1.c);
   }

   public boolean a(azx $$0, azw $$1) {
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
         if ($$0 instanceof xh $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public xh.a a(xi $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xh.a($$1) : new xh.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xh c) {
      public static final int a = -1;

      public a(xh $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xh.a a(vr $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xh.a(xh.a($$0)) : new xh.a($$1);
      }

      public static void a(vr $$0, xh.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xh.a($$0, $$1.b());
         }
      }

      public Optional<xh> a(xi $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xh b() {
         return this.c;
      }
   }
}
