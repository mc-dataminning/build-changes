import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lo implements lh {
   private static final Codec<dxl> c = dxl.c
      .validate($$0 -> $$0 instanceof dxf ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<lo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(lo::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(lo::c)).apply($$0, lo::new)
   );
   public static final ys<wf, lo> b = ys.a(dxl.d, lo::b, yq.g, lo::c, lo::new);
   private final dxl d;
   private final int e;

   public lo(dxl $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public li<lo> a() {
      return lj.T;
   }

   public dxl b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
