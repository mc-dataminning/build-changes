import com.mojang.serialization.MapCodec;

public class lq extends ll<lq> implements lk {
   private final MapCodec<lq> a = MapCodec.unit(this::e);
   private final yw<wj, lq> b = yw.a(this);

   protected lq(boolean $$0) {
      super($$0);
   }

   public lq e() {
      return this;
   }

   @Override
   public MapCodec<lq> c() {
      return this.a;
   }

   @Override
   public yw<wj, lq> d() {
      return this.b;
   }
}
