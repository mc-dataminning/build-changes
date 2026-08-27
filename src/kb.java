import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kb<T>(jy<T> b, T c) {
   public static final yq<wd, kb<?>> a = new yq<wd, kb<?>>() {
      public kb<?> a(wd $$0) {
         jy<?> $$1 = jy.b.decode($$0);
         return a($$0, (jy<T>)$$1);
      }

      private static <T> kb<T> a(wd $$0, jy<T> $$1) {
         return new kb<>($$1, $$1.e().decode($$0));
      }

      public void a(wd $$0, kb<?> $$1) {
         b($$0, (kb<T>)$$1);
      }

      private static <T> void b(wd $$0, kb<T> $$1) {
         jy.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kb<?> a(Entry<jy<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> kb<T> a(jy<T> $$0, Object $$1) {
      return new kb<>($$0, (T)$$1);
   }

   public void a(ka $$0) {
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

   public jy<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
