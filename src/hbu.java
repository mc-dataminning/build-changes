import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbu() implements hbw {
   public static final MapCodec<hbu> a = MapCodec.unit(new hbu());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return cvb.g($$0);
   }

   @Override
   public MapCodec<hbu> a() {
      return a;
   }
}
