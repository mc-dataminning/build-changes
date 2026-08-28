import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lx implements lq {
   private static final Codec<eav> c = eav.c
      .validate($$0 -> $$0 instanceof eap ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lx::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lx::c)).apply($$0, lx::new)
   );
   public static final zh<wu, lx> b = zh.a(eav.d, lx::b, zf.h, lx::c, lx::new);
   private final eav d;
   private final int e;

   public lx(eav $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lr<lx> a() {
      return ls.T;
   }

   public eav b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
