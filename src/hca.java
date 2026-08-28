import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hca() implements hby {
   public static final MapCodec<hca> a = MapCodec.unit(new hca());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hca> a() {
      return a;
   }
}
