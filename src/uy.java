import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface uy<T extends uw> {
   up a();

   xy b();

   xo<ByteBuf, xx<? super T>> c();

   @Nullable
   xw d();

   public interface a<T extends uw, B extends ByteBuf> {
      uy<T> bind(Function<ByteBuf, B> var1);
   }
}
