import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fzl {
   fzl a = new fzl() {
      @Override
      public CompletableFuture<Optional<cmx>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fzl a(UserApiService $$0, fgv $$1, Path $$2) {
      return (fzl)($$1.g() == fgv.a.c ? new fys($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmx>> a();

   boolean b();
}
