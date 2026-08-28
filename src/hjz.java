import com.mojang.serialization.MapCodec;

public class hjz implements hkc {
   private final glg a;

   public hjz(glg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      flt $$6 = gux.b.a($$2, gsn::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hkg.a {
      public static final MapCodec<hjz.a> a = MapCodec.unit(new hjz.a());

      @Override
      public MapCodec<hjz.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hjz($$0.a(glf.al));
      }
   }
}
