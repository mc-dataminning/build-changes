import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lr implements lt {
   private static final Codec<cxy> a = Codec.withAlternative(cxy.c, cxu.e, cxy::new);
   private final lu<lr> b;
   private final cxy c;

   public static MapCodec<lr> a(lu<lr> $$0) {
      return a.xmap($$1 -> new lr($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static yt<? super wg, lr> b(lu<lr> $$0) {
      return cxy.i.a($$1 -> new lr($$0, $$1), $$0x -> $$0x.c);
   }

   public lr(lu<lr> $$0, cxy $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lu<lr> a() {
      return this.b;
   }

   public cxy b() {
      return this.c;
   }
}
