import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wd<T extends wb> {
   vp a();

   zd b();

   yt<ByteBuf, zc<? super T>> c();

   @Nullable
   zb d();

   public interface a<T extends wb, B extends ByteBuf> {
      wd<T> a(Function<ByteBuf, B> var1);

      vp a();

      zd b();

      @bar
      void a(wd.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(ze<?> var1, int var2);
      }
   }
}
