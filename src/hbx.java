import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbx() implements hbu {
   public static final MapCodec<hbx> a = MapCodec.unit(new hbx());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 instanceof cox $$4 && $$4.cw != null) {
         bva $$5 = gsj.a($$4);
         return $$2.a($$5) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hbx> a() {
      return a;
   }
}
