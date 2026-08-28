import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gcu {
   gcu a = new gcu() {
      @Override
      public CompletableFuture<Optional<cop>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gcu a(UserApiService $$0, fjv $$1, Path $$2) {
      return (gcu)($$1.g() == fjv.a.c ? new gcb($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cop>> a();

   boolean b();
}
