import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzf {
   private static final int a = 1024;
   private final fyw b;
   private final fzc c;
   private final fyr d;
   @Nullable
   private fzb e;

   public fzf(fyw $$0, fzc $$1, fyr $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzf a(fzc $$0, UserApiService $$1) {
      fyr $$2 = new fyr(1024);
      fyw $$3 = fyw.a($$0, $$1);
      return new fzf($$3, $$0, $$2);
   }

   public void a(ffh $$0, fnf $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fzb $$4 = this.e.b();
         $$0.a(
            new flx(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xp.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xp.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xp.c("gui.abuseReport.draft.edit"),
               xp.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fyw a() {
      return this.b;
   }

   public fyr b() {
      return this.d;
   }

   public boolean a(fzc $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fzb $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
