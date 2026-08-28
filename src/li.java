import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class li implements lk {
   private static final Codec<cuo> a = Codec.withAlternative(cuo.c, cuo.a, cuo::new);
   private final ll<li> b;
   private final cuo c;

   public static MapCodec<li> a(ll<li> $$0) {
      return a.xmap($$1 -> new li($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yw<? super wj, li> b(ll<li> $$0) {
      return cuo.i.a($$1 -> new li($$0, $$1), $$0x -> $$0x.c);
   }

   public li(ll<li> $$0, cuo $$1) {
      if ($$1.e()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public ll<li> a() {
      return this.b;
   }

   public cuo b() {
      return this.c;
   }
}
