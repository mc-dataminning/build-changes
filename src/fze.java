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

public class fze implements aio {
   private static final Logger a = LogUtils.getLogger();
   private final fgo b;
   @Nullable
   private final fzt c;
   @Nullable
   private final fod d;
   private final Consumer<wz> e;
   private final vt f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akr, byte[]> j;
   private final boolean k;
   private final AtomicReference<fze.a> l = new AtomicReference<>(fze.a.a);

   public fze(vt $$0, fgo $$1, @Nullable fzt $$2, @Nullable fod $$3, boolean $$4, @Nullable Duration $$5, Consumer<wz> $$6, @Nullable fzy $$7) {
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

   private void a(fze.a $$0) {
      fze.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(air $$0) {
      this.a(fze.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aiz $$7;
      try {
         SecretKey $$1 = axl.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axl.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axl.a(2, $$1);
         $$5 = axl.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aiz($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ad.h().submit(() -> {
            wz $$4x = this.b($$3);
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

   private void a(aiz $$0, Cipher $$1, Cipher $$2) {
      this.a(fze.a.c);
      this.f.a($$0, wg.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wz b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wz.a("disconnect.loginFailedInfo", wz.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wz.a("disconnect.loginFailedInfo", wz.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wz.a("disconnect.loginFailedInfo", wz.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wz.a("disconnect.loginFailedInfo", wz.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wz.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.al();
   }

   @Override
   public void a(aiq $$0) {
      this.a(fze.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abj.d,
            new fzd(
               this.b,
               this.f,
               new fzj($$1, this.b.u().a(this.g, this.h, this.i), fzh.a().a(), cpn.g, null, this.c, this.d, this.j, null, $$0.e(), Map.of(), alj.a)
            )
         );
      this.f.a(aja.a);
      this.f.a(abj.b);
      this.f.a(new aab(new aah(ClientBrandRetriever.getClientModName())));
      this.f.a(new aaa(this.b.m.ax()));
   }

   @Override
   public void a(vv $$0) {
      wz $$1 = this.k ? wy.q : wy.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gwm(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fnk(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ait $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ais $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aip $$0) {
      this.e.accept(wz.c("connect.negotiating"));
      this.f.a(new aix($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abp $$0) {
      this.f.a(new abs($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wz.c("connect.connecting"), Set.of()),
      b(wz.c("connect.authorizing"), Set.of(a)),
      c(wz.c("connect.encrypting"), Set.of(b)),
      d(wz.c("connect.joining"), Set.of(c, a));

      final wz e;
      final Set<fze.a> f;

      private a(final wz $$0, final Set<fze.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
