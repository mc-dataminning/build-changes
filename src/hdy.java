import com.mojang.serialization.MapCodec;

public class hdy implements hdr {
   private final geg a;

   public hdy(geg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      ffx $$6 = gtb.a($$2, this.a.a(geg.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdv.a {
      public static final MapCodec<hdy.a> a = MapCodec.unit(new hdy.a());

      @Override
      public MapCodec<hdy.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdy(new geg($$0.a(gfb.dl)));
      }
   }
}
