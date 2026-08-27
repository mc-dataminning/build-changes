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

public class fzo {
   final Map<fzn<?>, Object> a;

   fzo(Map<fzn<?>, Object> $$0) {
      this.a = $$0;
   }

   public static fzo.a a() {
      return new fzo.a();
   }

   public static Codec<fzo> a(final List<fzn<?>> $$0) {
      return (new MapCodec<fzo>() {
         public <T> RecordBuilder<T> a(fzo $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            RecordBuilder<T> $$3 = $$2;

            for (fzn<?> $$4 : $$0) {
               $$3 = this.a($$0, $$3, $$4);
            }

            return $$3;
         }

         private <T, V> RecordBuilder<T> a(fzo $$0x, RecordBuilder<T> $$1, fzn<V> $$2) {
            V $$3 = $$0.a($$2);
            return $$3 != null ? $$1.add($$2.b(), $$3, $$2.d()) : $$1;
         }

         public <T> DataResult<fzo> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            DataResult<fzo.a> $$2 = DataResult.success(new fzo.a());

            for (fzn<?> $$3 : $$0) {
               $$2 = this.a($$2, $$0, $$1, $$3);
            }

            return $$2.map(fzo.a::a);
         }

         private <T, V> DataResult<fzo.a> a(DataResult<fzo.a> $$0x, DynamicOps<T> $$1, MapLike<T> $$2, fzn<V> $$3) {
            T $$4 = (T)$$2.get($$3.b());
            if ($$4 != null) {
               DataResult<V> $$5 = $$3.d().parse($$1, $$4);
               return $$0.apply2stable(($$1x, $$2x) -> $$1x.a($$3, (V)$$2x), $$5);
            } else {
               return $$0;
            }
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return $$0.stream().map(fzn::b).map($$0::createString);
         }
      }).codec();
   }

   @Nullable
   public <T> T a(fzn<T> $$0) {
      return (T)this.a.get($$0);
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public Set<fzn<?>> b() {
      return this.a.keySet();
   }

   public static class a {
      private final Map<fzn<?>, Object> a = new Reference2ObjectOpenHashMap();

      a() {
      }

      public <T> fzo.a a(fzn<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public <T> fzo.a b(fzn<T> $$0, @Nullable T $$1) {
         if ($$1 != null) {
            this.a.put($$0, $$1);
         }

         return this;
      }

      public fzo.a a(fzo $$0) {
         this.a.putAll($$0.a);
         return this;
      }

      public fzo a() {
         return new fzo(this.a);
      }
   }
}
