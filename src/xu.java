import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xu {
   MapCodec<xu> c = wu.a(new xu.a[]{xv.b, xt.b, yc.b}, xu.a::a, xu::a, "source");

   Stream<ty> a(ec var1) throws CommandSyntaxException;

   xu.a<?> a();

   public static record a<T extends xu>(MapCodec<T> a, String b) implements ayq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
