import com.mojang.serialization.MapCodec;

public class hfp implements hfs {
   private final ghd a;

   public hfp(ghd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      fhs $$6 = gqs.a.a($$2, goi::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hfw.a {
      public static final MapCodec<hfp.a> a = MapCodec.unit(new hfp.a());

      @Override
      public MapCodec<hfp.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfp($$0.a(ghc.ah));
      }
   }
}
