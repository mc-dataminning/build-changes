import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lp implements lv {
   private static final Codec<eah> a = Codec.withAlternative(eah.a, mf.e.q(), dmf::m);
   private final lw<lp> b;
   private final eah c;

   public static MapCodec<lp> a(lw<lp> $$0) {
      return a.xmap($$1 -> new lp($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yw<? super wj, lp> b(lw<lp> $$0) {
      return yu.a(dmf.k).a($$1 -> new lp($$0, $$1), $$0x -> $$0x.c);
   }

   public lp(lw<lp> $$0, eah $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lw<lp> a() {
      return this.b;
   }

   public eah b() {
      return this.c;
   }
}
