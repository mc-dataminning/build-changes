import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ll implements lr {
   private static final Codec<dwv> a = Codec.withAlternative(dwv.a, mb.e.q(), djk::m);
   private final ls<ll> b;
   private final dwv c;

   public static MapCodec<ll> a(ls<ll> $$0) {
      return a.xmap($$1 -> new ll($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static ym<? super vz, ll> b(ls<ll> $$0) {
      return yk.a(djk.q).a($$1 -> new ll($$0, $$1), $$0x -> $$0x.c);
   }

   public ll(ls<ll> $$0, dwv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ls<ll> a() {
      return this.b;
   }

   public dwv b() {
      return this.c;
   }
}
