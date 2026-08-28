import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lr implements lm {
   public static final MapCodec<lr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lr::new));
   public static final zc<wp, lr> b = zc.a(za.h, $$0 -> $$0.c, lr::new);
   private final int c;

   public lr(int $$0) {
      this.c = $$0;
   }

   @Override
   public ln<lr> a() {
      return lo.aV;
   }

   public int b() {
      return this.c;
   }
}
