import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcf() implements hbx {
   public static final MapCodec<hcf> a = MapCodec.unit(new hcf());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      if ($$2 instanceof gkw $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hcf> a() {
      return a;
   }
}
