import com.mojang.serialization.MapCodec;

public class hix implements hiq {
   private final giw a;

   public hix(giw $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fkh $$6 = gxw.a($$2, this.a.a(giw.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hiu.a {
      public static final MapCodec<hix.a> a = MapCodec.unit(new hix.a());

      @Override
      public MapCodec<hix.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hix(new giw($$0.a(gjs.dD)));
      }
   }
}
