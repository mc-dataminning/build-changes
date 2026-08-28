import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzm {
   private static final int a = 1024;
   private final fzd b;
   private final fzj c;
   private final fyy d;
   @Nullable
   private fzi e;

   public fzm(fzd $$0, fzj $$1, fyy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzm a(fzj $$0, UserApiService $$1) {
      fyy $$2 = new fyy(1024);
      fzd $$3 = fzd.a($$0, $$1);
      return new fzm($$3, $$0, $$2);
   }

   public void a(ffn $$0, fnd $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fzi $$4 = this.e.b();
         $$0.a(
            new fmb(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wu.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wu.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wu.c("gui.abuseReport.draft.edit"),
               wu.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fzd a() {
      return this.b;
   }

   public fyy b() {
      return this.d;
   }

   public boolean a(fzj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fzi $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
