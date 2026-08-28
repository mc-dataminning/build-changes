import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lf implements lh {
   private static final Codec<cuk> a = Codec.withAlternative(cuk.c, cuk.a, cuk::new);
   private final li<lf> b;
   private final cuk c;

   public static MapCodec<lf> a(li<lf> $$0) {
      return a.xmap($$1 -> new lf($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zj<? super ww, lf> b(li<lf> $$0) {
      return cuk.i.a($$1 -> new lf($$0, $$1), $$0x -> $$0x.c);
   }

   public lf(li<lf> $$0, cuk $$1) {
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

   public cuk b() {
      return this.c;
   }
}
