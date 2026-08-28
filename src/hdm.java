import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdm(boolean b) implements hds {
   public static final MapCodec<hdm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hdm::b)).apply($$0, hdm::new)
   );

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? ayz.a($$4 / $$5, 0.0F, 1.0F) : ayz.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hdm> a() {
      return a;
   }
}
