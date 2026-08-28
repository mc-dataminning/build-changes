import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzc {
   private static final int a = 1024;
   private final fyt b;
   private final fyz c;
   private final fyo d;
   @Nullable
   private fyy e;

   public fzc(fyt $$0, fyz $$1, fyo $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzc a(fyz $$0, UserApiService $$1) {
      fyo $$2 = new fyo(1024);
      fyt $$3 = fyt.a($$0, $$1);
      return new fzc($$3, $$0, $$2);
   }

   public void a(ffe $$0, fnc $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fyy $$4 = this.e.b();
         $$0.a(
            new flu(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xo.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xo.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xo.c("gui.abuseReport.draft.edit"),
               xo.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fyt a() {
      return this.b;
   }

   public fyo b() {
      return this.d;
   }

   public boolean a(fyz $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fyy $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
