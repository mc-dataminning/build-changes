import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lm implements lo {
   private static final Codec<cvx> a = Codec.withAlternative(cvx.c, cvx.a, cvx::new);
   private final lp<lm> b;
   private final cvx c;

   public static MapCodec<lm> a(lp<lm> $$0) {
      return a.xmap($$1 -> new lm($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zf<? super ws, lm> b(lp<lm> $$0) {
      return cvx.i.a($$1 -> new lm($$0, $$1), $$0x -> $$0x.c);
   }

   public lm(lp<lm> $$0, cvx $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lp<lm> a() {
      return this.b;
   }

   public cvx b() {
      return this.c;
   }
}
