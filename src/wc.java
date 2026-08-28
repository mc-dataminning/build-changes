import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wc<T extends wa> {
   vq a();

   zc b();

   ys<ByteBuf, zb<? super T>> c();

   @Nullable
   za d();

   public interface a<T extends wa, B extends ByteBuf> {
      wc<T> bind(Function<ByteBuf, B> var1);
   }
}
