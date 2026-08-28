import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nb implements mm {
   private final mo d;
   private final CompletableFuture<jg.a> e;

   public nb(mo $$0, CompletableFuture<jg.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      Path $$1 = this.d.a(mo.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ei> $$3 = new ej(ej.a.a, ej.a($$2)).a();
         return mm.a($$0, ih.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
