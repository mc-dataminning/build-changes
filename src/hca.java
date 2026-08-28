import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hca() implements hbx {
   public static final MapCodec<hca> a = MapCodec.unit(new hca());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$4 == cwn.g && ful.t();
   }

   @Override
   public MapCodec<hca> a() {
      return a;
   }
}
