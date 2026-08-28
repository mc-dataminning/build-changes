import com.mojang.serialization.MapCodec;

public class hin implements hiq {
   private final gjt a;

   public hin(gjt $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      fkh $$6 = gtl.b.a($$2, grc::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hiu.a {
      public static final MapCodec<hin.a> a = MapCodec.unit(new hin.a());

      @Override
      public MapCodec<hin.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hin($$0.a(gjs.al));
      }
   }
}
