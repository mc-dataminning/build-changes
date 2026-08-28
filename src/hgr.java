import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgr(float b) implements hgp {
   public static final MapCodec<hgr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("period", 1.0F).forGetter(hgr::b)).apply($$0, hgr::new)
   );

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      return $$2 != null && $$2.fA() == $$0 ? (float)$$2.fB() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hgr> a() {
      return a;
   }
}
