import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface wu {
   MapCodec<wu> c = vu.a(new wu.a[]{wv.b, wt.b, xc.b}, wu.a::a, wu::a, "source");

   Stream<sy> a(du var1) throws CommandSyntaxException;

   wu.a<?> a();

   public static record a<T extends wu>(MapCodec<T> a, String b) implements axg {
      @Override
      public String c() {
         return this.b;
      }
   }
}
