import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface va<T extends uy> {
   ur a();

   ya b();

   xq<ByteBuf, xz<? super T>> c();

   @Nullable
   xy d();

   public interface a<T extends uy, B extends ByteBuf> {
      va<T> bind(Function<ByteBuf, B> var1);
   }
}
