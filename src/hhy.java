import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hhy<T> implements hhr {
   private final hjs<T> a;
   private final hhy.a<T> b;

   public hhy(hjs<T> $$0, hhy.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hhr $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hhr get(@Nullable T var1, @Nullable gmd var2);
   }

   public static record b<T>(List<T> a, hhr.b b) {

      public static <T> Codec<hhy.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayy.b(ayy.a($$0)).fieldOf("when").forGetter(hhy.b::a), hht.a.fieldOf("model").forGetter(hhy.b::b)).apply($$1, hhy.b::new)
         );
      }
   }

   public static record c(hhy.d<?, ?> b, Optional<hhr.b> c) implements hhr.b {
      public static final MapCodec<hhy.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhy.d.a.forGetter(hhy.c::b), hht.a.optionalFieldOf("fallback").forGetter(hhy.c::c)).apply($$0, hhy.c::new)
      );

      @Override
      public MapCodec<hhy.c> a() {
         return a;
      }

      @Override
      public hhr a(hhr.a $$0) {
         hhr $$1 = this.c.<hhr>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hnt.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hjs<T>, T>(P b, List<hhy.b<T>> c) {
      public static final MapCodec<hhy.d<?, ?>> a = hjr.a.dispatchMap("property", $$0 -> $$0.a().a(), hjs.a::a);

      public hhr a(hhr.a $$0, hhr $$1) {
         Object2ObjectMap<T, hhr> $$2 = new Object2ObjectOpenHashMap();

         for (hhy.b<T> $$3 : this.c) {
            hhr.b $$4 = $$3.b;
            hhr $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hhy<>(this.b, this.a($$2, $$0.d()));
      }

      private hhy.a<T> a(Object2ObjectMap<T, hhr> $$0, @Nullable baa $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hhr)$$0.get($$1x);
         } else {
            hhr $$2 = (hhr)$$0.defaultReturnValue();
            glw<gmd, Object2ObjectMap<T, hhr>> $$3 = new glw<>($$3x -> {
               Object2ObjectMap<T, hhr> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.J_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hhr)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hhr)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hnt.a $$0) {
         for (hhy.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hhy.b<T>> b() {
         return this.c;
      }
   }
}
