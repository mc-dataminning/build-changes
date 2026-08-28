import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class md implements lv {
   private static final Codec<efl> c = efl.c
      .validate($$0 -> $$0 instanceof eff ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<md> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(md::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(md::c)).apply($$0, md::new)
   );
   public static final yw<wj, md> b = yw.a(efl.d, md::b, yu.h, md::c, md::new);
   private final efl d;
   private final int e;

   public md(efl $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lw<md> a() {
      return lx.V;
   }

   public efl b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
