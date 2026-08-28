import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hha implements hhf {
   static final hhf a = new hha();

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      dak $$7 = cyz.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hhf.b {
      public static final MapCodec<hha.a> a = MapCodec.unit(new hha.a());

      @Override
      public MapCodec<hha.a> a() {
         return a;
      }

      @Override
      public hhf a(hhf.a $$0) {
         return hha.a;
      }

      @Override
      public void a(hnh.a $$0) {
      }
   }
}
