import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xy {
   MapCodec<xy> c = wy.a(new xy.a[]{xz.b, xx.b, yg.b}, xy.a::a, xy::a, "source");

   Stream<tx> a(ei var1) throws CommandSyntaxException;

   xy.a<?> a();

   public static record a<T extends xy>(MapCodec<T> a, String b) implements bai {
      @Override
      public String c() {
         return this.b;
      }
   }
}
