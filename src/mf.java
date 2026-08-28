import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mf implements lx {
   private static final Codec<egu> c = egu.c
      .validate($$0 -> $$0 instanceof ego ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<mf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(mf::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(mf::c)).apply($$0, mf::new)
   );
   public static final ze<wp, mf> b = ze.a(egu.d, mf::b, zc.h, mf::c, mf::new);
   private final egu d;
   private final int e;

   public mf(egu $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public ly<mf> a() {
      return lz.V;
   }

   public egu b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
