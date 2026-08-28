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

public class gfi implements aju {
   private static final Logger a = LogUtils.getLogger();
   private final fmf b;
   @Nullable
   private final gfy c;
   @Nullable
   private final ftx d;
   private final Consumer<xv> e;
   private final wp f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alz, byte[]> j;
   private final boolean k;
   private final AtomicReference<gfi.a> l = new AtomicReference<>(gfi.a.a);

   public gfi(wp $$0, fmf $$1, @Nullable gfy $$2, @Nullable ftx $$3, boolean $$4, @Nullable Duration $$5, Consumer<xv> $$6, @Nullable ggc $$7) {
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

   private void a(gfi.a $$0) {
      gfi.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajw $$0) {
      this.a(gfi.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      akf $$7;
      try {
         SecretKey $$1 = azc.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(azc.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = azc.a(2, $$1);
         $$5 = azc.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new akf($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ae.h().execute(() -> {
            xv $$4x = this.b($$3);
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

   private void a(akf $$0, Cipher $$1, Cipher $$2) {
      this.a(gfi.a.c);
      this.f.a($$0, xc.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xv b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xv.a("disconnect.loginFailedInfo", xv.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xv.a("disconnect.loginFailedInfo", xv.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xv.a("disconnect.loginFailedInfo", xv.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xv.a("disconnect.loginFailedInfo", xv.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xv.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajz $$0) {
      this.a(gfi.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            acg.d,
            new gfh(this.b, this.f, new gfo($$1, this.b.u().a(this.g, this.h, this.i), gfm.a().a(), csu.i, null, this.c, this.d, this.j, null, Map.of(), amr.a))
         );
      this.f.a(akg.a);
      this.f.a(acg.b);
      this.f.a(new aax(new abd(ClientBrandRetriever.getClientModName())));
      this.f.a(new aaw(this.b.n.aA()));
   }

   @Override
   public void a(wr $$0) {
      xv $$1 = this.k ? xu.q : xu.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hhs(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fte(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajy $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajx $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajv $$0) {
      this.e.accept(xv.c("connect.negotiating"));
      this.f.a(new akd($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acm $$0) {
      this.f.a(new acp($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xv.c("connect.connecting"), Set.of()),
      b(xv.c("connect.authorizing"), Set.of(a)),
      c(xv.c("connect.encrypting"), Set.of(b)),
      d(xv.c("connect.joining"), Set.of(c, a));

      final xv e;
      final Set<gfi.a> f;

      private a(final xv $$0, final Set<gfi.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
