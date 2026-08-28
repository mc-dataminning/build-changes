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

public class hqr {
   final Map<hqq<?>, Object> a;

   hqr(Map<hqq<?>, Object> $$0) {
      this.a = $$0;
   }

   public static hqr.a a() {
      return new hqr.a();
   }

   public static MapCodec<hqr> a(final List<hqq<?>> $$0) {
      return new MapCodec<hqr>() {
         public <T> RecordBuilder<T> a(hqr $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (hqq<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(hqr $$0x, RecordBuilder<T> $$1, hqq<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<hqr> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<hqr.a> $$2 = DataResult.success(new hqr.a());

            for (hqq<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(hqr.a::a);
         }

         private <T, V> DataResult<hqr.a> a(DataResult<hqr.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, hqq<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(hqq::b).map($$0::createString);
         }
      };
   }

   @Nullable
   public <T> T a(hqq<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<hqq<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<hqq<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> hqr.a a(hqq<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> hqr.a b(hqq<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public hqr.a a(hqr $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public hqr a() {
         return new hqr(this.a);
      }
   }
}
