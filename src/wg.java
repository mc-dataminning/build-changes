import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wg<T extends we> {
   vt a();

   zg b();

   yw<ByteBuf, zf<? super T>> c();

   @Nullable
   ze d();

   public interface a<T extends we, B extends ByteBuf> {
      wg<T> bind(Function<ByteBuf, B> var1);
   }
}
