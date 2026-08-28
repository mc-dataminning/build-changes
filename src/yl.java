import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yl {
   MapCodec<yl> c = xl.a(new yl.a[]{ym.b, yk.b, yt.b}, yl.a::a, yl::a, "source");

   Stream<ul> a(ew var1) throws CommandSyntaxException;

   yl.a<?> a();

   public static record a<T extends yl>(MapCodec<T> a, String b) implements bai {
      @Override
      public String c() {
         return this.b;
      }
   }
}
