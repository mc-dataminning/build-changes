import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kc<T>(jz<T> b, T c) {
   public static final ys<wf, kc<?>> a = new ys<wf, kc<?>>() {
      public kc<?> a(wf $$0) {
         jz<?> $$1 = jz.b.decode($$0);
         return a($$0, (jz<T>)$$1);
      }

      private static <T> kc<T> a(wf $$0, jz<T> $$1) {
         return new kc<>($$1, $$1.e().decode($$0));
      }

      public void a(wf $$0, kc<?> $$1) {
         b($$0, (kc<T>)$$1);
      }

      private static <T> void b(wf $$0, kc<T> $$1) {
         jz.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kc<?> a(Entry<jz<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> kc<T> a(jz<T> $$0, Object $$1) {
      return new kc<>($$0, (T)$$1);
   }

   public void a(kb $$0) {
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

   public jz<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
