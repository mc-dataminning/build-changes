import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class io<T> {
   private final Codec<T> a;

   io(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, iy.a $$1, iy.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(axs.a);
      DynamicOps<Object> $$4 = $$2.a(axs.a);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<akg<? extends jj<?>>, io<?>> a = new HashMap<>();

      public <T> io.a a(akg<? extends jj<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new io($$1));
         return this;
      }

      @Nullable
      public <T> io<T> a(akg<? extends jj<? extends T>> $$0) {
         return (io<T>)this.a.get($$0);
      }
   }
}
