import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lx(float c) implements lt {
   public static final MapCodec<lx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lx::new));
   public static final yt<wg, lx> b = yt.a(yr.l, $$0 -> $$0.c, lx::new);

   @Override
   public lu<lx> a() {
      return lv.L;
   }

   public float b() {
      return this.c;
   }
}
