import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lz implements lr {
   private static final Codec<ebx> c = ebx.c
      .validate($$0 -> $$0 instanceof ebr ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lz::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lz::c)).apply($$0, lz::new)
   );
   public static final ym<vz, lz> b = ym.a(ebx.d, lz::b, yk.h, lz::c, lz::new);
   private final ebx d;
   private final int e;

   public lz(ebx $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ls<lz> a() {
      return lt.U;
   }

   public ebx b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
