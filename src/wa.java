import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface wa<T extends vy> {
   vr a();

   za b();

   yq<ByteBuf, yz<? super T>> c();

   @Nullable
   yy d();

   public interface a<T extends vy, B extends ByteBuf> {
      wa<T> bind(Function<ByteBuf, B> var1);
   }
}
