import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ls implements ll {
   private static final Codec<dzb> c = dzb.c
      .validate($$0 -> $$0 instanceof dyv ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ls::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ls::c)).apply($$0, ls::new)
   );
   public static final zb<wo, ls> b = zb.a(dzb.d, ls::b, yz.g, ls::c, ls::new);
   private final dzb d;
   private final int e;

   public ls(dzb $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lm<ls> a() {
      return ln.T;
   }

   public dzb b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
