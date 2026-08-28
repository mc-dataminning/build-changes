import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbw() implements hby {
   public static final MapCodec<hbw> a = MapCodec.unit(new hbw());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return cvd.g($$0);
   }

   @Override
   public MapCodec<hbw> a() {
      return a;
   }
}
