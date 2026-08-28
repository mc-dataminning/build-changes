import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdv(boolean b) implements hds {
   public static final MapCodec<hdv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hdv::b)).apply($$0, hdv::new)
   );

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      if ($$2 != null && $$2.fD() == $$0) {
         return this.b ? (float)$$2.fE() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hdv> a() {
      return a;
   }

   public static int a(cxh $$0, bvy $$1) {
      return $$0.a($$1) - $$1.fE();
   }
}
