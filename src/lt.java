import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lt implements lo {
   public static final MapCodec<lt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lt::new));
   public static final zf<ws, lt> b = zf.a(zd.h, $$0 -> $$0.c, lt::new);
   private final int c;

   public lt(int $$0) {
      this.c = $$0;
   }

   @Override
   public lp<lt> a() {
      return lq.aV;
   }

   public int b() {
      return this.c;
   }
}
