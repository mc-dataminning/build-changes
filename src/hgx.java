import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgx() implements hgt {
   public static final MapCodec<hgx> a = MapCodec.unit(new hgx());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      if ($$2 instanceof crm $$5 && $$5.ck != null) {
         bxa $$6 = gxf.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hgx> a() {
      return a;
   }
}
