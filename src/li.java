import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class li implements lk {
   private static final Codec<cuq> a = Codec.withAlternative(cuq.c, cuq.a, cuq::new);
   private final ll<li> b;
   private final cuq c;

   public static MapCodec<li> a(ll<li> $$0) {
      return a.xmap($$1 -> new li($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yx<? super wk, li> b(ll<li> $$0) {
      return cuq.i.a($$1 -> new li($$0, $$1), $$0x -> $$0x.c);
   }

   public li(ll<li> $$0, cuq $$1) {
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

   public cuq b() {
      return this.c;
   }
}
