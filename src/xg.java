import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record xg(byte[] c) {
   public static final Codec<xg> a = axh.n.xmap(xg::new, xg::b);
   public static final int b = 256;

   public xg(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static xg a(vu $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new xg($$1);
   }

   public static void a(vu $$0, xg $$1) {
      $$0.c($$1.c);
   }

   public boolean a(ayl $$0, ayk $$1) {
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
         if ($$0 instanceof xg $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public xg.a a(xh $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new xg.a($$1) : new xg.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable xg c) {
      public static final int a = -1;

      public a(xg $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static xg.a a(vu $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new xg.a(xg.a($$0)) : new xg.a($$1);
      }

      public static void a(vu $$0, xg.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            xg.a($$0, $$1.b());
         }
      }

      public Optional<xg> a(xh $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public xg b() {
         return this.c;
      }
   }
}
