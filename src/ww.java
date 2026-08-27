import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface ww {
   MapCodec<ww> c = vw.a(new ww.a[]{wx.b, wv.b, xe.b}, ww.a::a, ww::a, "source");

   Stream<ta> a(du var1) throws CommandSyntaxException;

   ww.a<?> a();

   public static record a<T extends ww>(MapCodec<T> a, String b) implements axq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
