import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhk(boolean b) implements hhq {
   public static final MapCodec<hhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hhk::b)).apply($$0, hhk::new)
   );

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? azm.a($$4 / $$5, 0.0F, 1.0F) : azm.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hhk> a() {
      return a;
   }
}
