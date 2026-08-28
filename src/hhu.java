import com.mojang.serialization.MapCodec;

public class hhu implements hhx {
   private final gjc a;

   public hhu(gjc $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      fjn $$6 = gsu.b.a($$2, gqk::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hib.a {
      public static final MapCodec<hhu.a> a = MapCodec.unit(new hhu.a());

      @Override
      public MapCodec<hhu.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhu($$0.a(gjb.al));
      }
   }
}
