import com.mojang.serialization.MapCodec;

public class lv extends lq<lv> implements lp {
   private final MapCodec<lv> a = MapCodec.unit(this::e);
   private final zg<wt, lv> b = zg.a(this);

   protected lv(boolean $$0) {
      super($$0);
   }

   public lv e() {
      return this;
   }

   @Override
   public MapCodec<lv> c() {
      return this.a;
   }

   @Override
   public zg<wt, lv> d() {
      return this.b;
   }
}
