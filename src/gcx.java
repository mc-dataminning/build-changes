import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class gcx implements ajg {
   private static final Logger a = LogUtils.getLogger();
   private final fjx b;
   @Nullable
   private final gdm c;
   @Nullable
   private final frp d;
   private final Consumer<xl> e;
   private final wf f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<all, byte[]> j;
   private final boolean k;
   private final AtomicReference<gcx.a> l = new AtomicReference<>(gcx.a.a);

   public gcx(wf $$0, fjx $$1, @Nullable gdm $$2, @Nullable frp $$3, boolean $$4, @Nullable Duration $$5, Consumer<xl> $$6, @Nullable gdq $$7) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
      this.j = $$7 != null ? new HashMap<>($$7.a()) : new HashMap<>();
      this.k = $$7 != null;
   }

   private void a(gcx.a $$0) {
      gcx.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aji $$0) {
      this.a(gcx.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajr $$7;
      try {
         SecretKey $$1 = ayl.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayl.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayl.a(2, $$1);
         $$5 = ayl.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajr($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ae.h().execute(() -> {
            xl $$4x = this.b($$3);
            if ($$4x != null) {
               if (this.c == null || !this.c.d()) {
                  this.f.a($$4x);
                  return;
               }

               a.warn($$4x.getString());
            }

            this.a($$7, $$4, $$5);
         });
      } else {
         this.a($$7, $$4, $$5);
      }
   }

   private void a(ajr $$0, Cipher $$1, Cipher $$2) {
      this.a(gcx.a.c);
      this.f.a($$0, ws.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xl b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xl.a("disconnect.loginFailedInfo", xl.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xl.a("disconnect.loginFailedInfo", xl.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xl.a("disconnect.loginFailedInfo", xl.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xl.a("disconnect.loginFailedInfo", xl.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xl.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajl $$0) {
      this.a(gcx.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abw.d,
            new gcw(this.b, this.f, new gdc($$1, this.b.u().a(this.g, this.h, this.i), gda.a().a(), crl.i, null, this.c, this.d, this.j, null, Map.of(), amd.a))
         );
      this.f.a(ajs.a);
      this.f.a(abw.b);
      this.f.a(new aan(new aat(ClientBrandRetriever.getClientModName())));
      this.f.a(new aam(this.b.n.az()));
   }

   @Override
   public void a(wh $$0) {
      xl $$1 = this.k ? xk.q : xk.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hfb(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fqw(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajk $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajj $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajh $$0) {
      this.e.accept(xl.c("connect.negotiating"));
      this.f.a(new ajp($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acc $$0) {
      this.f.a(new acf($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xl.c("connect.connecting"), Set.of()),
      b(xl.c("connect.authorizing"), Set.of(a)),
      c(xl.c("connect.encrypting"), Set.of(b)),
      d(xl.c("connect.joining"), Set.of(c, a));

      final xl e;
      final Set<gcx.a> f;

      private a(final xl $$0, final Set<gcx.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
