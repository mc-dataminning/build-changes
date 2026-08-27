import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fvy {
   fvy a = new fvy() {
      @Override
      public CompletableFuture<Optional<ckn>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fvy a(UserApiService $$0, fdj $$1, Path $$2) {
      return (fvy)($$1.g() == fdj.a.c ? new fvf($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ckn>> a();

   boolean b();
}
