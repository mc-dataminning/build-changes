import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcs(boolean b) implements hcp {
   public static final MapCodec<hcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hcs::b)).apply($$0, hcs::new)
   );

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hcs> a() {
      return a;
   }

   public static int a(cwp $$0, bvg $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
