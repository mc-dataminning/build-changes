import com.mojang.serialization.MapCodec;

public class ln extends li<ln> implements lh {
   private final MapCodec<ln> a = MapCodec.unit(this::e);
   private final ys<wf, ln> b = ys.a(this);

   protected ln(boolean $$0) {
      super($$0);
   }

   public ln e() {
      return this;
   }

   @Override
   public MapCodec<ln> c() {
      return this.a;
   }

   @Override
   public ys<wf, ln> d() {
      return this.b;
   }
}
