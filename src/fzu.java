import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzu {
   private static final int a = 1024;
   private final fzl b;
   private final fzr c;
   private final fzg d;
   @Nullable
   private fzq e;

   public fzu(fzl $$0, fzr $$1, fzg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzu a(fzr $$0, UserApiService $$1) {
      fzg $$2 = new fzg(1024);
      fzl $$3 = fzl.a($$0, $$1);
      return new fzu($$3, $$0, $$2);
   }

   public void a(ffw $$0, fnl $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fzq $$4 = this.e.b();
         $$0.a(
            new fmj(
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

   public fzl a() {
      return this.b;
   }

   public fzg b() {
      return this.d;
   }

   public boolean a(fzr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fzq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
