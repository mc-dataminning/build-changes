import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ln implements lg {
   private static final Codec<dwz> c = dwz.c
      .validate($$0 -> $$0 instanceof dwt ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ln::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ln::c)).apply($$0, ln::new)
   );
   public static final zn<xa, ln> b = zn.a(dwz.d, ln::b, zl.g, ln::c, ln::new);
   private final dwz d;
   private final int e;

   public ln(dwz $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lh<ln> a() {
      return li.T;
   }

   public dwz b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
