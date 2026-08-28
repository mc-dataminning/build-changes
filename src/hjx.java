import com.mojang.serialization.MapCodec;

public class hjx implements hka {
   private final gle a;

   public hjx(gle $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      flr $$6 = guv.b.a($$2, gsl::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hke.a {
      public static final MapCodec<hjx.a> a = MapCodec.unit(new hjx.a());

      @Override
      public MapCodec<hjx.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hjx($$0.a(gld.al));
      }
   }
}
