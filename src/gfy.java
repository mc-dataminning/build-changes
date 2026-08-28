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

public class gfy implements aiq {
   private static final Logger a = LogUtils.getLogger();
   private final flj b;
   @Nullable
   private final ggo c;
   @Nullable
   private final ful d;
   private final Consumer<wp> e;
   private final vi f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akv, byte[]> j;
   private final boolean k;
   private final AtomicReference<gfy.a> l = new AtomicReference<>(gfy.a.a);

   public gfy(vi $$0, flj $$1, @Nullable ggo $$2, @Nullable ful $$3, boolean $$4, @Nullable Duration $$5, Consumer<wp> $$6, @Nullable ggs $$7) {
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

   private void a(gfy.a $$0) {
      gfy.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ais $$0) {
      this.a(gfy.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajb $$7;
      try {
         SecretKey $$1 = axx.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axx.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axx.a(2, $$1);
         $$5 = axx.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajb($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         af.h().execute(() -> {
            wp $$4x = this.b($$3);
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

   private void a(ajb $$0, Cipher $$1, Cipher $$2) {
      this.a(gfy.a.c);
      this.f.a($$0, vw.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wp b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wp.a("disconnect.loginFailedInfo", wp.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wp.a("disconnect.loginFailedInfo", wp.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wp.a("disconnect.loginFailedInfo", wp.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wp.a("disconnect.loginFailedInfo", wp.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wp.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(aiv $$0) {
      this.a(gfy.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            aba.d,
            new gfx(this.b, this.f, new gge($$1, this.b.u().a(this.g, this.h, this.i), ggc.a().a(), crv.h, null, this.c, this.d, this.j, null, Map.of(), aln.a))
         );
      this.f.a(ajc.a);
      this.f.a(aba.b);
      this.f.a(new zr(new zx(ClientBrandRetriever.getClientModName())));
      this.f.a(new zq(this.b.n.aA()));
   }

   @Override
   public void a(vk $$0) {
      wp $$1 = this.k ? wo.q : wo.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hlb(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fts(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aiu $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ait $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(air $$0) {
      this.e.accept(wp.c("connect.negotiating"));
      this.f.a(new aiz($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abg $$0) {
      this.f.a(new abj($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(wp.c("connect.connecting"), Set.of()),
      b(wp.c("connect.authorizing"), Set.of(a)),
      c(wp.c("connect.encrypting"), Set.of(b)),
      d(wp.c("connect.joining"), Set.of(c, a));

      final wp e;
      final Set<gfy.a> f;

      private a(final wp $$0, final Set<gfy.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
