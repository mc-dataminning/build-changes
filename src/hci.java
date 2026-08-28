import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hci() implements hby {
   public static final MapCodec<hci> a = MapCodec.unit(new hci());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      flk $$5 = flk.Q();
      bum $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hci> a() {
      return a;
   }
}
