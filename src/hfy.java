import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfy implements hfz {
   public static final hfz a = new hfy();

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
   }

   public static record a() implements hfz.b {
      public static final MapCodec<hfy.a> a = MapCodec.unit(hfy.a::new);

      @Override
      public void a(hmb.a $$0) {
      }

      @Override
      public hfz a(hfz.a $$0) {
         return hfy.a;
      }

      @Override
      public MapCodec<hfy.a> a() {
         return a;
      }
   }
}
