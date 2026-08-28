import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kx<T>(ku<T> b, T c) {
   public static final yn<wa, kx<?>> a = new yn<wa, kx<?>>() {
      public kx<?> a(wa $$0) {
         ku<?> $$1 = ku.b.decode($$0);
         return a($$0, (ku<T>)$$1);
      }

      private static <T> kx<T> a(wa $$0, ku<T> $$1) {
         return new kx<>($$1, $$1.e().decode($$0));
      }

      public void a(wa $$0, kx<?> $$1) {
         b($$0, (kx<T>)$$1);
      }

      private static <T> void b(wa $$0, kx<T> $$1) {
         ku.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kx<?> a(Entry<ku<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kx<T> a(ku<T> $$0, Object $$1) {
      return new kx<>($$0, (T)$$1);
   }

   public void a(kw $$0) {
      $$0.b(this.b, this.c);
   }

   public <D> DataResult<D> a(DynamicOps<D> $$0) {
      Codec<T> $$1 = this.b.b();
      return $$1 == null ? DataResult.error(() -> "Component of type " + this.b + " is not encodable") : $$1.encodeStart($$0, this.c);
   }

   @Override
   public String toString() {
      return this.b + "=>" + this.c;
   }

   public ku<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
