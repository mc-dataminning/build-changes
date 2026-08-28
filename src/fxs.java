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

public class fxs implements ajb {
   private static final Logger a = LogUtils.getLogger();
   private final ffd b;
   @Nullable
   private final fyh c;
   @Nullable
   private final fnb d;
   private final Consumer<xo> e;
   private final wj f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ale, byte[]> j;
   private final boolean k;
   private final AtomicReference<fxs.a> l = new AtomicReference<>(fxs.a.a);

   public fxs(wj $$0, ffd $$1, @Nullable fyh $$2, @Nullable fnb $$3, boolean $$4, @Nullable Duration $$5, Consumer<xo> $$6, @Nullable fyl $$7) {
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

   private void a(fxs.a $$0) {
      fxs.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aje $$0) {
      this.a(fxs.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajm $$7;
      try {
         SecretKey $$1 = axv.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axv.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axv.a(2, $$1);
         $$5 = axv.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajm($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.h().submit(() -> {
            xo $$4x = this.b($$3);
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

   private void a(ajm $$0, Cipher $$1, Cipher $$2) {
      this.a(fxs.a.c);
      this.f.a($$0, wv.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xo b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xo.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.al();
   }

   @Override
   public void a(ajd $$0) {
      this.a(fxs.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(abw.b, new fxr(this.b, this.f, new fxx($$1, this.b.u().a(this.g, this.h, this.i), fxv.a().a(), cpl.h, null, this.c, this.d, this.j, null)));
      this.f.a(ajn.a);
      this.f.a(abw.a);
      this.f.a(new aao(new aau(ClientBrandRetriever.getClientModName())));
      this.f.a(new aan(this.b.m.aw()));
   }

   @Override
   public void a(xo $$0) {
      xo $$1 = this.k ? xn.q : xn.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gva(this.d, $$1, $$0));
      } else {
         this.b.a(new fmc(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajg $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajf $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajc $$0) {
      this.e.accept(xo.c("connect.negotiating"));
      this.f.a(new ajk($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acc $$0) {
      this.f.a(new acf($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xo.c("connect.connecting"), Set.of()),
      b(xo.c("connect.authorizing"), Set.of(a)),
      c(xo.c("connect.encrypting"), Set.of(b)),
      d(xo.c("connect.joining"), Set.of(c, a));

      final xo e;
      final Set<fxs.a> f;

      private a(final xo $$0, final Set<fxs.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
