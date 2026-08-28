import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record ko<T>(kl<T> b, T c) {
   public static final zm<wz, ko<?>> a = new zm<wz, ko<?>>() {
      public ko<?> a(wz $$0) {
         kl<?> $$1 = kl.b.decode($$0);
         return a($$0, (kl<T>)$$1);
      }

      private static <T> ko<T> a(wz $$0, kl<T> $$1) {
         return new ko<>($$1, $$1.e().decode($$0));
      }

      public void a(wz $$0, ko<?> $$1) {
         b($$0, (ko<T>)$$1);
      }

      private static <T> void b(wz $$0, ko<T> $$1) {
         kl.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static ko<?> a(Entry<kl<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> ko<T> a(kl<T> $$0, Object $$1) {
      return new ko<>($$0, (T)$$1);
   }

   public void a(kn $$0) {
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

   public kl<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
