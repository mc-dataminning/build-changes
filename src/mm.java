import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mm implements lx {
   private final lz d;
   private final CompletableFuture<jl.a> e;

   public mm(lz $$0, CompletableFuture<jl.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lv $$0) {
      Path $$1 = this.d.a(lz.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<eq> $$3 = new er(er.a.a, er.a($$2)).a();
         return lx.a($$0, in.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
