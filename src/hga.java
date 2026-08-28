import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hga implements hgf {
   static final hgf a = new hga();

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      czn $$7 = cyc.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hgf.b {
      public static final MapCodec<hga.a> a = MapCodec.unit(new hga.a());

      @Override
      public MapCodec<hga.a> a() {
         return a;
      }

      @Override
      public hgf a(hgf.a $$0) {
         return hga.a;
      }

      @Override
      public void a(hmi.a $$0) {
      }
   }
}
