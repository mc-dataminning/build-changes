import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgc(boolean b) implements hfz {
   public static final MapCodec<hgc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hgc::b)).apply($$0, hgc::new)
   );

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      if ($$2 != null && $$2.fA() == $$0) {
         return this.b ? (float)$$2.fB() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hgc> a() {
      return a;
   }

   public static int a(cys $$0, bwz $$1) {
      return $$0.a($$1) - $$1.fB();
   }
}
