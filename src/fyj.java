import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyj {
   fyj a = new fyj() {
      @Override
      public CompletableFuture<Optional<cnb>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyj a(UserApiService $$0, ffv $$1, Path $$2) {
      return (fyj)($$1.g() == ffv.a.c ? new fxq($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cnb>> a();

   boolean b();
}
