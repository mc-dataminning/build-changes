import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gli {
   Codec<gli> a = bak.a(gli.a::values).dispatch(gli::a, gli.a::a);

   gli.a a();

   public static enum a implements bak {
      a("player", () -> glj.a.b),
      b("system", () -> glj.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gli>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gli>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gli> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
