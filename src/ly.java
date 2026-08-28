import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ly implements lq {
   private static final Codec<ecu> c = ecu.c
      .validate($$0 -> $$0 instanceof eco ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ly::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ly::c)).apply($$0, ly::new)
   );
   public static final zt<xg, ly> b = zt.a(ecu.d, ly::b, zr.h, ly::c, ly::new);
   private final ecu d;
   private final int e;

   public ly(ecu $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lr<ly> a() {
      return ls.T;
   }

   public ecu b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
