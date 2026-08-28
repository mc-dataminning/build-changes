import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ll implements lg {
   public static final MapCodec<ll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ll::new));
   public static final zn<xa, ll> b = zn.a(zl.g, $$0 -> $$0.c, ll::new);
   private final int c;

   public ll(int $$0) {
      this.c = $$0;
   }

   @Override
   public lh<ll> a() {
      return li.aV;
   }

   public int b() {
      return this.c;
   }
}
