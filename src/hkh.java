import com.mojang.serialization.MapCodec;

public class hkh implements hka {
   private final gkh a;

   public hkh(gkh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      flr $$6 = gzg.a($$2, this.a.a(gkh.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hke.a {
      public static final MapCodec<hkh.a> a = MapCodec.unit(new hkh.a());

      @Override
      public MapCodec<hkh.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hkh(new gkh($$0.a(gld.dD)));
      }
   }
}
