import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdg() implements hcw {
   public static final MapCodec<hdg> a = MapCodec.unit(new hdg());

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      fmg $$5 = fmg.Q();
      bva $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hdg> a() {
      return a;
   }
}
