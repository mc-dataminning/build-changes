import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbs<T> implements hbm {
   private final hdj<T> a;
   private final Object2ObjectMap<T, hbm> b;

   public hbs(hdj<T> $$0, Object2ObjectMap<T, hbm> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hbm $$8 = (hbm)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hbm.b b) {

      public static <T> Codec<hbs.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayi.b(ayi.a($$0)).fieldOf("when").forGetter(hbs.a::a), hbo.a.fieldOf("model").forGetter(hbs.a::b)).apply($$1, hbs.a::new)
         );
      }
   }

   public static record b(hbs.c<?, ?> b, Optional<hbm.b> c) implements hbm.b {
      public static final MapCodec<hbs.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbs.c.a.forGetter(hbs.b::b), hbo.a.optionalFieldOf("fallback").forGetter(hbs.b::c)).apply($$0, hbs.b::new)
      );

      @Override
      public MapCodec<hbs.b> a() {
         return a;
      }

      @Override
      public hbm a(hbm.a $$0) {
         hbm $$1 = this.c.<hbm>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hhl.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hdj<T>, T>(P b, List<hbs.a<T>> c) {
      public static final MapCodec<hbs.c<?, ?>> a = hdi.a.dispatchMap("property", $$0 -> $$0.a().a(), hdj.a::a);

      public hbm a(hbm.a $$0, hbm $$1) {
         Object2ObjectMap<T, hbm> $$2 = new Object2ObjectOpenHashMap();

         for (hbs.a<T> $$3 : this.c) {
            hbm.b $$4 = $$3.b;
            hbm $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hbs(this.b, $$2);
      }

      public void a(hhl.a $$0) {
         for (hbs.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hbs.a<T>> b() {
         return this.c;
      }
   }
}
