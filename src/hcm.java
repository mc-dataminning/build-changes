import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcm() implements hct {
   public static final MapCodec<hcm> a = MapCodec.unit(new hcm());

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
      return $$2 instanceof cox $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hcm> a() {
      return a;
   }
}
