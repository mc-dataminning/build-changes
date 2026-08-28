import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbz() implements hbw {
   public static final MapCodec<hbz> a = MapCodec.unit(new hbz());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return $$4 == cwm.g && fuk.t();
   }

   @Override
   public MapCodec<hbz> a() {
      return a;
   }
}
