import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kl<T>(ki<T> b, T c) {
   public static final yu<wh, kl<?>> a = new yu<wh, kl<?>>() {
      public kl<?> a(wh $$0) {
         ki<?> $$1 = ki.b.decode($$0);
         return a($$0, (ki<T>)$$1);
      }

      private static <T> kl<T> a(wh $$0, ki<T> $$1) {
         return new kl<>($$1, $$1.e().decode($$0));
      }

      public void a(wh $$0, kl<?> $$1) {
         b($$0, (kl<T>)$$1);
      }

      private static <T> void b(wh $$0, kl<T> $$1) {
         ki.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kl<?> a(Entry<ki<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kl<T> a(ki<T> $$0, Object $$1) {
      return new kl<>($$0, (T)$$1);
   }

   public void a(kk $$0) {
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

   public ki<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
