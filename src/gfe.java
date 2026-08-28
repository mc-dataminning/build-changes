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

public class gfe implements ajk {
   private static final Logger a = LogUtils.getLogger();
   private final flz b;
   @Nullable
   private final gfu c;
   @Nullable
   private final ftr d;
   private final Consumer<xk> e;
   private final we f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alp, byte[]> j;
   private final boolean k;
   private final AtomicReference<gfe.a> l = new AtomicReference<>(gfe.a.a);

   public gfe(we $$0, flz $$1, @Nullable gfu $$2, @Nullable ftr $$3, boolean $$4, @Nullable Duration $$5, Consumer<xk> $$6, @Nullable gfy $$7) {
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

   private void a(gfe.a $$0) {
      gfe.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajm $$0) {
      this.a(gfe.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajv $$7;
      try {
         SecretKey $$1 = ays.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ays.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ays.a(2, $$1);
         $$5 = ays.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajv($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ae.h().execute(() -> {
            xk $$4x = this.b($$3);
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

   private void a(ajv $$0, Cipher $$1, Cipher $$2) {
      this.a(gfe.a.c);
      this.f.a($$0, wr.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xk b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xk.a("disconnect.loginFailedInfo", xk.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xk.a("disconnect.loginFailedInfo", xk.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xk.a("disconnect.loginFailedInfo", xk.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xk.a("disconnect.loginFailedInfo", xk.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xk.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajp $$0) {
      this.a(gfe.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abv.d,
            new gfd(this.b, this.f, new gfk($$1, this.b.u().a(this.g, this.h, this.i), gfi.a().a(), csm.h, null, this.c, this.d, this.j, null, Map.of(), amh.a))
         );
      this.f.a(ajw.a);
      this.f.a(abv.b);
      this.f.a(new aam(new aas(ClientBrandRetriever.getClientModName())));
      this.f.a(new aal(this.b.n.aA()));
   }

   @Override
   public void a(wg $$0) {
      xk $$1 = this.k ? xj.q : xj.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hhp(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fsy(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajo $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajn $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajl $$0) {
      this.e.accept(xk.c("connect.negotiating"));
      this.f.a(new ajt($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acb $$0) {
      this.f.a(new ace($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xk.c("connect.connecting"), Set.of()),
      b(xk.c("connect.authorizing"), Set.of(a)),
      c(xk.c("connect.encrypting"), Set.of(b)),
      d(xk.c("connect.joining"), Set.of(c, a));

      final xk e;
      final Set<gfe.a> f;

      private a(final xk $$0, final Set<gfe.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
