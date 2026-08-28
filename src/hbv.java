import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbv() implements hbx {
   public static final MapCodec<hbv> a = MapCodec.unit(new hbv());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return cvc.g($$0);
   }

   @Override
   public MapCodec<hbv> a() {
      return a;
   }
}
