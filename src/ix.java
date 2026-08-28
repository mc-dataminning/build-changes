import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ix<T> {
   private final Codec<T> a;

   ix(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, jh.a $$1, jh.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(JavaOps.INSTANCE);
      DynamicOps<Object> $$4 = $$2.a(JavaOps.INSTANCE);
      Object $$5 = this.a.encodeStart($$3, $$0).getOrThrow($$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return (T)this.a.parse($$4, $$5).getOrThrow($$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<alh<? extends js<?>>, ix<?>> a = new HashMap<>();

      public <T> ix.a a(alh<? extends js<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new ix($$1));
         return this;
      }

      @Nullable
      public <T> ix<T> a(alh<? extends js<? extends T>> $$0) {
         return (ix<T>)this.a.get($$0);
      }
   }
}
