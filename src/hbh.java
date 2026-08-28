import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbh implements hbm {
   static final hbm a = new hbh();

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      cwq $$7 = cvd.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hbm.b {
      public static final MapCodec<hbh.a> a = MapCodec.unit(new hbh.a());

      @Override
      public MapCodec<hbh.a> a() {
         return a;
      }

      @Override
      public hbm a(hbm.a $$0) {
         return hbh.a;
      }

      @Override
      public void a(hhl.a $$0) {
      }
   }
}
