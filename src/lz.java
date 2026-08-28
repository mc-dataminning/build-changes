import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lz implements lr {
   private static final Codec<ect> c = ect.c
      .validate($$0 -> $$0 instanceof ecn ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lz::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lz::c)).apply($$0, lz::new)
   );
   public static final yn<wa, lz> b = yn.a(ect.d, lz::b, yl.h, lz::c, lz::new);
   private final ect d;
   private final int e;

   public lz(ect $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ls<lz> a() {
      return lt.V;
   }

   public ect b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
