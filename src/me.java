import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class me implements lw {
   private static final Codec<efx> c = efx.c
      .validate($$0 -> $$0 instanceof efr ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<me> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(me::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(me::c)).apply($$0, me::new)
   );
   public static final yw<wj, me> b = yw.a(efx.d, me::b, yu.h, me::c, me::new);
   private final efx d;
   private final int e;

   public me(efx $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lx<me> a() {
      return ly.V;
   }

   public efx b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
