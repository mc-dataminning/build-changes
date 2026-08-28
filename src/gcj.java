import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gcj {
   gcj a = new gcj() {
      @Override
      public CompletableFuture<Optional<coj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gcj a(UserApiService $$0, fjn $$1, Path $$2) {
      return (gcj)($$1.g() == fjn.a.c ? new gbq($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<coj>> a();

   boolean b();
}
