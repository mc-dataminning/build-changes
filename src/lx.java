import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lx(fbs c, int d) implements lq {
   public static final MapCodec<lx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbs.a.fieldOf("target").forGetter(lx::b), Codec.INT.fieldOf("color").forGetter(lx::c)).apply($$0, lx::new)
   );
   public static final zt<xg, lx> b = zt.a(fbs.b, lx::b, zr.g, lx::c, lx::new);

   @Override
   public lr<lx> a() {
      return ls.U;
   }

   public fbs b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
