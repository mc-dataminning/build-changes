import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface un {
   MapCodec<un> c = tn.a(new un.a[]{uo.b, um.b, uv.b}, un.a::a, un::a);

   Stream<qw> a(dt var1) throws CommandSyntaxException;

   un.a<?> a();

   public static record a<T extends un>(MapCodec<T> a, String b) implements asu {
      @Override
      public String c() {
         return this.b;
      }
   }
}
