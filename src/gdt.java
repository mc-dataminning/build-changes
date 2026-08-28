import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gdt {
   gdt a = new gdt() {
      @Override
      public CompletableFuture<Optional<cow>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gdt a(UserApiService $$0, fkr $$1, Path $$2) {
      return (gdt)($$1.g() == fkr.a.c ? new gda($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cow>> a();

   boolean b();
}
