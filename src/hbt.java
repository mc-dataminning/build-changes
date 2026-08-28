import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbt() implements hbw {
   public static final MapCodec<hbt> a = MapCodec.unit(new hbt());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hbt> a() {
      return a;
   }
}
