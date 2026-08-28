import com.mojang.serialization.MapCodec;

public class hjn implements hjq {
   private final gkr a;

   public hjn(gkr $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      flg $$6 = gui.b.a($$2, gry::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hju.a {
      public static final MapCodec<hjn.a> a = MapCodec.unit(new hjn.a());

      @Override
      public MapCodec<hjn.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjn($$0.a(gkq.al));
      }
   }
}
