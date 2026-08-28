import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lq implements lw {
   private static final Codec<eat> a = Codec.withAlternative(eat.a, mg.e.q(), dmr::m);
   private final lx<lq> b;
   private final eat c;

   public static MapCodec<lq> a(lx<lq> $$0) {
      return a.xmap($$1 -> new lq($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yw<? super wj, lq> b(lx<lq> $$0) {
      return yu.a(dmr.k).a($$1 -> new lq($$0, $$1), $$0x -> $$0x.c);
   }

   public lq(lx<lq> $$0, eat $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lx<lq> a() {
      return this.b;
   }

   public eat b() {
      return this.c;
   }
}
