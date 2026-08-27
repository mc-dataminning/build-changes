import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface vo<T extends vm> {
   vf a();

   yo b();

   ye<ByteBuf, yn<? super T>> c();

   @Nullable
   ym d();

   public interface a<T extends vm, B extends ByteBuf> {
      vo<T> bind(Function<ByteBuf, B> var1);
   }
}
