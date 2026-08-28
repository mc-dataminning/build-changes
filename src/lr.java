import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lr implements lx {
   private static final Codec<ebq> a = Codec.withAlternative(ebq.a, mh.e.q(), dno::m);
   private final ly<lr> b;
   private final ebq c;

   public static MapCodec<lr> a(ly<lr> $$0) {
      return a.xmap($$1 -> new lr($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static ze<? super wp, lr> b(ly<lr> $$0) {
      return zc.a(dno.k).a($$1 -> new lr($$0, $$1), $$0x -> $$0x.c);
   }

   public lr(ly<lr> $$0, ebq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ly<lr> a() {
      return this.b;
   }

   public ebq b() {
      return this.c;
   }
}
