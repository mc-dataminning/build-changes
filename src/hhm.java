import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hhm<T> implements hhf {
   private final hjg<T> a;
   private final hhm.a<T> b;

   public hhm(hjg<T> $$0, hhm.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hhf $$8 = this.b.get($$7, $$4);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @FunctionalInterface
   public interface a<T> {
      @Nullable
      hhf get(@Nullable T var1, @Nullable glo var2);
   }

   public static record b<T>(List<T> a, hhf.b b) {

      public static <T> Codec<hhm.b<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(azg.b(azg.a($$0)).fieldOf("when").forGetter(hhm.b::a), hhh.a.fieldOf("model").forGetter(hhm.b::b)).apply($$1, hhm.b::new)
         );
      }
   }

   public static record c(hhm.d<?, ?> b, Optional<hhf.b> c) implements hhf.b {
      public static final MapCodec<hhm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhm.d.a.forGetter(hhm.c::b), hhh.a.optionalFieldOf("fallback").forGetter(hhm.c::c)).apply($$0, hhm.c::new)
      );

      @Override
      public MapCodec<hhm.c> a() {
         return a;
      }

      @Override
      public hhf a(hhf.a $$0) {
         hhf $$1 = this.c.<hhf>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hnh.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record d<P extends hjg<T>, T>(P b, List<hhm.b<T>> c) {
      public static final MapCodec<hhm.d<?, ?>> a = hjf.a.dispatchMap("property", $$0 -> $$0.a().a(), hjg.a::a);

      public hhf a(hhf.a $$0, hhf $$1) {
         Object2ObjectMap<T, hhf> $$2 = new Object2ObjectOpenHashMap();

         for (hhm.b<T> $$3 : this.c) {
            hhf.b $$4 = $$3.b;
            hhf $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hhm<>(this.b, this.a($$2, $$0.d()));
      }

      private hhm.a<T> a(Object2ObjectMap<T, hhf> $$0, @Nullable baj $$1) {
         if ($$1 == null) {
            return ($$1x, $$2x) -> (hhf)$$0.get($$1x);
         } else {
            hhf $$2 = (hhf)$$0.defaultReturnValue();
            glh<glo, Object2ObjectMap<T, hhf>> $$3 = new glh<>($$3x -> {
               Object2ObjectMap<T, hhf> $$4 = new Object2ObjectOpenHashMap($$0.size());
               $$4.defaultReturnValue($$2);
               $$0.forEach(($$3xx, $$4x) -> $$1.a(this.b.b(), $$3xx, $$3x.J_()).ifSuccess($$2xxx -> $$4.put($$2xxx, $$4x)));
               return $$4;
            });
            return ($$3x, $$4) -> {
               if ($$4 == null) {
                  return (hhf)$$0.get($$3x);
               } else {
                  return $$3x == null ? $$2 : (hhf)$$3.a($$4).get($$3x);
               }
            };
         }
      }

      public void a(hnh.a $$0) {
         for (hhm.b<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hhm.b<T>> b() {
         return this.c;
      }
   }
}
