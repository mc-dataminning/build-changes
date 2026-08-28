import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lp implements lr {
   private static final Codec<cwn> a = Codec.withAlternative(cwn.b, cwj.e, cwn::new);
   private final ls<lp> b;
   private final cwn c;

   public static MapCodec<lp> a(ls<lp> $$0) {
      return a.xmap($$1 -> new lp($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static ym<? super vz, lp> b(ls<lp> $$0) {
      return cwn.h.a($$1 -> new lp($$0, $$1), $$0x -> $$0x.c);
   }

   public lp(ls<lp> $$0, cwn $$1) {
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

   public cwn b() {
      return this.c;
   }
}
