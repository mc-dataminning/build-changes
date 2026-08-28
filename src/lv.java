import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lv implements lo {
   private static final Codec<eae> c = eae.c
      .validate($$0 -> $$0 instanceof dzy ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lv::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lv::c)).apply($$0, lv::new)
   );
   public static final zf<ws, lv> b = zf.a(eae.d, lv::b, zd.h, lv::c, lv::new);
   private final eae d;
   private final int e;

   public lv(eae $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lp<lv> a() {
      return lq.T;
   }

   public eae b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
