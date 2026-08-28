import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhh(boolean b) implements hhk {
   public static final MapCodec<hhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hhh::b)).apply($$0, hhh::new)
   );

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      float $$4 = (float)$$0.o();
      float $$5 = (float)$$0.p();
      return this.b ? azm.a($$4 / $$5, 0.0F, 1.0F) : azm.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hhh> a() {
      return a;
   }
}
