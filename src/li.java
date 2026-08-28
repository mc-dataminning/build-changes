import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class li implements lo {
   private static final Codec<dvd> a = Codec.withAlternative(dvd.a, lx.e.q(), dhy::m);
   private final lp<li> b;
   private final dvd c;

   public static MapCodec<li> a(lp<li> $$0) {
      return a.xmap($$1 -> new li($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zf<? super ws, li> b(lp<li> $$0) {
      return zd.a(dhy.q).a($$1 -> new li($$0, $$1), $$0x -> $$0x.c);
   }

   public li(lp<li> $$0, dvd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lp<li> a() {
      return this.b;
   }

   public dvd b() {
      return this.c;
   }
}
