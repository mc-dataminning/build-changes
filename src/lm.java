import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lm implements lh {
   public static final MapCodec<lm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lm::new));
   public static final ys<wf, lm> b = ys.a(yq.g, $$0 -> $$0.c, lm::new);
   private final int c;

   public lm(int $$0) {
      this.c = $$0;
   }

   @Override
   public li<lm> a() {
      return lj.aV;
   }

   public int b() {
      return this.c;
   }
}
