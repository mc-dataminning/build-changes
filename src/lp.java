import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lp implements lr {
   private static final Codec<cwq> a = Codec.withAlternative(cwq.b, cwm.e, cwq::new);
   private final ls<lp> b;
   private final cwq c;

   public static MapCodec<lp> a(ls<lp> $$0) {
      return a.xmap($$1 -> new lp($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yn<? super wa, lp> b(ls<lp> $$0) {
      return cwq.h.a($$1 -> new lp($$0, $$1), $$0x -> $$0x.c);
   }

   public lp(ls<lp> $$0, cwq $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public ls<lp> a() {
      return this.b;
   }

   public cwq b() {
      return this.c;
   }
}
