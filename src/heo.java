import com.mojang.serialization.MapCodec;

public class heo implements her {
   private final ggc a;

   public heo(ggc $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      fgv $$6 = gpq.a.a($$2, gnh::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hev.a {
      public static final MapCodec<heo.a> a = MapCodec.unit(new heo.a());

      @Override
      public MapCodec<heo.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new heo($$0.a(ggb.af));
      }
   }
}
