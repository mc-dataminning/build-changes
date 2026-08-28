import com.mojang.serialization.MapCodec;

public class hgw implements hgz {
   private final gig a;

   public hgw(gig $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      fiu $$6 = grx.b.a($$2, gpn::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hhd.a {
      public static final MapCodec<hgw.a> a = MapCodec.unit(new hgw.a());

      @Override
      public MapCodec<hgw.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hgw($$0.a(gif.ah));
      }
   }
}
