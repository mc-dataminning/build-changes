import com.mojang.serialization.MapCodec;

public class lu extends lp<lu> implements lo {
   private final MapCodec<lu> a = MapCodec.unit(this::e);
   private final zf<ws, lu> b = zf.a(this);

   protected lu(boolean $$0) {
      super($$0);
   }

   public lu e() {
      return this;
   }

   @Override
   public MapCodec<lu> c() {
      return this.a;
   }

   @Override
   public zf<ws, lu> d() {
      return this.b;
   }
}
