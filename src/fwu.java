import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public final class fwu {
   private static final int a = 1024;
   private final fwl b;
   private final fwr c;
   private final fwg d;
   @Nullable
   private fwq e;

   public fwu(fwl $$0, fwr $$1, fwg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static fwu a(fwr $$0, UserApiService $$1) {
      fwg $$2 = new fwg(1024);
      fwl $$3 = fwl.a($$0, $$1);
      return new fwu($$3, $$0, $$2);
   }

   public void a(fcu $$0, fkt $$1, Runnable $$2, boolean $$3) {
      if (this.e != null) {
         fwq $$4 = this.e.b();
         $$0.a(
            new fjl(
               $$4x -> {
                  this.a(null);
                  if ($$4x) {
                     $$0.a($$4.a($$1, this));
                  } else {
                     $$2.run();
                  }
               },
               ws.c($$3 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title"),
               ws.c($$3 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content"),
               ws.c("gui.abuseReport.draft.edit"),
               ws.c("gui.abuseReport.draft.discard")
            )
         );
      } else {
         $$2.run();
      }
   }

   public fwl a() {
      return this.b;
   }

   public fwg b() {
      return this.d;
   }

   public boolean a(fwr $$0) {
      return Objects.equals(this.c, $$0);
   }

   public void a(@Nullable fwq $$0) {
      this.e = $$0;
   }

   public boolean c() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.c() && this.e.a($$0);
   }
}
