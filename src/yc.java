import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yc {
   MapCodec<yc> c = xc.a(new yc.a[]{yd.b, yb.b, yk.b}, yc.a::a, yc::a, "source");

   Stream<tz> a(ej var1) throws CommandSyntaxException;

   yc.a<?> a();

   public static record a<T extends yc>(MapCodec<T> a, String b) implements bam {
      @Override
      public String c() {
         return this.b;
      }
   }
}
