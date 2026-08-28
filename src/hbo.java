import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbo<T> implements hbi {
   private final hdb<T> a;
   private final Object2ObjectMap<T, hbi> b;

   public hbo(hdb<T> $$0, Object2ObjectMap<T, hbi> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hbi $$8 = (hbi)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hbi.b b) {

      public static <T> Codec<hbo.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayi.b(ayi.a($$0)).fieldOf("when").forGetter(hbo.a::a), hbk.a.fieldOf("model").forGetter(hbo.a::b)).apply($$1, hbo.a::new)
         );
      }
   }

   public static record b(hbo.c<?, ?> b, Optional<hbi.b> c) implements hbi.b {
      public static final MapCodec<hbo.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbo.c.a.forGetter(hbo.b::b), hbk.a.optionalFieldOf("fallback").forGetter(hbo.b::c)).apply($$0, hbo.b::new)
      );

      @Override
      public MapCodec<hbo.b> a() {
         return a;
      }

      @Override
      public hbi a(hbi.a $$0) {
         hbi $$1 = this.c.<hbi>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hhd.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hdb<T>, T>(P b, List<hbo.a<T>> c) {
      public static final MapCodec<hbo.c<?, ?>> a = hda.a.dispatchMap("property", $$0 -> $$0.a().a(), hdb.a::a);

      public hbi a(hbi.a $$0, hbi $$1) {
         Object2ObjectMap<T, hbi> $$2 = new Object2ObjectOpenHashMap();

         for (hbo.a<T> $$3 : this.c) {
            hbi.b $$4 = $$3.b;
            hbi $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hbo(this.b, $$2);
      }

      public void a(hhd.a $$0) {
         for (hbo.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hbo.a<T>> b() {
         return this.c;
      }
   }
}
