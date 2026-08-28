import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hch() implements hby {
   public static final MapCodec<hch> a = MapCodec.unit(new hch());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hch> a() {
      return a;
   }
}
