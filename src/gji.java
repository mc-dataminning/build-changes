import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class gji {
   private static final int a = 1024;
   private final giz b;
   private final gjf c;
   private final giu d;
   @Nullable
   private gje e;

   public gji(giz $$0, gjf $$1, giu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gji a(gjf $$0, UserApiService $$1) {
      giu $$2 = new giu(1024);
      giz $$3 = giz.a($$0, $$1);
      return new gji($$3, $$0, $$2);
   }

   public void a(fnd $$0, fwf $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         gje $$4 = this.e.b();
         $$0.a(
            new fvd(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               wv.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               wv.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               wv.c("gui.abuseReport.draft.edit"),
               wv.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public giz a() {
      return this.b;
   }

   public giu b() {
      return this.d;
   }

   public boolean a(gjf $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable gje $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
