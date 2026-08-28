import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lz(float c) implements lv {
   public static final MapCodec<lz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lz::new));
   public static final yw<wj, lz> b = yw.a(yu.l, $$0 -> $$0.c, lz::new);

   @Override
   public lw<lz> a() {
      return lx.L;
   }

   public float b() {
      return this.c;
   }
}
