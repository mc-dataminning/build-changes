import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gkm {
   gkm a = new gkm() {
      @Override
      public CompletableFuture<Optional<crf>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gkm a(UserApiService $$0, fpl $$1, Path $$2) {
      return (gkm)($$1.g() == fpl.a.c ? new gjr($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<crf>> a();

   boolean b();
}
