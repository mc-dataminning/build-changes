import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcn() implements hcu {
   public static final MapCodec<hcn> a = MapCodec.unit(new hcn());

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      return $$2 instanceof coy $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hcn> a() {
      return a;
   }
}
