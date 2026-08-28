import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbw() implements hbu {
   public static final MapCodec<hbw> a = MapCodec.unit(new hbw());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$0.n();
   }

   @Override
   public MapCodec<hbw> a() {
      return a;
   }
}
