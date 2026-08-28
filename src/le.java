import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lk {
   private static final Codec<dtc> a = Codec.withAlternative(dtc.b, lt.e.r(), dfy::o);
   private final ll<le> b;
   private final dtc c;

   public static MapCodec<le> a(ll<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yx<? super wk, le> b(ll<le> $$0) {
      return yv.a(dfy.q).a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(ll<le> $$0, dtc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ll<le> a() {
      return this.b;
   }

   public dtc b() {
      return this.c;
   }
}
