import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface wd {
   MapCodec<wd> c = vd.a(new wd.a[]{we.b, wc.b, wl.b}, wd.a::a, wd::a, "source");

   Stream<sj> a(ds var1) throws CommandSyntaxException;

   wd.a<?> a();

   public static record a<T extends wd>(MapCodec<T> a, String b) implements aut {
      @Override
      public String c() {
         return this.b;
      }
   }
}
