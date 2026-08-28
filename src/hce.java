import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hce() implements hby {
   public static final MapCodec<hce> a = MapCodec.unit(new hce());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      if ($$2 instanceof gkx $$5 && $$5.cd.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hce> a() {
      return a;
   }
}
