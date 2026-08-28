import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbz() implements hbx {
   public static final MapCodec<hbz> a = MapCodec.unit(new hbz());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hbz> a() {
      return a;
   }
}
