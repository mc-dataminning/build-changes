import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hde() implements hcw {
   public static final MapCodec<hde> a = MapCodec.unit(new hde());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      if ($$2 instanceof glv $$5 && $$5.gl().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hde> a() {
      return a;
   }
}
