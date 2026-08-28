import com.mojang.serialization.MapCodec;

public class hdi implements hdk {
   private final gfc a;

   public hdi(gfc $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwn $$0, ffu $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      ffy $$6 = gop.a.a($$2, gmh::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdo.a {
      public static final MapCodec<hdi.a> a = MapCodec.unit(new hdi.a());

      @Override
      public MapCodec<hdi.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdi($$0.a(gfb.ad));
      }
   }
}
