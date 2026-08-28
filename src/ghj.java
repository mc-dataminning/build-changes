import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ghj {
   private static final int a = 1024;
   private final gha b;
   private final ghg c;
   private final ggv d;
   @Nullable
   private ghf e;

   public ghj(gha $$0, ghg $$1, ggv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ghj a(ghg $$0, UserApiService $$1) {
      ggv $$2 = new ggv(1024);
      gha $$3 = gha.a($$0, $$1);
      return new ghj($$3, $$0, $$2);
   }

   public void a(flk $$0, fum $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ghf $$4 = this.e.b();
         $$0.a(
            new ftk(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wp.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wp.c("gui.abuseReport.draft.edit"),
               wp.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gha a() {
      return this.b;
   }

   public ggv b() {
      return this.d;
   }

   public boolean a(ghg $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ghf $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
