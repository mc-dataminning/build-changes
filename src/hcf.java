import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcf() implements hbw {
   public static final MapCodec<hcf> a = MapCodec.unit(new hcf());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hcf> a() {
      return a;
   }
}
