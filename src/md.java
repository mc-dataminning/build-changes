import com.mojang.serialization.MapCodec;

public class md extends ly<md> implements lx {
   private final MapCodec<md> a = MapCodec.unit(this::e);
   private final za<wn, md> b = za.a(this);

   protected md(boolean $$0) {
      super($$0);
   }

   public md e() {
      return this;
   }

   @Override
   public MapCodec<md> c() {
      return this.a;
   }

   @Override
   public za<wn, md> d() {
      return this.b;
   }
}
