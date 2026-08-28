import com.mojang.serialization.MapCodec;

public class hih implements hik {
   private final gjo a;

   public hih(gjo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      fkc $$6 = gtg.b.a($$2, gqx::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hio.a {
      public static final MapCodec<hih.a> a = MapCodec.unit(new hih.a());

      @Override
      public MapCodec<hih.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hih($$0.a(gjn.al));
      }
   }
}
