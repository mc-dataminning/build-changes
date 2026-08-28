import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyx {
   fyx a = new fyx() {
      @Override
      public CompletableFuture<Optional<cmn>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyx a(UserApiService $$0, fgj $$1, Path $$2) {
      return (fyx)($$1.g() == fgj.a.c ? new fye($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmn>> a();

   boolean b();
}
