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

public class fwq implements aij {
   private static final Logger a = LogUtils.getLogger();
   private final fdz b;
   @Nullable
   private final fxf c;
   @Nullable
   private final fly d;
   private final Consumer<wx> e;
   private final vv f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akm, byte[]> j;
   private final boolean k;
   private final AtomicReference<fwq.a> l = new AtomicReference<>(fwq.a.a);

   public fwq(vv $$0, fdz $$1, @Nullable fxf $$2, @Nullable fly $$3, boolean $$4, @Nullable Duration $$5, Consumer<wx> $$6, @Nullable fxj $$7) {
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

   private void a(fwq.a $$0) {
      fwq.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aim $$0) {
      this.a(fwq.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aiu $$7;
      try {
         SecretKey $$1 = axc.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axc.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axc.a(2, $$1);
         $$5 = axc.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aiu($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.h().submit(() -> {
            wx $$4x = this.b($$3);
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

   private void a(aiu $$0, Cipher $$1, Cipher $$2) {
      this.a(fwq.a.c);
      this.f.a($$0, we.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wx b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wx.a("disconnect.loginFailedInfo", wx.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wx.a("disconnect.loginFailedInfo", wx.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wx.a("disconnect.loginFailedInfo", wx.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wx.a("disconnect.loginFailedInfo", wx.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wx.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(ail $$0) {
      this.a(fwq.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(abf.b, new fwp(this.b, this.f, new fwv($$1, this.b.u().a(this.g, this.h, this.i), fwt.a().a(), col.h, null, this.c, this.d, this.j, null)));
      this.f.a(aiv.a);
      this.f.a(abf.a);
      this.f.a(new zx(new aad(ClientBrandRetriever.getClientModName())));
      this.f.a(new zw(this.b.m.aw()));
   }

   @Override
   public void a(wx $$0) {
      wx $$1 = this.k ? ww.q : ww.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gtu(this.d, $$1, $$0));
      } else {
         this.b.a(new fkz(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aio $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ain $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aik $$0) {
      this.e.accept(wx.c("connect.negotiating"));
      this.f.a(new ais($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abl $$0) {
      this.f.a(new abo($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wx.c("connect.connecting"), Set.of()),
      b(wx.c("connect.authorizing"), Set.of(a)),
      c(wx.c("connect.encrypting"), Set.of(b)),
      d(wx.c("connect.joining"), Set.of(c, a));

      final wx e;
      final Set<fwq.a> f;

      private a(wx $$0, Set<fwq.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
