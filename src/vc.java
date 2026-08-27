import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vc<T extends va> {
   ut a();

   yc b();

   xs<ByteBuf, yb<? super T>> c();

   @Nullable
   ya d();

   public interface a<T extends va, B extends ByteBuf> {
      vc<T> bind(Function<ByteBuf, B> var1);
   }
}
