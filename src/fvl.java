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

public class fvl implements aic {
   private static final Logger a = LogUtils.getLogger();
   private final fcu b;
   @Nullable
   private final fwa c;
   @Nullable
   private final fkt d;
   private final Consumer<ws> e;
   private final vq f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akf, byte[]> j;
   private final boolean k;
   private final AtomicReference<fvl.a> l = new AtomicReference<>(fvl.a.a);

   public fvl(vq $$0, fcu $$1, @Nullable fwa $$2, @Nullable fkt $$3, boolean $$4, @Nullable Duration $$5, Consumer<ws> $$6, @Nullable fwe $$7) {
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

   private void a(fvl.a $$0) {
      fvl.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aif $$0) {
      this.a(fvl.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ain $$7;
      try {
         SecretKey $$1 = awu.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(awu.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = awu.a(2, $$1);
         $$5 = awu.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ain($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            ws $$4x = this.b($$3);
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

   private void a(ain $$0, Cipher $$1, Cipher $$2) {
      this.a(fvl.a.c);
      this.f.a($$0, vz.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private ws b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return ws.a("disconnect.loginFailedInfo", ws.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return ws.a("disconnect.loginFailedInfo", ws.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return ws.a("disconnect.loginFailedInfo", ws.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return ws.a("disconnect.loginFailedInfo", ws.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return ws.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(aie $$0) {
      this.a(fvl.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(aaz.b, new fvk(this.b, this.f, new fvq($$1, this.b.u().a(this.g, this.h, this.i), fvo.a().a(), cna.h, null, this.c, this.d, this.j)));
      this.f.a(aio.a);
      this.f.a(aaz.a);
      this.f.a(new zs(new zy(ClientBrandRetriever.getClientModName())));
      this.f.a(new zr(this.b.m.aw()));
   }

   @Override
   public void a(ws $$0) {
      ws $$1 = this.k ? wr.q : wr.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gsm(this.d, $$1, $$0));
      } else {
         this.b.a(new fju(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aih $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(aig $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aid $$0) {
      this.e.accept(ws.c("connect.negotiating"));
      this.f.a(new ail($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abf $$0) {
      this.f.a(new abi($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(ws.c("connect.connecting"), Set.of()),
      b(ws.c("connect.authorizing"), Set.of(a)),
      c(ws.c("connect.encrypting"), Set.of(b)),
      d(ws.c("connect.joining"), Set.of(c, a));

      final ws e;
      final Set<fvl.a> f;

      private a(ws $$0, Set<fvl.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
