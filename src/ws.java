import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface ws {
   MapCodec<ws> c = vs.a(new ws.a[]{wt.b, wr.b, xa.b}, ws.a::a, ws::a, "source");

   Stream<sw> a(du var1) throws CommandSyntaxException;

   ws.a<?> a();

   public static record a<T extends ws>(MapCodec<T> a, String b) implements axc {
      @Override
      public String c() {
         return this.b;
      }
   }
}
