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

public class ghy implements aiy {
   private static final Logger a = LogUtils.getLogger();
   private final fnd b;
   @Nullable
   private final gio c;
   @Nullable
   private final fwf d;
   private final Consumer<wv> e;
   private final vo f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ald, byte[]> j;
   private final boolean k;
   private final AtomicReference<ghy.a> l = new AtomicReference<>(ghy.a.a);

   public ghy(vo $$0, fnd $$1, @Nullable gio $$2, @Nullable fwf $$3, boolean $$4, @Nullable Duration $$5, Consumer<wv> $$6, @Nullable gis $$7) {
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

   private void a(ghy.a $$0) {
      ghy.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aja $$0) {
      this.a(ghy.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajj $$7;
      try {
         SecretKey $$1 = ayh.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayh.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayh.a(2, $$1);
         $$5 = ayh.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajj($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         af.i().execute(() -> {
            wv $$4x = this.b($$3);
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
      this.a(ghy.a.c);
      this.f.a($$0, wc.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wv b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wv.a("disconnect.loginFailedInfo", wv.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wv.a("disconnect.loginFailedInfo", wv.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wv.a("disconnect.loginFailedInfo", wv.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wv.a("disconnect.loginFailedInfo", wv.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wv.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(ajd $$0) {
      this.a(ghy.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abg.d,
            new ghx(this.b, this.f, new gie($$1, this.b.u().a(this.g, this.h, this.i), gic.a().a(), ctg.h, null, this.c, this.d, this.j, null, Map.of(), alv.a))
         );
      this.f.a(ajk.a);
      this.f.a(abg.b);
      this.f.a(new zx(new aad(ClientBrandRetriever.getClientModName())));
      this.f.a(new zw(this.b.n.aA()));
   }

   @Override
   public void a(vq $$0) {
      wv $$1 = this.k ? wu.q : wu.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hnb(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fvm(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajc $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajb $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aiz $$0) {
      this.e.accept(wv.c("connect.negotiating"));
      this.f.a(new ajh($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abm $$0) {
      this.f.a(new abp($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(wv.c("connect.connecting"), Set.of()),
      b(wv.c("connect.authorizing"), Set.of(a)),
      c(wv.c("connect.encrypting"), Set.of(b)),
      d(wv.c("connect.joining"), Set.of(c, a));

      final wv e;
      final Set<ghy.a> f;

      private a(final wv $$0, final Set<ghy.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
