import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lv implements lq {
   public static final MapCodec<lv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lv::new));
   public static final zt<xg, lv> b = zt.a(zr.h, $$0 -> $$0.c, lv::new);
   private final int c;

   public lv(int $$0) {
      this.c = $$0;
   }

   @Override
   public lr<lv> a() {
      return ls.aW;
   }

   public int b() {
      return this.c;
   }
}
