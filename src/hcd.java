import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcd() implements hbx {
   public static final MapCodec<hcd> a = MapCodec.unit(new hcd());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      if ($$2 instanceof gkw $$5 && $$5.cd.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hcd> a() {
      return a;
   }
}
