import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record tt(byte[] c) {
   public static final Codec<tt> a = arb.n.xmap(tt::new, tt::b);
   public static final int b = 256;

   public tt(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static tt a(sl $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new tt($$1);
   }

   public static void a(sl $$0, tt $$1) {
      $$0.c($$1.c);
   }

   public boolean a(asc $$0, asb $$1) {
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
         if ($$0 instanceof tt $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public tt.a a(tu $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new tt.a($$1) : new tt.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable tt c) {
      public static final int a = -1;

      public a(tt $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static tt.a a(sl $$0) {
         int $$1 = $$0.m() - 1;
         return $$1 == -1 ? new tt.a(tt.a($$0)) : new tt.a($$1);
      }

      public static void a(sl $$0, tt.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            tt.a($$0, $$1.b());
         }
      }

      public Optional<tt> a(tu $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public tt b() {
         return this.c;
      }
   }
}
