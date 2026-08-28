import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lt implements lv {
   private static final Codec<czd> a = Codec.withAlternative(czd.c, cyz.e, czd::new);
   private final lw<lt> b;
   private final czd c;

   public static MapCodec<lt> a(lw<lt> $$0) {
      return a.xmap($$1 -> new lt($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yw<? super wj, lt> b(lw<lt> $$0) {
      return czd.i.a($$1 -> new lt($$0, $$1), $$0x -> $$0x.c);
   }

   public lt(lw<lt> $$0, czd $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lw<lt> a() {
      return this.b;
   }

   public czd b() {
      return this.c;
   }
}
