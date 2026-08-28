import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lb implements lh {
   private static final Codec<dsk> a = Codec.withAlternative(dsk.b, lq.e.r(), dfh::o);
   private final li<lb> b;
   private final dsk c;

   public static MapCodec<lb> a(li<lb> $$0) {
      return a.xmap($$1 -> new lb($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static ys<? super wf, lb> b(li<lb> $$0) {
      return yq.a(dfh.q).a($$1 -> new lb($$0, $$1), $$0x -> $$0x.c);
   }

   public lb(li<lb> $$0, dsk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public li<lb> a() {
      return this.b;
   }

   public dsk b() {
      return this.c;
   }
}
