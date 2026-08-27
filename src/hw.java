import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class hw<T> {
   private final Codec<T> a;

   hw(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, ih.b $$1, ih.b $$2) {
      DynamicOps<Object> $$3 = agr.a(atr.a, $$1);
      DynamicOps<Object> $$4 = agr.a(atr.a, $$2);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<ags<? extends ir<?>>, hw<?>> a = new HashMap<>();

      public <T> hw.a a(ags<? extends ir<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new hw($$1));
         return this;
      }

      @Nullable
      public <T> hw<T> a(ags<? extends ir<? extends T>> $$0) {
         return (hw<T>)this.a.get($$0);
      }
   }
}
