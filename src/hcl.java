import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcl() implements hcs {
   public static final MapCodec<hcl> a = MapCodec.unit(new hcl());

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$2 instanceof cow $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hcl> a() {
      return a;
   }
}
