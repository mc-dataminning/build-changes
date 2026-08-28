import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcb() implements hby {
   public static final MapCodec<hcb> a = MapCodec.unit(new hcb());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return $$4 == cwo.g && fum.t();
   }

   @Override
   public MapCodec<hcb> a() {
      return a;
   }
}
