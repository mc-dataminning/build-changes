import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lt implements lv {
   private static final Codec<cys> a = Codec.withAlternative(cys.c, cyo.e, cys::new);
   private final lw<lt> b;
   private final cys c;

   public static MapCodec<lt> a(lw<lt> $$0) {
      return a.xmap($$1 -> new lt($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yu<? super wh, lt> b(lw<lt> $$0) {
      return cys.i.a($$1 -> new lt($$0, $$1), $$0x -> $$0x.c);
   }

   public lt(lw<lt> $$0, cys $$1) {
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

   public cys b() {
      return this.c;
   }
}
