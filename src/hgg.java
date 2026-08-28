import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hgg<T> implements hfz {
   private final hia<T> a;
   private final hgg.a<T> b;

   public hgg(hia<T> $$0, hgg.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hfz $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hfz get(@Nullable T var1, @Nullable gkl var2);
   }

   public static record b<T>(List<T> a, hfz.b b) {

      public static <T> Codec<hgg.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayu.b(ayu.a($$0)).fieldOf("when").forGetter(hgg.b::a), hgb.a.fieldOf("model").forGetter(hgg.b::b)).apply($$1, hgg.b::new)
         );
      }
   }

   public static record c(hgg.d<?, ?> b, Optional<hfz.b> c) implements hfz.b {
      public static final MapCodec<hgg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgg.d.a.forGetter(hgg.c::b), hgb.a.optionalFieldOf("fallback").forGetter(hgg.c::c)).apply($$0, hgg.c::new)
      );

      @Override
      public MapCodec<hgg.c> a() {
         return a;
      }

      @Override
      public hfz a(hfz.a $$0) {
         hfz $$1 = this.c.<hfz>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hmb.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hia<T>, T>(P b, List<hgg.b<T>> c) {
      public static final MapCodec<hgg.d<?, ?>> a = hhz.a.dispatchMap("property", $$0 -> $$0.a().a(), hia.a::a);

      public hfz a(hfz.a $$0, hfz $$1) {
         Object2ObjectMap<T, hfz> $$2 = new Object2ObjectOpenHashMap();

         for (hgg.b<T> $$3 : this.c) {
            hfz.b $$4 = $$3.b;
            hfz $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hgg<>(this.b, this.a($$2, $$0.d()));
      }

      private hgg.a<T> a(Object2ObjectMap<T, hfz> $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hfz)$$0.get($$1x);
         } else {
            hfz $$2 = (hfz)$$0.defaultReturnValue();
            gke<gkl, Object2ObjectMap<T, hfz>> $$3 = new gke<>($$3x -> {
               Object2ObjectMap<T, hfz> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.F_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hfz)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hfz)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hmb.a $$0) {
         for (hgg.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hgg.b<T>> b() {
         return this.c;
      }
   }
}
