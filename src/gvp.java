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

public class gvp {
   final Map<gvo<?>, Object> a;

   gvp(Map<gvo<?>, Object> $$0) {
      this.a = $$0;
   }

   public static gvp.a a() {
      return new gvp.a();
   }

   public static MapCodec<gvp> a(final List<gvo<?>> $$0) {
      return new MapCodec<gvp>() {
         public <T> RecordBuilder<T> a(gvp $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (gvo<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(gvp $$0x, RecordBuilder<T> $$1, gvo<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<gvp> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<gvp.a> $$2 = DataResult.success(new gvp.a());

            for (gvo<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(gvp.a::a);
         }

         private <T, V> DataResult<gvp.a> a(DataResult<gvp.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, gvo<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(gvo::b).map($$0::createString);
         }
      };
   }

   @Nullable
   public <T> T a(gvo<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<gvo<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<gvo<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> gvp.a a(gvo<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> gvp.a b(gvo<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public gvp.a a(gvp $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public gvp a() {
         return new gvp(this.a);
      }
   }
}
