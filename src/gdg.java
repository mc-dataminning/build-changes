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

public class gdg implements aje {
   private static final Logger a = LogUtils.getLogger();
   private final fke b;
   @Nullable
   private final gdv c;
   @Nullable
   private final frw d;
   private final Consumer<xj> e;
   private final wd f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alj, byte[]> j;
   private final boolean k;
   private final AtomicReference<gdg.a> l = new AtomicReference<>(gdg.a.a);

   public gdg(wd $$0, fke $$1, @Nullable gdv $$2, @Nullable frw $$3, boolean $$4, @Nullable Duration $$5, Consumer<xj> $$6, @Nullable gdz $$7) {
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

   private void a(gdg.a $$0) {
      gdg.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajg $$0) {
      this.a(gdg.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajp $$7;
      try {
         SecretKey $$1 = ayk.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayk.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayk.a(2, $$1);
         $$5 = ayk.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajp($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ae.h().execute(() -> {
            xj $$4x = this.b($$3);
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

   private void a(ajp $$0, Cipher $$1, Cipher $$2) {
      this.a(gdg.a.c);
      this.f.a($$0, wq.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xj b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xj.a("disconnect.loginFailedInfo", xj.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xj.a("disconnect.loginFailedInfo", xj.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xj.a("disconnect.loginFailedInfo", xj.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xj.a("disconnect.loginFailedInfo", xj.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xj.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajj $$0) {
      this.a(gdg.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abu.d,
            new gdf(this.b, this.f, new gdl($$1, this.b.u().a(this.g, this.h, this.i), gdj.a().a(), crs.h, null, this.c, this.d, this.j, null, Map.of(), amb.a))
         );
      this.f.a(ajq.a);
      this.f.a(abu.b);
      this.f.a(new aal(new aar(ClientBrandRetriever.getClientModName())));
      this.f.a(new aak(this.b.n.az()));
   }

   @Override
   public void a(wf $$0) {
      xj $$1 = this.k ? xi.q : xi.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hfm(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new frd(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aji $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajh $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ajf $$0) {
      this.e.accept(xj.c("connect.negotiating"));
      this.f.a(new ajn($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aca $$0) {
      this.f.a(new acd($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xj.c("connect.connecting"), Set.of()),
      b(xj.c("connect.authorizing"), Set.of(a)),
      c(xj.c("connect.encrypting"), Set.of(b)),
      d(xj.c("connect.joining"), Set.of(c, a));

      final xj e;
      final Set<gdg.a> f;

      private a(final xj $$0, final Set<gdg.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
