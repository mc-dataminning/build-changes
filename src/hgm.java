import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hgm<T> implements hgf {
   private final hig<T> a;
   private final hgm.a<T> b;

   public hgm(hig<T> $$0, hgm.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hgf $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hgf get(@Nullable T var1, @Nullable gkq var2);
   }

   public static record b<T>(List<T> a, hgf.b b) {

      public static <T> Codec<hgm.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayu.b(ayu.a($$0)).fieldOf("when").forGetter(hgm.b::a), hgh.a.fieldOf("model").forGetter(hgm.b::b)).apply($$1, hgm.b::new)
         );
      }
   }

   public static record c(hgm.d<?, ?> b, Optional<hgf.b> c) implements hgf.b {
      public static final MapCodec<hgm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgm.d.a.forGetter(hgm.c::b), hgh.a.optionalFieldOf("fallback").forGetter(hgm.c::c)).apply($$0, hgm.c::new)
      );

      @Override
      public MapCodec<hgm.c> a() {
         return a;
      }

      @Override
      public hgf a(hgf.a $$0) {
         hgf $$1 = this.c.<hgf>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hmi.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hig<T>, T>(P b, List<hgm.b<T>> c) {
      public static final MapCodec<hgm.d<?, ?>> a = hif.a.dispatchMap("property", $$0 -> $$0.a().a(), hig.a::a);

      public hgf a(hgf.a $$0, hgf $$1) {
         Object2ObjectMap<T, hgf> $$2 = new Object2ObjectOpenHashMap();

         for (hgm.b<T> $$3 : this.c) {
            hgf.b $$4 = $$3.b;
            hgf $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hgm<>(this.b, this.a($$2, $$0.d()));
      }

      private hgm.a<T> a(Object2ObjectMap<T, hgf> $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hgf)$$0.get($$1x);
         } else {
            hgf $$2 = (hgf)$$0.defaultReturnValue();
            gkj<gkq, Object2ObjectMap<T, hgf>> $$3 = new gkj<>($$3x -> {
               Object2ObjectMap<T, hgf> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.F_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hgf)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hgf)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hmi.a $$0) {
         for (hgm.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hgm.b<T>> b() {
         return this.c;
      }
   }
}
