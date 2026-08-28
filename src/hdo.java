import com.mojang.serialization.MapCodec;

public class hdo implements hdr {
   private final gfc a;

   public hdo(gfc $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      ffx $$6 = goq.a.a($$2, gmh::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdv.a {
      public static final MapCodec<hdo.a> a = MapCodec.unit(new hdo.a());

      @Override
      public MapCodec<hdo.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdo($$0.a(gfb.ad));
      }
   }
}
