import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hdj implements hdk {
   public static final hdk a = new hdj();

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
   }

   public static record a() implements hdk.b {
      public static final MapCodec<hdj.a> a = MapCodec.unit(hdj.a::new);

      @Override
      public void a(hjk.a $$0) {
      }

      @Override
      public hdk a(hdk.a $$0) {
         return hdj.a;
      }

      @Override
      public MapCodec<hdj.a> a() {
         return a;
      }
   }
}
