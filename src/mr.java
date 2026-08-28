import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mr implements mc {
   private final me d;
   private final CompletableFuture<jq.a> e;

   public mr(me $$0, CompletableFuture<jq.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      Path $$1 = this.d.a(me.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<eu> $$3 = new ev(ev.a.a, ev.a($$2)).a();
         return mc.a($$0, is.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
