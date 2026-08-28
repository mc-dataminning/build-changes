import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbr<T> implements hbl {
   private final hdi<T> a;
   private final Object2ObjectMap<T, hbl> b;

   public hbr(hdi<T> $$0, Object2ObjectMap<T, hbl> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hbl $$8 = (hbl)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hbl.b b) {

      public static <T> Codec<hbr.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayi.b(ayi.a($$0)).fieldOf("when").forGetter(hbr.a::a), hbn.a.fieldOf("model").forGetter(hbr.a::b)).apply($$1, hbr.a::new)
         );
      }
   }

   public static record b(hbr.c<?, ?> b, Optional<hbl.b> c) implements hbl.b {
      public static final MapCodec<hbr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbr.c.a.forGetter(hbr.b::b), hbn.a.optionalFieldOf("fallback").forGetter(hbr.b::c)).apply($$0, hbr.b::new)
      );

      @Override
      public MapCodec<hbr.b> a() {
         return a;
      }

      @Override
      public hbl a(hbl.a $$0) {
         hbl $$1 = this.c.<hbl>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hhk.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hdi<T>, T>(P b, List<hbr.a<T>> c) {
      public static final MapCodec<hbr.c<?, ?>> a = hdh.a.dispatchMap("property", $$0 -> $$0.a().a(), hdi.a::a);

      public hbl a(hbl.a $$0, hbl $$1) {
         Object2ObjectMap<T, hbl> $$2 = new Object2ObjectOpenHashMap();

         for (hbr.a<T> $$3 : this.c) {
            hbl.b $$4 = $$3.b;
            hbl $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hbr(this.b, $$2);
      }

      public void a(hhk.a $$0) {
         for (hbr.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hbr.a<T>> b() {
         return this.c;
      }
   }
}
