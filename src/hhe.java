import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhe implements hhf {
   public static final hhf a = new hhe();

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
   }

   public static record a() implements hhf.b {
      public static final MapCodec<hhe.a> a = MapCodec.unit(hhe.a::new);

      @Override
      public void a(hnh.a $$0) {
      }

      @Override
      public hhf a(hhf.a $$0) {
         return hhe.a;
      }

      @Override
      public MapCodec<hhe.a> a() {
         return a;
      }
   }
}
