import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ggm {
   private static final int a = 1024;
   private final ggd b;
   private final ggj c;
   private final gfy d;
   @Nullable
   private ggi e;

   public ggm(ggd $$0, ggj $$1, gfy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ggm a(ggj $$0, UserApiService $$1) {
      gfy $$2 = new gfy(1024);
      ggd $$3 = ggd.a($$0, $$1);
      return new ggm($$3, $$0, $$2);
   }

   public void a(flz $$0, ftr $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ggi $$4 = this.e.b();
         $$0.a(
            new fsp(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xv.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xv.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xv.c("gui.abuseReport.draft.edit"),
               xv.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public ggd a() {
      return this.b;
   }

   public gfy b() {
      return this.d;
   }

   public boolean a(ggj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ggi $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
