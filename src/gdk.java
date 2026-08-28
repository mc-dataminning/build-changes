import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gdk {
   gdk a = new gdk() {
      @Override
      public CompletableFuture<Optional<cot>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gdk a(UserApiService $$0, fkk $$1, Path $$2) {
      return (gdk)($$1.g() == fkk.a.c ? new gcr($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cot>> a();

   boolean b();
}
