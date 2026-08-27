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

public class grr {
   final Map<grq<?>, Object> a;

   grr(Map<grq<?>, Object> $$0) {
      this.a = $$0;
   }

   public static grr.a a() {
      return new grr.a();
   }

   public static Codec<grr> a(final List<grq<?>> $$0) {
      return (new MapCodec<grr>() {
         public <T> RecordBuilder<T> a(grr $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (grq<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(grr $$0x, RecordBuilder<T> $$1, grq<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<grr> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<grr.a> $$2 = DataResult.success(new grr.a());

            for (grq<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(grr.a::a);
         }

         private <T, V> DataResult<grr.a> a(DataResult<grr.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, grq<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(grq::b).map($$0::createString);
         }
      }).codec();
   }

   @Nullable
   public <T> T a(grq<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<grq<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<grq<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> grr.a a(grq<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> grr.a b(grq<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public grr.a a(grr $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public grr a() {
         return new grr(this.a);
      }
   }
}
