import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hft<T> implements hfn {
   private final hhn<T> a;
   private final hft.a<T> b;

   public hft(hhn<T> $$0, hft.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hfn $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hfn get(@Nullable T var1, @Nullable gjz var2);
   }

   public static record b<T>(List<T> a, hfn.b b) {

      public static <T> Codec<hft.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayu.b(ayu.a($$0)).fieldOf("when").forGetter(hft.b::a), hfp.a.fieldOf("model").forGetter(hft.b::b)).apply($$1, hft.b::new)
         );
      }
   }

   public static record c(hft.d<?, ?> b, Optional<hfn.b> c) implements hfn.b {
      public static final MapCodec<hft.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hft.d.a.forGetter(hft.c::b), hfp.a.optionalFieldOf("fallback").forGetter(hft.c::c)).apply($$0, hft.c::new)
      );

      @Override
      public MapCodec<hft.c> a() {
         return a;
      }

      @Override
      public hfn a(hfn.a $$0) {
         hfn $$1 = this.c.<hfn>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hlp.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hhn<T>, T>(P b, List<hft.b<T>> c) {
      public static final MapCodec<hft.d<?, ?>> a = hhm.a.dispatchMap("property", $$0 -> $$0.a().a(), hhn.a::a);

      public hfn a(hfn.a $$0, hfn $$1) {
         Object2ObjectMap<T, hfn> $$2 = new Object2ObjectOpenHashMap();

         for (hft.b<T> $$3 : this.c) {
            hfn.b $$4 = $$3.b;
            hfn $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hft<>(this.b, this.a($$2, $$0.d()));
      }

      private hft.a<T> a(Object2ObjectMap<T, hfn> $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hfn)$$0.get($$1x);
         } else {
            hfn $$2 = (hfn)$$0.defaultReturnValue();
            gjs<gjz, Object2ObjectMap<T, hfn>> $$3 = new gjs<>($$3x -> {
               Object2ObjectMap<T, hfn> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.F_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hfn)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hfn)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hlp.a $$0) {
         for (hft.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hft.b<T>> b() {
         return this.c;
      }
   }
}
