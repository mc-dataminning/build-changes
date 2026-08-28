import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yj {
   MapCodec<yj> c = xj.a(new yj.a[]{yk.b, yi.b, yr.b}, yj.a::a, yj::a, "source");

   Stream<uj> a(ev var1) throws CommandSyntaxException;

   yj.a<?> a();

   public static record a<T extends yj>(MapCodec<T> a, String b) implements baf {
      @Override
      public String c() {
         return this.b;
      }
   }
}
