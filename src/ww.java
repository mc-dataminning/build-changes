import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface ww<T extends wu> {
   wk a();

   zw b();

   zm<ByteBuf, zv<? super T>> c();

   @Nullable
   zu d();

   public interface a<T extends wu, B extends ByteBuf> {
      ww<T> bind(Function<ByteBuf, B> var1);
   }
}
