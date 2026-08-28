import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjf(boolean b) implements hjc {
   public static final MapCodec<hjf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hjf::b)).apply($$0, hjf::new)
   );

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hjf> a() {
      return a;
   }

   public static int a(daa $$0, bxw $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
