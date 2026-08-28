import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hiz(boolean b) implements hjc {
   public static final MapCodec<hiz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hiz::b)).apply($$0, hiz::new)
   );

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      float $$4 = (float)$$0.o();
      float $$5 = (float)$$0.p();
      return this.b ? azq.a($$4 / $$5, 0.0F, 1.0F) : azq.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hiz> a() {
      return a;
   }
}
