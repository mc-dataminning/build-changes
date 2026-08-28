import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcd(boolean b) implements hbu {
   public static final MapCodec<hcd> a = MapCodec.unit(hcd::new);

   public hcd() {
      this(goo.b());
   }

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return this.b;
   }

   @Override
   public MapCodec<hcd> a() {
      return a;
   }
}
