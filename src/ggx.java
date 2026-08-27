import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ggx {
   final Map<ggw<?>, Object> a;

   ggx(Map<ggw<?>, Object> $$0) {
      this.a = $$0;
   }

   public static ggx.a a() {
      return new ggx.a();
   }

   public static Codec<ggx> a(final List<ggw<?>> $$0) {
      return (new MapCodec<ggx>() {
         public <T> RecordBuilder<T> a(ggx $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (ggw<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(ggx $$0x, RecordBuilder<T> $$1, ggw<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<ggx> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<ggx.a> $$2 = DataResult.success(new ggx.a());

            for (ggw<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(ggx.a::a);
         }

         private <T, V> DataResult<ggx.a> a(DataResult<ggx.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, ggw<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(ggw::b).map($$0::createString);
         }
      }).codec();
   }

   @Nullable
   public <T> T a(ggw<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<ggw<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<ggw<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> ggx.a a(ggw<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> ggx.a b(ggw<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public ggx.a a(ggx $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public ggx a() {
         return new ggx(this.a);
      }
   }
}
