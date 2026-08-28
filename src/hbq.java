import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hbq<T> implements hbk {
   private final hdh<T> a;
   private final Object2ObjectMap<T, hbk> b;

   public hbq(hdh<T> $$0, Object2ObjectMap<T, hbk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hbk $$8 = (hbk)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hbk.b b) {

      public static <T> Codec<hbq.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayi.b(ayi.a($$0)).fieldOf("when").forGetter(hbq.a::a), hbm.a.fieldOf("model").forGetter(hbq.a::b)).apply($$1, hbq.a::new)
         );
      }
   }

   public static record b(hbq.c<?, ?> b, Optional<hbk.b> c) implements hbk.b {
      public static final MapCodec<hbq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbq.c.a.forGetter(hbq.b::b), hbm.a.optionalFieldOf("fallback").forGetter(hbq.b::c)).apply($$0, hbq.b::new)
      );

      @Override
      public MapCodec<hbq.b> a() {
         return a;
      }

      @Override
      public hbk a(hbk.a $$0) {
         hbk $$1 = this.c.<hbk>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hhj.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hdh<T>, T>(P b, List<hbq.a<T>> c) {
      public static final MapCodec<hbq.c<?, ?>> a = hdg.a.dispatchMap("property", $$0 -> $$0.a().a(), hdh.a::a);

      public hbk a(hbk.a $$0, hbk $$1) {
         Object2ObjectMap<T, hbk> $$2 = new Object2ObjectOpenHashMap();

         for (hbq.a<T> $$3 : this.c) {
            hbk.b $$4 = $$3.b;
            hbk $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hbq(this.b, $$2);
      }

      public void a(hhj.a $$0) {
         for (hbq.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hbq.a<T>> b() {
         return this.c;
      }
   }
}
