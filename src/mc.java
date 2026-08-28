import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mc implements lx {
   public static final MapCodec<mc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, mc::new));
   public static final za<wn, mc> b = za.a(yy.h, $$0 -> $$0.c, mc::new);
   private final int c;

   public mc(int $$0) {
      this.c = $$0;
   }

   @Override
   public ly<mc> a() {
      return lz.aY;
   }

   public int b() {
      return this.c;
   }
}
