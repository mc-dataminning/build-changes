import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lv implements lx {
   private static final Codec<dak> a = Codec.withAlternative(dak.c, dag.e, dak::new);
   private final ly<lv> b;
   private final dak c;

   public static MapCodec<lv> a(ly<lv> $$0) {
      return a.xmap($$1 -> new lv($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static ze<? super wp, lv> b(ly<lv> $$0) {
      return dak.j.a($$1 -> new lv($$0, $$1), $$0x -> $$0x.c);
   }

   public lv(ly<lv> $$0, dak $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public ly<lv> a() {
      return this.b;
   }

   public dak b() {
      return this.c;
   }
}
