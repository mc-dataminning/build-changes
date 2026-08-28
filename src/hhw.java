import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hhw<T> implements hhp {
   private final hjq<T> a;
   private final hhw.a<T> b;

   public hhw(hjq<T> $$0, hhw.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hhp $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hhp get(@Nullable T var1, @Nullable gmb var2);
   }

   public static record b<T>(List<T> a, hhp.b b) {

      public static <T> Codec<hhw.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayw.b(ayw.a($$0)).fieldOf("when").forGetter(hhw.b::a), hhr.a.fieldOf("model").forGetter(hhw.b::b)).apply($$1, hhw.b::new)
         );
      }
   }

   public static record c(hhw.d<?, ?> b, Optional<hhp.b> c) implements hhp.b {
      public static final MapCodec<hhw.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhw.d.a.forGetter(hhw.c::b), hhr.a.optionalFieldOf("fallback").forGetter(hhw.c::c)).apply($$0, hhw.c::new)
      );

      @Override
      public MapCodec<hhw.c> a() {
         return a;
      }

      @Override
      public hhp a(hhp.a $$0) {
         hhp $$1 = this.c.<hhp>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hnr.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hjq<T>, T>(P b, List<hhw.b<T>> c) {
      public static final MapCodec<hhw.d<?, ?>> a = hjp.a.dispatchMap("property", $$0 -> $$0.a().a(), hjq.a::a);

      public hhp a(hhp.a $$0, hhp $$1) {
         Object2ObjectMap<T, hhp> $$2 = new Object2ObjectOpenHashMap();

         for (hhw.b<T> $$3 : this.c) {
            hhp.b $$4 = $$3.b;
            hhp $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hhw<>(this.b, this.a($$2, $$0.d()));
      }

      private hhw.a<T> a(Object2ObjectMap<T, hhp> $$0, @Nullable azy $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hhp)$$0.get($$1x);
         } else {
            hhp $$2 = (hhp)$$0.defaultReturnValue();
            glu<gmb, Object2ObjectMap<T, hhp>> $$3 = new glu<>($$3x -> {
               Object2ObjectMap<T, hhp> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.J_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hhp)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hhp)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hnr.a $$0) {
         for (hhw.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hhw.b<T>> b() {
         return this.c;
      }
   }
}
