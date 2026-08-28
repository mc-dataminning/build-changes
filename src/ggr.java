import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class ggr {
   private static final int a = 1024;
   private final ggi b;
   private final ggo c;
   private final ggd d;
   @Nullable
   private ggn e;

   public ggr(ggi $$0, ggo $$1, ggd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static ggr a(ggo $$0, UserApiService $$1) {
      ggd $$2 = new ggd(1024);
      ggi $$3 = ggi.a($$0, $$1);
      return new ggr($$3, $$0, $$2);
   }

   public void a(fme $$0, ftw $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         ggn $$4 = this.e.b();
         $$0.a(
            new fsu(
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

   public ggi a() {
      return this.b;
   }

   public ggd b() {
      return this.d;
   }

   public boolean a(ggo $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable ggn $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
