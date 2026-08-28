import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record yh(byte[] c) {
   public static final Codec<yh> a = azn.r.xmap(yh::new, yh::b);
   public static final int b = 256;

   public yh(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static yh a(ws $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new yh($$1);
   }

   public static void a(ws $$0, yh $$1) {
      $$0.c($$1.c);
   }

   public boolean a(bar $$0, baq $$1) {
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
         if ($$0 instanceof yh $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public yh.a a(yi $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new yh.a($$1) : new yh.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable yh c) {
      public static final int a = -1;

      public a(yh $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static yh.a a(ws $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new yh.a(yh.a($$0)) : new yh.a($$1);
      }

      public static void a(ws $$0, yh.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            yh.a($$0, $$1.b());
         }
      }

      public Optional<yh> a(yi $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public yh b() {
         return this.c;
      }
   }
}
