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

public class hkb {
   final Map<hka<?>, Object> a;

   hkb(Map<hka<?>, Object> $$0) {
      this.a = $$0;
   }

   public static hkb.a a() {
      return new hkb.a();
   }

   public static MapCodec<hkb> a(final List<hka<?>> $$0) {
      return new MapCodec<hkb>() {
         public <T> RecordBuilder<T> a(hkb $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (hka<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(hkb $$0x, RecordBuilder<T> $$1, hka<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<hkb> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<hkb.a> $$2 = DataResult.success(new hkb.a());

            for (hka<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(hkb.a::a);
         }

         private <T, V> DataResult<hkb.a> a(DataResult<hkb.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, hka<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(hka::b).map($$0::createString);
         }
      };
   }

   @Nullable
   public <T> T a(hka<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<hka<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<hka<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> hkb.a a(hka<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> hkb.a b(hka<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public hkb.a a(hkb $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public hkb a() {
         return new hkb(this.a);
      }
   }
}
