import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yi {
   MapCodec<yi> c = xi.a(new yi.a[]{yj.b, yh.b, yq.b}, yi.a::a, yi::a, "source");

   Stream<ua> a(ek var1) throws CommandSyntaxException;

   yi.a<?> a();

   public static record a<T extends yi>(MapCodec<T> a, String b) implements bax {
      @Override
      public String c() {
         return this.b;
      }
   }
}
