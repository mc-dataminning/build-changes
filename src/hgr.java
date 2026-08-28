import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgr() implements hgn {
   public static final MapCodec<hgr> a = MapCodec.unit(new hgr());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      if ($$2 instanceof crj $$5 && $$5.ck != null) {
         bxa $$6 = gxa.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hgr> a() {
      return a;
   }
}
