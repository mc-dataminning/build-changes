import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgw() implements hgt {
   public static final MapCodec<hgw> a = MapCodec.unit(new hgw());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$4 == czl.g && fys.t();
   }

   @Override
   public MapCodec<hgw> a() {
      return a;
   }
}
