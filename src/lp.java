import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lp implements lk {
   public static final MapCodec<lp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lp::new));
   public static final yw<wj, lp> b = yw.a(yu.g, $$0 -> $$0.c, lp::new);
   private final int c;

   public lp(int $$0) {
      this.c = $$0;
   }

   @Override
   public ll<lp> a() {
      return lm.aV;
   }

   public int b() {
      return this.c;
   }
}
