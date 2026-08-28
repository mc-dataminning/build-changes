import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gkm {
   private static final int a = 1024;
   private final gkd b;
   private final gkj c;
   private final gjy d;
   @Nullable
   private gki e;

   public gkm(gkd $$0, gkj $$1, gjy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gkm a(gkj $$0, UserApiService $$1) {
      gjy $$2 = new gjy(1024);
      gkd $$3 = gkd.a($$0, $$1);
      return new gkm($$3, $$0, $$2);
   }

   public void a(fof $$0, fxi $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gki $$4 = this.e.b();
         $$0.a(
            new fwg(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               ww.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               ww.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               ww.c("gui.abuseReport.draft.edit"),
               ww.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public gkd a() {
      return this.b;
   }

   public gjy b() {
      return this.d;
   }

   public boolean a(gkj $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gki $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
