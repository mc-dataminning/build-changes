import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lj implements ll {
   private static final Codec<cvl> a = Codec.withAlternative(cvl.c, cvl.a, cvl::new);
   private final lm<lj> b;
   private final cvl c;

   public static MapCodec<lj> a(lm<lj> $$0) {
      return a.xmap($$1 -> new lj($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zb<? super wo, lj> b(lm<lj> $$0) {
      return cvl.i.a($$1 -> new lj($$0, $$1), $$0x -> $$0x.c);
   }

   public lj(lm<lj> $$0, cvl $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lm<lj> a() {
      return this.b;
   }

   public cvl b() {
      return this.c;
   }
}
