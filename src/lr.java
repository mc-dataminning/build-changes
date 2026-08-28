import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lr implements lx {
   private static final Codec<ebg> a = Codec.withAlternative(ebg.a, mh.e.q(), dne::m);
   private final ly<lr> b;
   private final ebg c;

   public static MapCodec<lr> a(ly<lr> $$0) {
      return a.xmap($$1 -> new lr($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static za<? super wn, lr> b(ly<lr> $$0) {
      return yy.a(dne.k).a($$1 -> new lr($$0, $$1), $$0x -> $$0x.c);
   }

   public lr(ly<lr> $$0, ebg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ly<lr> a() {
      return this.b;
   }

   public ebg b() {
      return this.c;
   }
}
