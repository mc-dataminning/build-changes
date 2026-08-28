import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcf implements hck {
   static final hck a = new hcf();

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      cxh $$7 = cvv.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hck.b {
      public static final MapCodec<hcf.a> a = MapCodec.unit(new hcf.a());

      @Override
      public MapCodec<hcf.a> a() {
         return a;
      }

      @Override
      public hck a(hck.a $$0) {
         return hcf.a;
      }

      @Override
      public void a(hij.a $$0) {
      }
   }
}
