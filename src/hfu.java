import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfu implements hfz {
   static final hfz a = new hfu();

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      czk $$7 = cxz.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hfz.b {
      public static final MapCodec<hfu.a> a = MapCodec.unit(new hfu.a());

      @Override
      public MapCodec<hfu.a> a() {
         return a;
      }

      @Override
      public hfz a(hfz.a $$0) {
         return hfu.a;
      }

      @Override
      public void a(hmb.a $$0) {
      }
   }
}
