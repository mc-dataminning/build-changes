import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyp {
   fyp a = new fyp() {
      @Override
      public CompletableFuture<Optional<cmj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyp a(UserApiService $$0, fgb $$1, Path $$2) {
      return (fyp)($$1.g() == fgb.a.c ? new fxw($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmj>> a();

   boolean b();
}
