import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hcq<T> implements hck {
   private final heh<T> a;
   private final Object2ObjectMap<T, hck> b;

   public hcq(heh<T> $$0, Object2ObjectMap<T, hck> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hck $$8 = (hck)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hck.b b) {

      public static <T> Codec<hcq.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ayi.b(ayi.a($$0)).fieldOf("when").forGetter(hcq.a::a), hcm.a.fieldOf("model").forGetter(hcq.a::b)).apply($$1, hcq.a::new)
         );
      }
   }

   public static record b(hcq.c<?, ?> b, Optional<hck.b> c) implements hck.b {
      public static final MapCodec<hcq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hcq.c.a.forGetter(hcq.b::b), hcm.a.optionalFieldOf("fallback").forGetter(hcq.b::c)).apply($$0, hcq.b::new)
      );

      @Override
      public MapCodec<hcq.b> a() {
         return a;
      }

      @Override
      public hck a(hck.a $$0) {
         hck $$1 = this.c.<hck>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hij.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends heh<T>, T>(P b, List<hcq.a<T>> c) {
      public static final MapCodec<hcq.c<?, ?>> a = heg.a.dispatchMap("property", $$0 -> $$0.a().a(), heh.a::a);

      public hck a(hck.a $$0, hck $$1) {
         Object2ObjectMap<T, hck> $$2 = new Object2ObjectOpenHashMap();

         for (hcq.a<T> $$3 : this.c) {
            hck.b $$4 = $$3.b;
            hck $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hcq(this.b, $$2);
      }

      public void a(hij.a $$0) {
         for (hcq.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hcq.a<T>> b() {
         return this.c;
      }
   }
}
