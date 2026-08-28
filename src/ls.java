import com.mojang.serialization.MapCodec;

public class ls extends ln<ls> implements lm {
   private final MapCodec<ls> a = MapCodec.unit(this::e);
   private final zc<wp, ls> b = zc.a(this);

   protected ls(boolean $$0) {
      super($$0);
   }

   public ls e() {
      return this;
   }

   @Override
   public MapCodec<ls> c() {
      return this.a;
   }

   @Override
   public zc<wp, ls> d() {
      return this.b;
   }
}
