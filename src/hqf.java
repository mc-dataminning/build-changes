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

public class hqf {
   final Map<hqe<?>, Object> a;

   hqf(Map<hqe<?>, Object> $$0) {
      this.a = $$0;
   }

   public static hqf.a a() {
      return new hqf.a();
   }

   public static MapCodec<hqf> a(final List<hqe<?>> $$0) {
      return new MapCodec<hqf>() {
         public <T> RecordBuilder<T> a(hqf $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (hqe<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(hqf $$0x, RecordBuilder<T> $$1, hqe<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<hqf> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<hqf.a> $$2 = DataResult.success(new hqf.a());

            for (hqe<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(hqf.a::a);
         }

         private <T, V> DataResult<hqf.a> a(DataResult<hqf.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, hqe<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(hqe::b).map($$0::createString);
         }
      };
   }

   @Nullable
   public <T> T a(hqe<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<hqe<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<hqe<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> hqf.a a(hqe<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> hqf.a b(hqe<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public hqf.a a(hqf $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public hqf a() {
         return new hqf(this.a);
      }
   }
}
