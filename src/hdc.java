import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdc() implements hcw {
   public static final MapCodec<hdc> a = MapCodec.unit(new hdc());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      if ($$2 instanceof glv $$5 && $$5.bQ.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hdc> a() {
      return a;
   }
}
