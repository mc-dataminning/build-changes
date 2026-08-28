import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcj implements hck {
   public static final hck a = new hcj();

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
   }

   public static record a() implements hck.b {
      public static final MapCodec<hcj.a> a = MapCodec.unit(hcj.a::new);

      @Override
      public void a(hij.a $$0) {
      }

      @Override
      public hck a(hck.a $$0) {
         return hcj.a;
      }

      @Override
      public MapCodec<hcj.a> a() {
         return a;
      }
   }
}
