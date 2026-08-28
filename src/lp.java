import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lp implements lv {
   private static final Codec<dzo> a = Codec.withAlternative(dzo.a, mf.e.q(), dlu::m);
   private final lw<lp> b;
   private final dzo c;

   public static MapCodec<lp> a(lw<lp> $$0) {
      return a.xmap($$1 -> new lp($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yu<? super wh, lp> b(lw<lp> $$0) {
      return ys.a(dlu.k).a($$1 -> new lp($$0, $$1), $$0x -> $$0x.c);
   }

   public lp(lw<lp> $$0, dzo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lw<lp> a() {
      return this.b;
   }

   public dzo b() {
      return this.c;
   }
}
