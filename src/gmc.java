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

public class gmc implements ajf {
   private static final Logger a = LogUtils.getLogger();
   private final frf b;
   @Nullable
   private final gms c;
   @Nullable
   private final gaf d;
   private final Consumer<xc> e;
   private final vv f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alk, byte[]> j;
   private final boolean k;
   private final AtomicReference<gmc.a> l = new AtomicReference<>(gmc.a.a);

   public gmc(vv $$0, frf $$1, @Nullable gms $$2, @Nullable gaf $$3, boolean $$4, @Nullable Duration $$5, Consumer<xc> $$6, @Nullable gmw $$7) {
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

   private void a(gmc.a $$0) {
      gmc.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajh $$0) {
      this.a(gmc.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajq $$7;
      try {
         SecretKey $$1 = ayn.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayn.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayn.a(2, $$1);
         $$5 = ayn.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajq($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ag.i().execute(() -> {
            xc $$4x = this.b($$3);
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

   private void a(ajq $$0, Cipher $$1, Cipher $$2) {
      this.a(gmc.a.c);
      this.f.a($$0, wj.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xc b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xc.a("disconnect.loginFailedInfo", xc.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xc.a("disconnect.loginFailedInfo", xc.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xc.a("disconnect.loginFailedInfo", xc.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xc.a("disconnect.loginFailedInfo", xc.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xc.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajk $$0) {
      this.a(gmc.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abn.d,
            new gmb(this.b, this.f, new gmi($$1, this.b.u().a(this.g, this.h, this.i), gmg.a().a(), cvl.h, null, this.c, this.d, this.j, null, Map.of(), amc.a))
         );
      this.f.a(ajr.a);
      this.f.a(abn.b);
      this.f.a(new aae(new aak(ClientBrandRetriever.getClientModName())));
      this.f.a(new aad(this.b.n.aA()));
   }

   @Override
   public void a(vx $$0) {
      xc $$1 = this.k ? xb.q : xb.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hrl(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fzm(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajj $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(aji $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajg $$0) {
      this.e.accept(xc.c("connect.negotiating"));
      this.f.a(new ajo($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abt $$0) {
      this.f.a(new abw($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xc.c("connect.connecting"), Set.of()),
      b(xc.c("connect.authorizing"), Set.of(a)),
      c(xc.c("connect.encrypting"), Set.of(b)),
      d(xc.c("connect.joining"), Set.of(c, a));

      final xc e;
      final Set<gmc.a> f;

      private a(final xc $$0, final Set<gmc.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
