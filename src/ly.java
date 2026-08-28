import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ly implements lt {
   public static final MapCodec<ly> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ly::new));
   public static final yt<wg, ly> b = yt.a(yr.h, $$0 -> $$0.c, ly::new);
   private final int c;

   public ly(int $$0) {
      this.c = $$0;
   }

   @Override
   public lu<ly> a() {
      return lv.aY;
   }

   public int b() {
      return this.c;
   }
}
