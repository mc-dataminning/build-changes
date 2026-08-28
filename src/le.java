import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lg {
   private static final Codec<cuo> a = Codec.withAlternative(cuo.c, cuo.a, cuo::new);
   private final lh<le> b;
   private final cuo c;

   public static MapCodec<le> a(lh<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zm<? super wz, le> b(lh<le> $$0) {
      return cuo.i.a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(lh<le> $$0, cuo $$1) {
      if ($$1.e()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lh<le> a() {
      return this.b;
   }

   public cuo b() {
      return this.c;
   }
}
