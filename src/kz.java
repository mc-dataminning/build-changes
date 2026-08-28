import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kz<T>(kw<T> b, T c) {
   public static final yt<wg, kz<?>> a = new yt<wg, kz<?>>() {
      public kz<?> a(wg $$0) {
         kw<?> $$1 = kw.b.decode($$0);
         return a($$0, (kw<T>)$$1);
      }

      private static <T> kz<T> a(wg $$0, kw<T> $$1) {
         return new kz<>($$1, $$1.e().decode($$0));
      }

      public void a(wg $$0, kz<?> $$1) {
         b($$0, (kz<T>)$$1);
      }

      private static <T> void b(wg $$0, kz<T> $$1) {
         kw.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kz<?> a(Entry<kw<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kz<T> a(kw<T> $$0, Object $$1) {
      return new kz<>($$0, (T)$$1);
   }

   public void a(ky $$0) {
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

   public kw<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
