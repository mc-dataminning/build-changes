import com.mojang.serialization.MapCodec;

public class hie implements hhx {
   private final gif a;

   public hie(gif $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fjn $$6 = gxf.a($$2, this.a.a(gif.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hib.a {
      public static final MapCodec<hie.a> a = MapCodec.unit(new hie.a());

      @Override
      public MapCodec<hie.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hie(new gif($$0.a(gjb.dB)));
      }
   }
}
