import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbv() implements hby {
   public static final MapCodec<hbv> a = MapCodec.unit(new hbv());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hbv> a() {
      return a;
   }
}
