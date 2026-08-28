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

public class gaw implements aiy {
   private static final Logger a = LogUtils.getLogger();
   private final fib b;
   @Nullable
   private final gbl c;
   @Nullable
   private final fpt d;
   private final Consumer<xd> e;
   private final vx f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alb, byte[]> j;
   private final boolean k;
   private final AtomicReference<gaw.a> l = new AtomicReference<>(gaw.a.a);

   public gaw(vx $$0, fib $$1, @Nullable gbl $$2, @Nullable fpt $$3, boolean $$4, @Nullable Duration $$5, Consumer<xd> $$6, @Nullable gbp $$7) {
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

   private void a(gaw.a $$0) {
      gaw.a $$1 = this.l.updateAndGet($$1x -> {
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
      this.a(gaw.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajj $$7;
      try {
         SecretKey $$1 = aya.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(aya.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = aya.a(2, $$1);
         $$5 = aya.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajj($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ad.h().submit(() -> {
            xd $$4x = this.b($$3);
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
      this.a(gaw.a.c);
      this.f.a($$0, wk.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xd b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xd.a("disconnect.loginFailedInfo", xd.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xd.a("disconnect.loginFailedInfo", xd.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xd.a("disconnect.loginFailedInfo", xd.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xd.a("disconnect.loginFailedInfo", xd.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xd.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.al();
   }

   @Override
   public void a(aja $$0) {
      this.a(gaw.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abo.d,
            new gav(
               this.b,
               this.f,
               new gbb($$1, this.b.u().a(this.g, this.h, this.i), gaz.a().a(), cqj.i, null, this.c, this.d, this.j, null, $$0.e(), Map.of(), alt.a)
            )
         );
      this.f.a(ajk.a);
      this.f.a(abo.b);
      this.f.a(new aaf(new aal(ClientBrandRetriever.getClientModName())));
      this.f.a(new aae(this.b.n.az()));
   }

   @Override
   public void a(vz $$0) {
      xd $$1 = this.k ? xc.q : xc.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hcp(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fpa(this.d, $$1, $$0));
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
      this.e.accept(xd.c("connect.negotiating"));
      this.f.a(new ajh($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abu $$0) {
      this.f.a(new abx($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xd.c("connect.connecting"), Set.of()),
      b(xd.c("connect.authorizing"), Set.of(a)),
      c(xd.c("connect.encrypting"), Set.of(b)),
      d(xd.c("connect.joining"), Set.of(c, a));

      final xd e;
      final Set<gaw.a> f;

      private a(final xd $$0, final Set<gaw.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
