import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wi<T extends wg> {
   vu a();

   zi b();

   yy<ByteBuf, zh<? super T>> c();

   @Nullable
   zg d();

   public interface a<T extends wg, B extends ByteBuf> {
      wi<T> a(Function<ByteBuf, B> var1);

      vu a();

      zi b();

      @bax
      void a(wi.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zj<?> var1, int var2);
      }
   }
}
