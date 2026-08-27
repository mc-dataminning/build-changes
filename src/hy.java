import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class hy<T> {
   private final Codec<T> a;

   hy(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, ij.b $$1, ij.b $$2) {
      DynamicOps<Object> $$3 = ahf.a(aui.a, $$1);
      DynamicOps<Object> $$4 = ahf.a(aui.a, $$2);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<ahg<? extends it<?>>, hy<?>> a = new HashMap<>();

      public <T> hy.a a(ahg<? extends it<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new hy($$1));
         return this;
      }

      @Nullable
      public <T> hy<T> a(ahg<? extends it<? extends T>> $$0) {
         return (hy<T>)this.a.get($$0);
      }
   }
}
