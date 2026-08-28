import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ma(float c) implements lw {
   public static final MapCodec<ma> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, ma::new));
   public static final yy<wl, ma> b = yy.a(yw.l, $$0 -> $$0.c, ma::new);

   @Override
   public lx<ma> a() {
      return ly.L;
   }

   public float b() {
      return this.c;
   }
}
