import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhm implements hhr {
   static final hhr a = new hhm();

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      daa $$7 = cyp.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hhr.b {
      public static final MapCodec<hhm.a> a = MapCodec.unit(new hhm.a());

      @Override
      public MapCodec<hhm.a> a() {
         return a;
      }

      @Override
      public hhr a(hhr.a $$0) {
         return hhm.a;
      }

      @Override
      public void a(hnt.a $$0) {
      }
   }
}
