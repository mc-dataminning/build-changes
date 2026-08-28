import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hge implements hgf {
   public static final hgf a = new hge();

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
   }

   public static record a() implements hgf.b {
      public static final MapCodec<hge.a> a = MapCodec.unit(hge.a::new);

      @Override
      public void a(hmi.a $$0) {
      }

      @Override
      public hgf a(hgf.a $$0) {
         return hge.a;
      }

      @Override
      public MapCodec<hge.a> a() {
         return a;
      }
   }
}
