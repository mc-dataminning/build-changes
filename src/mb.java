import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mb implements lt {
   private static final Codec<edq> c = edq.c
      .validate($$0 -> $$0 instanceof edk ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<mb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(mb::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(mb::c)).apply($$0, mb::new)
   );
   public static final yt<wg, mb> b = yt.a(edq.d, mb::b, yr.h, mb::c, mb::new);
   private final edq d;
   private final int e;

   public mb(edq $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public lu<mb> a() {
      return lv.V;
   }

   public edq b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
