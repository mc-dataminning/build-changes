import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ll implements lr {
   private static final Codec<dwy> a = Codec.withAlternative(dwy.a, mb.e.q(), djn::m);
   private final ls<ll> b;
   private final dwy c;

   public static MapCodec<ll> a(ls<ll> $$0) {
      return a.xmap($$1 -> new ll($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yn<? super wa, ll> b(ls<ll> $$0) {
      return yl.a(djn.q).a($$1 -> new ll($$0, $$1), $$0x -> $$0x.c);
   }

   public ll(ls<ll> $$0, dwy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ls<ll> a() {
      return this.b;
   }

   public dwy b() {
      return this.c;
   }
}
