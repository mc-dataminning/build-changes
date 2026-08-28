import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lx implements lq {
   private static final Codec<eao> c = eao.c
      .validate($$0 -> $$0 instanceof eai ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lx::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lx::c)).apply($$0, lx::new)
   );
   public static final zj<ww, lx> b = zj.a(eao.d, lx::b, zh.h, lx::c, lx::new);
   private final eao d;
   private final int e;

   public lx(eao $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lr<lx> a() {
      return ls.T;
   }

   public eao b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
