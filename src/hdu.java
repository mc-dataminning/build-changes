import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdu(float b) implements hds {
   public static final MapCodec<hdu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("period", 1.0F).forGetter(hdu::b)).apply($$0, hdu::new)
   );

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      return $$2 != null && $$2.fD() == $$0 ? (float)$$2.fE() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hdu> a() {
      return a;
   }
}
