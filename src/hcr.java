import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcr(boolean b) implements hco {
   public static final MapCodec<hcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hcr::b)).apply($$0, hcr::new)
   );

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hcr> a() {
      return a;
   }

   public static int a(cwn $$0, bvf $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
