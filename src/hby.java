import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hby() implements hbw {
   public static final MapCodec<hby> a = MapCodec.unit(new hby());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hby> a() {
      return a;
   }
}
