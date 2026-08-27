import com.google.common.base.Preconditions;
import com.mojang.serialization.Codec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nullable;

public record tx(byte[] c) {
   public static final Codec<tx> a = arg.n.xmap(tx::new, tx::b);
   public static final int b = 256;

   public tx(byte[] c) {
      Preconditions.checkState(c.length == 256, "Invalid message signature size");
      this.c = c;
   }

   public static tx a(sp $$0) {
      byte[] $$1 = new byte[256];
      $$0.b($$1);
      return new tx($$1);
   }

   public static void a(sp $$0, tx $$1) {
      $$0.c($$1.c);
   }

   public boolean a(ash $$0, asg $$1) {
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
         if ($$0 instanceof tx $$1 && Arrays.equals(this.c, $$1.c)) {
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

   public tx.a a(ty $$0) {
      int $$1 = $$0.a(this);
      return $$1 != -1 ? new tx.a($$1) : new tx.a(this);
   }

   public byte[] b() {
      return this.c;
   }

   public static record a(int b, @Nullable tx c) {
      public static final int a = -1;

      public a(tx $$0) {
         this(-1, $$0);
      }

      public a(int $$0) {
         this($$0, null);
      }

      public static tx.a a(sp $$0) {
         int $$1 = $$0.m() - 1;
         return $$1 == -1 ? new tx.a(tx.a($$0)) : new tx.a($$1);
      }

      public static void a(sp $$0, tx.a $$1) {
         $$0.c($$1.a() + 1);
         if ($$1.b() != null) {
            tx.a($$0, $$1.b());
         }
      }

      public Optional<tx> a(ty $$0) {
         return this.c != null ? Optional.of(this.c) : Optional.ofNullable($$0.a(this.b));
      }

      public int a() {
         return this.b;
      }

      @Nullable
      public tx b() {
         return this.c;
      }
   }
}
