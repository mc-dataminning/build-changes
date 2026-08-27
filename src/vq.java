import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vq<T extends vo> {
   vh a();

   yq b();

   yg<ByteBuf, yp<? super T>> c();

   @Nullable
   yo d();

   public interface a<T extends vo, B extends ByteBuf> {
      vq<T> bind(Function<ByteBuf, B> var1);
   }
}
