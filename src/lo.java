import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lo implements lq {
   private static final Codec<cwm> a = Codec.withAlternative(cwm.c, cwm.a, cwm::new);
   private final lr<lo> b;
   private final cwm c;

   public static MapCodec<lo> a(lr<lo> $$0) {
      return a.xmap($$1 -> new lo($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zh<? super wu, lo> b(lr<lo> $$0) {
      return cwm.i.a($$1 -> new lo($$0, $$1), $$0x -> $$0x.c);
   }

   public lo(lr<lo> $$0, cwm $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lr<lo> a() {
      return this.b;
   }

   public cwm b() {
      return this.c;
   }
}
