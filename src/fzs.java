import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzs {
   private static final int a = 1024;
   private final fzj b;
   private final fzp c;
   private final fze d;
   @Nullable
   private fzo e;

   public fzs(fzj $$0, fzp $$1, fze $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzs a(fzp $$0, UserApiService $$1) {
      fze $$2 = new fze(1024);
      fzj $$3 = fzj.a($$0, $$1);
      return new fzs($$3, $$0, $$2);
   }

   public void a(fft $$0, fnj $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fzo $$4 = this.e.b();
         $$0.a(
            new fmh(
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

   public fzj a() {
      return this.b;
   }

   public fze b() {
      return this.d;
   }

   public boolean a(fzp $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fzo $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
