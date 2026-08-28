import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hev<T> implements hep {
   private final hgp<T> a;
   private final hev.a<T> b;

   public hev(hgp<T> $$0, hev.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hep $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hep get(@Nullable T var1, @Nullable gjd var2);
   }

   public static record b<T>(List<T> a, hep.b b) {

      public static <T> Codec<hev.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ays.b(ays.a($$0)).fieldOf("when").forGetter(hev.b::a), her.a.fieldOf("model").forGetter(hev.b::b)).apply($$1, hev.b::new)
         );
      }
   }

   public static record c(hev.d<?, ?> b, Optional<hep.b> c) implements hep.b {
      public static final MapCodec<hev.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hev.d.a.forGetter(hev.c::b), her.a.optionalFieldOf("fallback").forGetter(hev.c::c)).apply($$0, hev.c::new)
      );

      @Override
      public MapCodec<hev.c> a() {
         return a;
      }

      @Override
      public hep a(hep.a $$0) {
         hep $$1 = this.c.<hep>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hkr.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hgp<T>, T>(P b, List<hev.b<T>> c) {
      public static final MapCodec<hev.d<?, ?>> a = hgo.a.dispatchMap("property", $$0 -> $$0.a().a(), hgp.a::a);

      public hep a(hep.a $$0, hep $$1) {
         Object2ObjectMap<T, hep> $$2 = new Object2ObjectOpenHashMap();

         for (hev.b<T> $$3 : this.c) {
            hep.b $$4 = $$3.b;
            hep $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hev<>(this.b, this.a($$2, $$0.d()));
      }

      private hev.a<T> a(Object2ObjectMap<T, hep> $$0, @Nullable azu $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hep)$$0.get($$1x);
         } else {
            hep $$2 = (hep)$$0.defaultReturnValue();
            giw<gjd, Object2ObjectMap<T, hep>> $$3 = new giw<>($$3x -> {
               Object2ObjectMap<T, hep> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.F_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hep)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hep)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hkr.a $$0) {
         for (hev.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hev.b<T>> b() {
         return this.c;
      }
   }
}
