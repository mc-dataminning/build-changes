import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class geg {
   private static final int a = 1024;
   private final gdx b;
   private final ged c;
   private final gds d;
   @Nullable
   private gec e;

   public geg(gdx $$0, ged $$1, gds $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static geg a(ged $$0, UserApiService $$1) {
      gds $$2 = new gds(1024);
      gdx $$3 = gdx.a($$0, $$1);
      return new geg($$3, $$0, $$2);
   }

   public void a(fjx $$0, frp $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gec $$4 = this.e.b();
         $$0.a(
            new fqn(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               xl.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               xl.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               xl.c("gui.abuseReport.draft.edit"),
               xl.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gdx a() {
      return this.b;
   }

   public gds b() {
      return this.d;
   }

   public boolean a(ged $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gec $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
