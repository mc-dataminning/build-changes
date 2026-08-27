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

public class fup implements ahs {
   private static final Logger a = LogUtils.getLogger();
   private final fby b;
   @Nullable
   private final fve c;
   @Nullable
   private final fjx d;
   private final Consumer<wi> e;
   private final vg f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ajv, byte[]> j;
   private final boolean k;
   private final AtomicReference<fup.a> l = new AtomicReference<>(fup.a.a);

   public fup(vg $$0, fby $$1, @Nullable fve $$2, @Nullable fjx $$3, boolean $$4, @Nullable Duration $$5, Consumer<wi> $$6, @Nullable fvi $$7) {
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

   private void a(fup.a $$0) {
      fup.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ahv $$0) {
      this.a(fup.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aid $$7;
      try {
         SecretKey $$1 = awk.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(awk.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = awk.a(2, $$1);
         $$5 = awk.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aid($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            wi $$4x = this.b($$3);
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

   private void a(aid $$0, Cipher $$1, Cipher $$2) {
      this.a(fup.a.c);
      this.f.a($$0, vp.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wi b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wi.a("disconnect.loginFailedInfo", wi.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wi.a("disconnect.loginFailedInfo", wi.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wi.a("disconnect.loginFailedInfo", wi.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wi.a("disconnect.loginFailedInfo", wi.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wi.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(ahu $$0) {
      this.a(fup.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(aap.b, new fuo(this.b, this.f, new fuu($$1, this.b.u().a(this.g, this.h, this.i), fus.a().a(), cmp.h, null, this.c, this.d, this.j)));
      this.f.a(aie.a);
      this.f.a(aap.a);
      this.f.a(new zi(new zo(ClientBrandRetriever.getClientModName())));
      this.f.a(new zh(this.b.m.aw()));
   }

   @Override
   public void a(wi $$0) {
      wi $$1 = this.k ? wh.q : wh.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new grq(this.d, $$1, $$0));
      } else {
         this.b.a(new fiy(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ahx $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ahw $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aht $$0) {
      this.e.accept(wi.c("connect.negotiating"));
      this.f.a(new aib($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aav $$0) {
      this.f.a(new aay($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wi.c("connect.connecting"), Set.of()),
      b(wi.c("connect.authorizing"), Set.of(a)),
      c(wi.c("connect.encrypting"), Set.of(b)),
      d(wi.c("connect.joining"), Set.of(c, a));

      final wi e;
      final Set<fup.a> f;

      private a(wi $$0, Set<fup.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
