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

public class gln implements ajm {
   private static final Logger a = LogUtils.getLogger();
   private final fqq b;
   @Nullable
   private final gmd c;
   @Nullable
   private final fzq d;
   private final Consumer<xg> e;
   private final vv f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alr, byte[]> j;
   private final boolean k;
   private final AtomicReference<gln.a> l = new AtomicReference<>(gln.a.a);

   public gln(vv $$0, fqq $$1, @Nullable gmd $$2, @Nullable fzq $$3, boolean $$4, @Nullable Duration $$5, Consumer<xg> $$6, @Nullable gmh $$7) {
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

   private void a(gln.a $$0) {
      gln.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajo $$0) {
      this.a(gln.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajx $$7;
      try {
         SecretKey $$1 = ayv.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayv.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayv.a(2, $$1);
         $$5 = ayv.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajx($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ag.i().execute(() -> {
            xg $$4x = this.b($$3);
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

   private void a(ajx $$0, Cipher $$1, Cipher $$2) {
      this.a(gln.a.c);
      this.f.a($$0, wl.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xg b(String $$0) {
      try {
         this.a().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xg.a("disconnect.loginFailedInfo", xg.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xg.a("disconnect.loginFailedInfo", xg.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xg.a("disconnect.loginFailedInfo", xg.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xg.a("disconnect.loginFailedInfo", xg.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xg.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService a() {
      return this.b.am();
   }

   @Override
   public void a(ajr $$0) {
      this.a(gln.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abu.d,
            new glm(this.b, this.f, new glt($$1, this.b.u().a(this.g, this.h, this.i), glr.a().a(), cvu.h, null, this.c, this.d, this.j, null, Map.of(), amj.a))
         );
      this.f.a(ajy.a);
      this.f.a(abu.b);
      this.f.a(new aal(new aar(ClientBrandRetriever.getClientModName())));
      this.f.a(new aak(this.b.n.aA()));
   }

   @Override
   public void a(vx $$0) {
      xg $$1 = this.k ? xf.q : xf.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hqz(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fyx(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajq $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajp $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajn $$0) {
      this.e.accept(xg.c("connect.negotiating"));
      this.f.a(new ajv($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aca $$0) {
      this.f.a(new acd($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xg.c("connect.connecting"), Set.of()),
      b(xg.c("connect.authorizing"), Set.of(a)),
      c(xg.c("connect.encrypting"), Set.of(b)),
      d(xg.c("connect.joining"), Set.of(c, a));

      final xg e;
      final Set<gln.a> f;

      private a(final xg $$0, final Set<gln.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
