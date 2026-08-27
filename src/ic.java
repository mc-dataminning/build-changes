import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ic<T> {
   private final Codec<T> a;

   ic(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, in.a $$1, in.a $$2) {
      DynamicOps<Object> $$3 = aja.a(awf.a, $$1);
      DynamicOps<Object> $$4 = aja.a(awf.a, $$2);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<ajb<? extends ix<?>>, ic<?>> a = new HashMap<>();

      public <T> ic.a a(ajb<? extends ix<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new ic($$1));
         return this;
      }

      @Nullable
      public <T> ic<T> a(ajb<? extends ix<? extends T>> $$0) {
         return (ic<T>)this.a.get($$0);
      }
   }
}
