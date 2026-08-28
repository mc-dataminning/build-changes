import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ls implements ll {
   private static final Codec<dzp> c = dzp.c
      .validate($$0 -> $$0 instanceof dzj ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<ls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(ls::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(ls::c)).apply($$0, ls::new)
   );
   public static final zb<wo, ls> b = zb.a(dzp.d, ls::b, yz.g, ls::c, ls::new);
   private final dzp d;
   private final int e;

   public ls(dzp $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lm<ls> a() {
      return ln.T;
   }

   public dzp b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
