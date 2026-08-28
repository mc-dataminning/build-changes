import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lm {
   private static final Codec<cvs> a = Codec.withAlternative(cvs.c, cvs.a, cvs::new);
   private final ln<lk> b;
   private final cvs c;

   public static MapCodec<lk> a(ln<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zc<? super wp, lk> b(ln<lk> $$0) {
      return cvs.i.a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(ln<lk> $$0, cvs $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public ln<lk> a() {
      return this.b;
   }

   public cvs b() {
      return this.c;
   }
}
