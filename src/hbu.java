import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbu() implements hbx {
   public static final MapCodec<hbu> a = MapCodec.unit(new hbu());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hbu> a() {
      return a;
   }
}
