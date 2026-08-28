import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ln implements lh {
   private static final Codec<dwu> c = dwu.c
      .validate($$0 -> $$0 instanceof dwo ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ln::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ln::c)).apply($$0, ln::new)
   );
   public static final zj<ww, ln> b = zj.a(dwu.d, ln::b, zh.g, ln::c, ln::new);
   private final dwu d;
   private final int e;

   public ln(dwu $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public li<ln> a() {
      return lj.T;
   }

   public dwu b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
