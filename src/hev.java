import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hev(boolean b) implements hes {
   public static final MapCodec<hev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hev::b)).apply($$0, hev::new)
   );

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      if ($$2 != null && $$2.fA() == $$0) {
         return this.b ? (float)$$2.fB() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hev> a() {
      return a;
   }

   public static int a(cxy $$0, bwr $$1) {
      return $$0.a($$1) - $$1.fB();
   }
}
