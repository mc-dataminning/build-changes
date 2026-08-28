import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class la implements lh {
   private static final Codec<drx> a = Codec.withAlternative(drx.b, lp.e.q(), deu::n);
   private final li<la> b;
   private final drx c;

   public static MapCodec<la> a(li<la> $$0) {
      return a.xmap($$1 -> new la($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zj<? super ww, la> b(li<la> $$0) {
      return zh.a(deu.q).a($$1 -> new la($$0, $$1), $$0x -> $$0x.c);
   }

   public la(li<la> $$0, drx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public li<la> a() {
      return this.b;
   }

   public drx b() {
      return this.c;
   }
}
