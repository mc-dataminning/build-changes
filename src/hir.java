import com.mojang.serialization.MapCodec;

public class hir implements hik {
   private final gir a;

   public hir(gir $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fkc $$6 = gxr.a($$2, this.a.a(gir.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hio.a {
      public static final MapCodec<hir.a> a = MapCodec.unit(new hir.a());

      @Override
      public MapCodec<hir.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hir(new gir($$0.a(gjn.dB)));
      }
   }
}
