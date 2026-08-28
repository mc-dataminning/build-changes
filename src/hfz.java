import com.mojang.serialization.MapCodec;

public class hfz implements hfs {
   private final ggh a;

   public hfz(ggh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fhs $$6 = gvd.a($$2, this.a.a(ggh.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hfw.a {
      public static final MapCodec<hfz.a> a = MapCodec.unit(new hfz.a());

      @Override
      public MapCodec<hfz.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfz(new ggh($$0.a(ghc.dx)));
      }
   }
}
