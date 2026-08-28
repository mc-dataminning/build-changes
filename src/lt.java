import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class lt implements lq {
   public static final float e = 0.01F;
   public static final float f = 4.0F;
   protected static final Codec<Float> g = Codec.FLOAT
      .validate($$0 -> $$0 >= 0.01F && $$0 <= 4.0F ? DataResult.success($$0) : DataResult.error(() -> "Value must be within range [0.01;4.0]: " + $$0));
   private final float a;

   public lt(float $$0) {
      this.a = azu.a($$0, 0.01F, 4.0F);
   }

   public float d() {
      return this.a;
   }
}
