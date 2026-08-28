import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hfl<T> implements hff {
   private final hhf<T> a;
   private final hfl.a<T> b;

   public hfl(hhf<T> $$0, hfl.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hff $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hff get(@Nullable T var1, @Nullable gjr var2);
   }

   public static record b<T>(List<T> a, hff.b b) {

      public static <T> Codec<hfl.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayu.b(ayu.a($$0)).fieldOf("when").forGetter(hfl.b::a), hfh.a.fieldOf("model").forGetter(hfl.b::b)).apply($$1, hfl.b::new)
         );
      }
   }

   public static record c(hfl.d<?, ?> b, Optional<hff.b> c) implements hff.b {
      public static final MapCodec<hfl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfl.d.a.forGetter(hfl.c::b), hfh.a.optionalFieldOf("fallback").forGetter(hfl.c::c)).apply($$0, hfl.c::new)
      );

      @Override
      public MapCodec<hfl.c> a() {
         return a;
      }

      @Override
      public hff a(hff.a $$0) {
         hff $$1 = this.c.<hff>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hlh.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hhf<T>, T>(P b, List<hfl.b<T>> c) {
      public static final MapCodec<hfl.d<?, ?>> a = hhe.a.dispatchMap("property", $$0 -> $$0.a().a(), hhf.a::a);

      public hff a(hff.a $$0, hff $$1) {
         Object2ObjectMap<T, hff> $$2 = new Object2ObjectOpenHashMap();

         for (hfl.b<T> $$3 : this.c) {
            hff.b $$4 = $$3.b;
            hff $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hfl<>(this.b, this.a($$2, $$0.d()));
      }

      private hfl.a<T> a(Object2ObjectMap<T, hff> $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hff)$$0.get($$1x);
         } else {
            hff $$2 = (hff)$$0.defaultReturnValue();
            gjk<gjr, Object2ObjectMap<T, hff>> $$3 = new gjk<>($$3x -> {
               Object2ObjectMap<T, hff> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.F_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hff)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hff)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hlh.a $$0) {
         for (hfl.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hfl.b<T>> b() {
         return this.c;
      }
   }
}
