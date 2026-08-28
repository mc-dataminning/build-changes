import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public interface wm<T extends wk> {
   vw a();

   zp b();

   ze<ByteBuf, zo<? super T>> c();

   @Nullable
   zm d();

   public interface a {
      vw a();

      zp b();

      @bbi
      void a(wm.a.a var1);

      @FunctionalInterface
      public interface a {
         void accept(zq<?> var1, int var2);
      }
   }

   public interface b {
      wm.a a();
   }
}
