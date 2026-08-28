import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record yb(byte[] c) {
   public static final Codec<yb> a = ayh.p.xmap(yb::new, yb::b);
   public static final int b = 256;

   public yb(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static yb a(wm $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new yb($$1);
   }

   public static void a(wm $$0, yb $$1) {
      $$0.c($$1.c);
   }

   public boolean a(azm $$0, azl $$1) {
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
         if ($$0 instanceof yb $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public yb.a a(yc $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new yb.a($$1) : new yb.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable yb c) {
      public static final int a = -1;

      public a(yb $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static yb.a a(wm $$0) {
         int $$1 = $$0.l() - 1;
         return $$1 == -1 ? new yb.a(yb.a($$0)) : new yb.a($$1);
      }

      public static void a(wm $$0, yb.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            yb.a($$0, $$1.b());
         }
      }

      public Optional<yb> a(yc $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public yb b() {
         return this.c;
      }
   }
}
