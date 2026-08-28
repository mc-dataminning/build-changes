import com.mojang.serialization.MapCodec;

public class hkj implements hkc {
   private final gkj a;

   public hkj(gkj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      flt $$6 = gzi.a($$2, this.a.a(gkj.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hkg.a {
      public static final MapCodec<hkj.a> a = MapCodec.unit(new hkj.a());

      @Override
      public MapCodec<hkj.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hkj(new gkj($$0.a(glf.dD)));
      }
   }
}
