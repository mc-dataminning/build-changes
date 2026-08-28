import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ji<T> {
   private final Codec<T> a;

   ji(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, js.a $$1, js.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(JavaOps.INSTANCE);
      DynamicOps<Object> $$4 = $$2.a(JavaOps.INSTANCE);
      Object $$5 = this.a.encodeStart($$3, $$0).getOrThrow($$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return (T)this.a.parse($$4, $$5).getOrThrow($$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<alh<? extends kd<?>>, ji<?>> a = new HashMap<>();

      public <T> ji.a a(alh<? extends kd<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new ji($$1));
         return this;
      }

      @Nullable
      public <T> ji<T> a(alh<? extends kd<? extends T>> $$0) {
         return (ji<T>)this.a.get($$0);
      }
   }
}
