import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lu(float c) implements lq {
   public static final MapCodec<lu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lu::new));
   public static final zt<xg, lu> b = zt.a(zr.l, $$0 -> $$0.c, lu::new);

   @Override
   public lr<lu> a() {
      return ls.J;
   }

   public float b() {
      return this.c;
   }
}
