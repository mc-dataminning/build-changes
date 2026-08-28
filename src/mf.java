import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mf implements lx {
   private static final Codec<egk> c = egk.c
      .validate($$0 -> $$0 instanceof ege ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<mf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(mf::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(mf::c)).apply($$0, mf::new)
   );
   public static final za<wn, mf> b = za.a(egk.d, mf::b, yy.h, mf::c, mf::new);
   private final egk d;
   private final int e;

   public mf(egk $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ly<mf> a() {
      return lz.V;
   }

   public egk b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
