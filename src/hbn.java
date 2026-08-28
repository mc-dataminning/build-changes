import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbn<T> implements hbh {
   private final hdc<T> a;
   private final Object2ObjectMap<T, hbh> b;

   public hbn(hdc<T> $$0, Object2ObjectMap<T, hbh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hbh $$8 = (hbh)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hbh.b b) {

      public static <T> Codec<hbn.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayh.b(ayh.a($$0)).fieldOf("when").forGetter(hbn.a::a), hbj.a.fieldOf("model").forGetter(hbn.a::b)).apply($$1, hbn.a::new)
         );
      }
   }

   public static record b(hbn.c<?, ?> b, Optional<hbh.b> c) implements hbh.b {
      public static final MapCodec<hbn.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbn.c.a.forGetter(hbn.b::b), hbj.a.optionalFieldOf("fallback").forGetter(hbn.b::c)).apply($$0, hbn.b::new)
      );

      @Override
      public MapCodec<hbn.b> a() {
         return a;
      }

      @Override
      public hbh a(hbh.a $$0) {
         hbh $$1 = this.c.<hbh>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hhe.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hdc<T>, T>(P b, List<hbn.a<T>> c) {
      public static final MapCodec<hbn.c<?, ?>> a = hdb.a.dispatchMap("property", $$0 -> $$0.a().a(), hdc.a::a);

      public hbh a(hbh.a $$0, hbh $$1) {
         Object2ObjectMap<T, hbh> $$2 = new Object2ObjectOpenHashMap();

         for (hbn.a<T> $$3 : this.c) {
            hbh.b $$4 = $$3.b;
            hbh $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hbn(this.b, $$2);
      }

      public void a(hhe.a $$0) {
         for (hbn.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hbn.a<T>> b() {
         return this.c;
      }
   }
}
