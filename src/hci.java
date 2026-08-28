import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hci() implements hcs {
   public static final MapCodec<hci> a = MapCodec.unit(new hci());

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return cvb.c($$0);
   }

   @Override
   public MapCodec<hci> a() {
      return a;
   }
}
