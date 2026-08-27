import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record th(byte[] c) {
   public static final Codec<th> a = aoi.n.xmap(th::new, th::b);
   public static final int b = 256;

   public th(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static th a(sf $$0) {
      byte[] $$1 = new byte[256];
      $$0.readBytes($$1);
      return new th($$1);
   }

   public static void a(sf $$0, th $$1) {
      $$0.writeBytes($$1.c);
   }

   public boolean a(apj $$0, api $$1) {
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
         if ($$0 instanceof th $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public th.a a(ti $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new th.a($$1) : new th.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable th c) {
      public static final int a = -1;

      public a(th $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static th.a a(sf $$0) {
         int $$1 = $$0.m() - 1;
         return $$1 == -1 ? new th.a(th.a($$0)) : new th.a($$1);
      }

      public static void a(sf $$0, th.a $$1) {
         $$0.d($$1.a() + 1);
         if ($$1.b() != null) {
            th.a($$0, $$1.b());
         }
      }

      public Optional<th> a(ti $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public th b() {
         return this.c;
      }
   }
}
