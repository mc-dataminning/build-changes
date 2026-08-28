import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lk {
   private static final Codec<dta> a = Codec.withAlternative(dta.b, lt.e.r(), dfw::o);
   private final ll<le> b;
   private final dta c;

   public static MapCodec<le> a(ll<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yw<? super wj, le> b(ll<le> $$0) {
      return yu.a(dfw.q).a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(ll<le> $$0, dta $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ll<le> a() {
      return this.b;
   }

   public dta b() {
      return this.c;
   }
}
