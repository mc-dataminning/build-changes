import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lt implements lm {
   private static final Codec<dzt> c = dzt.c
      .validate($$0 -> $$0 instanceof dzn ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lt::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lt::c)).apply($$0, lt::new)
   );
   public static final zc<wp, lt> b = zc.a(dzt.d, lt::b, za.h, lt::c, lt::new);
   private final dzt d;
   private final int e;

   public lt(dzt $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ln<lt> a() {
      return lo.T;
   }

   public dzt b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
