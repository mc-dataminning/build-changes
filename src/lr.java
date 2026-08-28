import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lr implements lk {
   private static final Codec<dyd> c = dyd.c
      .validate($$0 -> $$0 instanceof dxx ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lr::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lr::c)).apply($$0, lr::new)
   );
   public static final yx<wk, lr> b = yx.a(dyd.d, lr::b, yv.g, lr::c, lr::new);
   private final dyd d;
   private final int e;

   public lr(dyd $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ll<lr> a() {
      return lm.T;
   }

   public dyd b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
