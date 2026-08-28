import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcb() implements hbu {
   public static final MapCodec<hcb> a = MapCodec.unit(new hcb());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return fuk.t();
   }

   @Override
   public MapCodec<hcb> a() {
      return a;
   }
}
