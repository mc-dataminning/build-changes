import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ma implements lv {
   public static final MapCodec<ma> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ma::new));
   public static final yw<wj, ma> b = yw.a(yu.h, $$0 -> $$0.c, ma::new);
   private final int c;

   public ma(int $$0) {
      this.c = $$0;
   }

   @Override
   public lw<ma> a() {
      return lx.aY;
   }

   public int b() {
      return this.c;
   }
}
