import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lu implements lp {
   public static final MapCodec<lu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lu::new));
   public static final zg<wt, lu> b = zg.a(ze.h, $$0 -> $$0.c, lu::new);
   private final int c;

   public lu(int $$0) {
      this.c = $$0;
   }

   @Override
   public lq<lu> a() {
      return lr.aV;
   }

   public int b() {
      return this.c;
   }
}
