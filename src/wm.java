import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wm<T extends wk> {
   wd a();

   zm b();

   zc<ByteBuf, zl<? super T>> c();

   @Nullable
   zk d();

   public interface a<T extends wk, B extends ByteBuf> {
      wm<T> bind(Function<ByteBuf, B> var1);
   }
}
