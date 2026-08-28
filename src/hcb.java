import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcb() implements hbx {
   public static final MapCodec<hcb> a = MapCodec.unit(new hcb());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      if ($$2 instanceof cox $$5 && $$5.cw != null) {
         bvb $$6 = gsl.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hcb> a() {
      return a;
   }
}
