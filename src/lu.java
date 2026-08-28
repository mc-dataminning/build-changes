import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lu implements lw {
   private static final Codec<czy> a = Codec.withAlternative(czy.c, czu.e, czy::new);
   private final lx<lu> b;
   private final czy c;

   public static MapCodec<lu> a(lx<lu> $$0) {
      return a.xmap($$1 -> new lu($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yy<? super wl, lu> b(lx<lu> $$0) {
      return czy.i.a($$1 -> new lu($$0, $$1), $$0x -> $$0x.c);
   }

   public lu(lx<lu> $$0, czy $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lx<lu> a() {
      return this.b;
   }

   public czy b() {
      return this.c;
   }
}
