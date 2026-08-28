import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ly implements lq {
   private static final Codec<eco> c = eco.c
      .validate($$0 -> $$0 instanceof eci ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ly::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ly::c)).apply($$0, ly::new)
   );
   public static final zi<wv, ly> b = zi.a(eco.d, ly::b, zg.h, ly::c, ly::new);
   private final eco d;
   private final int e;

   public ly(eco $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lr<ly> a() {
      return ls.U;
   }

   public eco b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
