import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hdq<T> implements hdk {
   private final hfi<T> a;
   private final Object2ObjectMap<T, hdk> b;

   public hdq(hfi<T> $$0, Object2ObjectMap<T, hdk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      T $$7 = this.a.b($$1, $$4, $$5, $$6, $$3);
      hdk $$8 = (hdk)this.b.get($$7);
      if ($$8 != null) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a<T>(List<T> a, hdk.b b) {

      public static <T> Codec<hdq.a<T>> a(Codec<T> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group(ays.b(ays.a($$0)).fieldOf("when").forGetter(hdq.a::a), hdm.a.fieldOf("model").forGetter(hdq.a::b)).apply($$1, hdq.a::new)
         );
      }
   }

   public static record b(hdq.c<?, ?> b, Optional<hdk.b> c) implements hdk.b {
      public static final MapCodec<hdq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hdq.c.a.forGetter(hdq.b::b), hdm.a.optionalFieldOf("fallback").forGetter(hdq.b::c)).apply($$0, hdq.b::new)
      );

      @Override
      public MapCodec<hdq.b> a() {
         return a;
      }

      @Override
      public hdk a(hdk.a $$0) {
         hdk $$1 = this.c.<hdk>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return this.b.a($$0, $$1);
      }

      @Override
      public void a(hjk.a $$0) {
         this.b.a($$0);
         this.c.ifPresent($$1 -> $$1.a($$0));
      }
   }

   public static record c<P extends hfi<T>, T>(P b, List<hdq.a<T>> c) {
      public static final MapCodec<hdq.c<?, ?>> a = hfh.a.dispatchMap("property", $$0 -> $$0.a().a(), hfi.a::a);

      public hdk a(hdk.a $$0, hdk $$1) {
         Object2ObjectMap<T, hdk> $$2 = new Object2ObjectOpenHashMap();

         for (hdq.a<T> $$3 : this.c) {
            hdk.b $$4 = $$3.b;
            hdk $$5 = $$4.a($$0);

            for (T $$6 : $$3.a) {
               $$2.put($$6, $$5);
            }
         }

         $$2.defaultReturnValue($$1);
         return new hdq(this.b, $$2);
      }

      public void a(hjk.a $$0) {
         for (hdq.a<?> $$1 : this.c) {
            $$1.b.a($$0);
         }
      }

      public P a() {
         return this.b;
      }

      public List<hdq.a<T>> b() {
         return this.c;
      }
   }
}
