import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lw implements lp {
   private static final Codec<eak> c = eak.c
      .validate($$0 -> $$0 instanceof eae ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lw::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lw::c)).apply($$0, lw::new)
   );
   public static final zg<wt, lw> b = zg.a(eak.d, lw::b, ze.h, lw::c, lw::new);
   private final eak d;
   private final int e;

   public lw(eak $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lq<lw> a() {
      return lr.T;
   }

   public eak b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
