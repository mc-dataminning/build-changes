import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lf implements lh {
   private static final Codec<cua> a = Codec.withAlternative(cua.c, cua.a, cua::new);
   private final li<lf> b;
   private final cua c;

   public static MapCodec<lf> a(li<lf> $$0) {
      return a.xmap($$1 -> new lf($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static ys<? super wf, lf> b(li<lf> $$0) {
      return cua.i.a($$1 -> new lf($$0, $$1), $$0x -> $$0x.c);
   }

   public lf(li<lf> $$0, cua $$1) {
      if ($$1.e()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public li<lf> a() {
      return this.b;
   }

   public cua b() {
      return this.c;
   }
}
