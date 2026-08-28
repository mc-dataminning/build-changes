import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface ya {
   MapCodec<ya> c = xa.a(new ya.a[]{yb.b, xz.b, yi.b}, ya.a::a, ya::a, "source");

   Stream<tz> a(ej var1) throws CommandSyntaxException;

   ya.a<?> a();

   public static record a<T extends ya>(MapCodec<T> a, String b) implements bak {
      @Override
      public String c() {
         return this.b;
      }
   }
}
