import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gmb {
   gmb a = new gmb() {
      @Override
      public CompletableFuture<Optional<csl>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gmb a(UserApiService $$0, frc $$1, Path $$2) {
      return (gmb)($$1.g() == frc.a.c ? new glg($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<csl>> a();

   boolean b();
}
