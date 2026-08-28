import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbf implements hbk {
   static final hbk a = new hbf();

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      cwo $$7 = cvb.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hbk.b {
      public static final MapCodec<hbf.a> a = MapCodec.unit(new hbf.a());

      @Override
      public MapCodec<hbf.a> a() {
         return a;
      }

      @Override
      public hbk a(hbk.a $$0) {
         return hbf.a;
      }

      @Override
      public void a(hhj.a $$0) {
      }
   }
}
