import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hem(boolean b) implements hes {
   public static final MapCodec<hem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hem::b)).apply($$0, hem::new)
   );

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? azk.a($$4 / $$5, 0.0F, 1.0F) : azk.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hem> a() {
      return a;
   }
}
