import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mb implements lw {
   public static final MapCodec<mb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, mb::new));
   public static final yw<wj, mb> b = yw.a(yu.h, $$0 -> $$0.c, mb::new);
   private final int c;

   public mb(int $$0) {
      this.c = $$0;
   }

   @Override
   public lx<mb> a() {
      return ly.aY;
   }

   public int b() {
      return this.c;
   }
}
