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

public class fxv implements ajc {
   private static final Logger a = LogUtils.getLogger();
   private final ffg b;
   @Nullable
   private final fyk c;
   @Nullable
   private final fne d;
   private final Consumer<xp> e;
   private final wk f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alf, byte[]> j;
   private final boolean k;
   private final AtomicReference<fxv.a> l = new AtomicReference<>(fxv.a.a);

   public fxv(wk $$0, ffg $$1, @Nullable fyk $$2, @Nullable fne $$3, boolean $$4, @Nullable Duration $$5, Consumer<xp> $$6, @Nullable fyo $$7) {
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

   private void a(fxv.a $$0) {
      fxv.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajf $$0) {
      this.a(fxv.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajn $$7;
      try {
         SecretKey $$1 = axw.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axw.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axw.a(2, $$1);
         $$5 = axw.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajn($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.h().submit(() -> {
            xp $$4x = this.b($$3);
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

   private void a(ajn $$0, Cipher $$1, Cipher $$2) {
      this.a(fxv.a.c);
      this.f.a($$0, ww.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xp b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xp.a("disconnect.loginFailedInfo", xp.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xp.a("disconnect.loginFailedInfo", xp.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xp.a("disconnect.loginFailedInfo", xp.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xp.a("disconnect.loginFailedInfo", xp.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xp.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.al();
   }

   @Override
   public void a(aje $$0) {
      this.a(fxv.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(abx.b, new fxu(this.b, this.f, new fya($$1, this.b.u().a(this.g, this.h, this.i), fxy.a().a(), cpo.h, null, this.c, this.d, this.j, null, $$0.e())));
      this.f.a(ajo.a);
      this.f.a(abx.a);
      this.f.a(new aap(new aav(ClientBrandRetriever.getClientModName())));
      this.f.a(new aao(this.b.m.aw()));
   }

   @Override
   public void a(xp $$0) {
      xp $$1 = this.k ? xo.q : xo.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gvd(this.d, $$1, $$0));
      } else {
         this.b.a(new fmf(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajh $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajg $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajd $$0) {
      this.e.accept(xp.c("connect.negotiating"));
      this.f.a(new ajl($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acd $$0) {
      this.f.a(new acg($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xp.c("connect.connecting"), Set.of()),
      b(xp.c("connect.authorizing"), Set.of(a)),
      c(xp.c("connect.encrypting"), Set.of(b)),
      d(xp.c("connect.joining"), Set.of(c, a));

      final xp e;
      final Set<fxv.a> f;

      private a(final xp $$0, final Set<fxv.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
