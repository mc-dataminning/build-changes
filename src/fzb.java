import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fzb {
   private static final int a = 1024;
   private final fys b;
   private final fyy c;
   private final fyn d;
   @Nullable
   private fyx e;

   public fzb(fys $$0, fyy $$1, fyn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fzb a(fyy $$0, UserApiService $$1) {
      fyn $$2 = new fyn(1024);
      fys $$3 = fys.a($$0, $$1);
      return new fzb($$3, $$0, $$2);
   }

   public void a(ffd $$0, fnb $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fyx $$4 = this.e.b();
         $$0.a(
            new flt(
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

   public fys a() {
      return this.b;
   }

   public fyn b() {
      return this.d;
   }

   public boolean a(fyy $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fyx $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
