import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lw implements lr {
   public static final MapCodec<lw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lw::new));
   public static final yn<wa, lw> b = yn.a(yl.h, $$0 -> $$0.c, lw::new);
   private final int c;

   public lw(int $$0) {
      this.c = $$0;
   }

   @Override
   public ls<lw> a() {
      return lt.aY;
   }

   public int b() {
      return this.c;
   }
}
