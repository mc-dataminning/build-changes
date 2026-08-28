import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhq implements hhr {
   public static final hhr a = new hhq();

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
   }

   public static record a() implements hhr.b {
      public static final MapCodec<hhq.a> a = MapCodec.unit(hhq.a::new);

      @Override
      public void a(hnt.a $$0) {
      }

      @Override
      public hhr a(hhr.a $$0) {
         return hhq.a;
      }

      @Override
      public MapCodec<hhq.a> a() {
         return a;
      }
   }
}
