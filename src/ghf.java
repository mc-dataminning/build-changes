import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ghf {
   private static final int a = 1024;
   private final ggw b;
   private final ghc c;
   private final ggr d;
   @Nullable
   private ghb e;

   public ghf(ggw $$0, ghc $$1, ggr $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ghf a(ghc $$0, UserApiService $$1) {
      ggr $$2 = new ggr(1024);
      ggw $$3 = ggw.a($$0, $$1);
      return new ghf($$3, $$0, $$2);
   }

   public void a(flh $$0, fui $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ghb $$4 = this.e.b();
         $$0.a(
            new ftg(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wo.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wo.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wo.c("gui.abuseReport.draft.edit"),
               wo.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ggw a() {
      return this.b;
   }

   public ggr b() {
      return this.d;
   }

   public boolean a(ghc $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ghb $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
