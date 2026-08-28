import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgs(boolean b) implements hgp {
   public static final MapCodec<hgs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hgs::b)).apply($$0, hgs::new)
   );

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      if ($$2 != null && $$2.fA() == $$0) {
         return this.b ? (float)$$2.fB() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hgs> a() {
      return a;
   }

   public static int a(cyy $$0, bxc $$1) {
      return $$0.a($$1) - $$1.fB();
   }
}
