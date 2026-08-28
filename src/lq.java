import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lq implements lw {
   private static final Codec<ebe> a = Codec.withAlternative(ebe.a, mg.e.q(), dnc::m);
   private final lx<lq> b;
   private final ebe c;

   public static MapCodec<lq> a(lx<lq> $$0) {
      return a.xmap($$1 -> new lq($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yy<? super wl, lq> b(lx<lq> $$0) {
      return yw.a(dnc.k).a($$1 -> new lq($$0, $$1), $$0x -> $$0x.c);
   }

   public lq(lx<lq> $$0, ebe $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lx<lq> a() {
      return this.b;
   }

   public ebe b() {
      return this.c;
   }
}
