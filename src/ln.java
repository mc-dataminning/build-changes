import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ln implements lt {
   private static final Codec<dym> a = Codec.withAlternative(dym.a, md.e.q(), dku::m);
   private final lu<ln> b;
   private final dym c;

   public static MapCodec<ln> a(lu<ln> $$0) {
      return a.xmap($$1 -> new ln($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static yt<? super wg, ln> b(lu<ln> $$0) {
      return yr.a(dku.k).a($$1 -> new ln($$0, $$1), $$0x -> $$0x.c);
   }

   public ln(lu<ln> $$0, dym $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lu<ln> a() {
      return this.b;
   }

   public dym b() {
      return this.c;
   }
}
