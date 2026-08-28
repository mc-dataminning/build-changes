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

public class fxp implements aiy {
   private static final Logger a = LogUtils.getLogger();
   private final ffa b;
   @Nullable
   private final fye c;
   @Nullable
   private final fmy d;
   private final Consumer<xl> e;
   private final wj f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alb, byte[]> j;
   private final boolean k;
   private final AtomicReference<fxp.a> l = new AtomicReference<>(fxp.a.a);

   public fxp(wj $$0, ffa $$1, @Nullable fye $$2, @Nullable fmy $$3, boolean $$4, @Nullable Duration $$5, Consumer<xl> $$6, @Nullable fyi $$7) {
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

   private void a(fxp.a $$0) {
      fxp.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajb $$0) {
      this.a(fxp.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajj $$7;
      try {
         SecretKey $$1 = axs.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axs.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axs.a(2, $$1);
         $$5 = axs.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajj($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.h().submit(() -> {
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

   private void a(ajj $$0, Cipher $$1, Cipher $$2) {
      this.a(fxp.a.c);
      this.f.a($$0, ws.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xl b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
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

   private MinecraftSessionService e() {
      return this.b.al();
   }

   @Override
   public void a(aja $$0) {
      this.a(fxp.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(abt.b, new fxo(this.b, this.f, new fxu($$1, this.b.u().a(this.g, this.h, this.i), fxs.a().a(), cpi.h, null, this.c, this.d, this.j, null)));
      this.f.a(ajk.a);
      this.f.a(abt.a);
      this.f.a(new aal(new aar(ClientBrandRetriever.getClientModName())));
      this.f.a(new aak(this.b.m.aw()));
   }

   @Override
   public void a(xl $$0) {
      xl $$1 = this.k ? xk.q : xk.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gux(this.d, $$1, $$0));
      } else {
         this.b.a(new flz(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajd $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajc $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aiz $$0) {
      this.e.accept(xl.c("connect.negotiating"));
      this.f.a(new ajh($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abz $$0) {
      this.f.a(new acc($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xl.c("connect.connecting"), Set.of()),
      b(xl.c("connect.authorizing"), Set.of(a)),
      c(xl.c("connect.encrypting"), Set.of(b)),
      d(xl.c("connect.joining"), Set.of(c, a));

      final xl e;
      final Set<fxp.a> f;

      private a(final xl $$0, final Set<fxp.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
