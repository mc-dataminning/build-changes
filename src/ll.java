import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ll implements lh {
   public static final MapCodec<ll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ll::new));
   public static final zj<ww, ll> b = zj.a(zh.g, $$0 -> $$0.c, ll::new);
   private final int c;

   public ll(int $$0) {
      this.c = $$0;
   }

   @Override
   public li<ll> a() {
      return lj.aV;
   }

   public int b() {
      return this.c;
   }
}
