import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xw {
   MapCodec<xw> c = ww.a(new xw.a[]{xx.b, xv.b, ye.b}, xw.a::a, xw::a, "source");

   Stream<ua> a(ed var1) throws CommandSyntaxException;

   xw.a<?> a();

   public static record a<T extends xw>(MapCodec<T> a, String b) implements ayt {
      @Override
      public String c() {
         return this.b;
      }
   }
}
