import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yk {
   MapCodec<yk> c = xk.a(new yk.a[]{yl.b, yj.b, ys.b}, yk.a::a, yk::a, "source");

   Stream<uk> a(ew var1) throws CommandSyntaxException;

   yk.a<?> a();

   public static record a<T extends yk>(MapCodec<T> a, String b) implements bag {
      @Override
      public String c() {
         return this.b;
      }
   }
}
