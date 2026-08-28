import com.mojang.serialization.MapCodec;

public class hhg implements hgz {
   private final ghk a;

   public hhg(ghk $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fiu $$6 = gwi.a($$2, this.a.a(ghk.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hhd.a {
      public static final MapCodec<hhg.a> a = MapCodec.unit(new hhg.a());

      @Override
      public MapCodec<hhg.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hhg(new ghk($$0.a(gif.dx)));
      }
   }
}
