import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lb implements lh {
   private static final Codec<dsl> a = Codec.withAlternative(dsl.b, lq.e.r(), dfi::o);
   private final li<lb> b;
   private final dsl c;

   public static MapCodec<lb> a(li<lb> $$0) {
      return a.xmap($$1 -> new lb($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static ys<? super wf, lb> b(li<lb> $$0) {
      return yq.a(dfi.q).a($$1 -> new lb($$0, $$1), $$0x -> $$0x.c);
   }

   public lb(li<lb> $$0, dsl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public li<lb> a() {
      return this.b;
   }

   public dsl b() {
      return this.c;
   }
}
