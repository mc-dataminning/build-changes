import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface we<T extends wc> {
   vq a();

   ze b();

   yu<ByteBuf, zd<? super T>> c();

   @Nullable
   zc d();

   public interface a<T extends wc, B extends ByteBuf> {
      we<T> a(Function<ByteBuf, B> var1);

      vq a();

      ze b();

      @bat
      void a(we.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zf<?> var1, int var2);
      }
   }
}
