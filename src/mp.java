import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mp implements ma {
   private final mc d;
   private final CompletableFuture<jo.a> e;

   public mp(mc $$0, CompletableFuture<jo.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ly $$0) {
      Path $$1 = this.d.a(mc.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<et> $$3 = new eu(eu.a.a, eu.a($$2)).a();
         return ma.a($$0, iq.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
