import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wg<T extends we> {
   vs a();

   zg b();

   yw<ByteBuf, zf<? super T>> c();

   @Nullable
   ze d();

   public interface a<T extends we, B extends ByteBuf> {
      wg<T> a(Function<ByteBuf, B> var1);

      vs a();

      zg b();

      @bav
      void a(wg.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zh<?> var1, int var2);
      }
   }
}
