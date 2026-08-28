import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xx {
   MapCodec<xx> c = wx.a(new xx.a[]{xy.b, xw.b, yf.b}, xx.a::a, xx::a, "source");

   Stream<tw> a(ex var1) throws CommandSyntaxException;

   xx.a<?> a();

   public static record a<T extends xx>(MapCodec<T> a, String b) implements bag {
      @Override
      public String c() {
         return this.b;
      }
   }
}
