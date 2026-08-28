import com.mojang.serialization.MapCodec;

public class hjx implements hjq {
   private final gju a;

   public hjx(gju $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      flg $$6 = gyt.a($$2, this.a.a(gju.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hju.a {
      public static final MapCodec<hjx.a> a = MapCodec.unit(new hjx.a());

      @Override
      public MapCodec<hjx.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjx(new gju($$0.a(gkq.dD)));
      }
   }
}
