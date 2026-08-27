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

public class fvv implements aie {
   private static final Logger a = LogUtils.getLogger();
   private final fde b;
   @Nullable
   private final fwk c;
   @Nullable
   private final fld d;
   private final Consumer<wu> e;
   private final vs f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akh, byte[]> j;
   private final boolean k;
   private final AtomicReference<fvv.a> l = new AtomicReference<>(fvv.a.a);

   public fvv(vs $$0, fde $$1, @Nullable fwk $$2, @Nullable fld $$3, boolean $$4, @Nullable Duration $$5, Consumer<wu> $$6, @Nullable fwo $$7) {
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

   private void a(fvv.a $$0) {
      fvv.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aih $$0) {
      this.a(fvv.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aip $$7;
      try {
         SecretKey $$1 = awx.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(awx.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = awx.a(2, $$1);
         $$5 = awx.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aip($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            wu $$4x = this.b($$3);
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

   private void a(aip $$0, Cipher $$1, Cipher $$2) {
      this.a(fvv.a.c);
      this.f.a($$0, wb.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wu b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wu.a("disconnect.loginFailedInfo", wu.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wu.a("disconnect.loginFailedInfo", wu.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wu.a("disconnect.loginFailedInfo", wu.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wu.a("disconnect.loginFailedInfo", wu.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wu.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(aig $$0) {
      this.a(fvv.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(abb.b, new fvu(this.b, this.f, new fwa($$1, this.b.u().a(this.g, this.h, this.i), fvy.a().a(), cnw.h, null, this.c, this.d, this.j)));
      this.f.a(aiq.a);
      this.f.a(abb.a);
      this.f.a(new zu(new aaa(ClientBrandRetriever.getClientModName())));
      this.f.a(new zt(this.b.m.aw()));
   }

   @Override
   public void a(wu $$0) {
      wu $$1 = this.k ? wt.q : wt.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gsx(this.d, $$1, $$0));
      } else {
         this.b.a(new fke(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aij $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(aii $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aif $$0) {
      this.e.accept(wu.c("connect.negotiating"));
      this.f.a(new ain($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abh $$0) {
      this.f.a(new abk($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wu.c("connect.connecting"), Set.of()),
      b(wu.c("connect.authorizing"), Set.of(a)),
      c(wu.c("connect.encrypting"), Set.of(b)),
      d(wu.c("connect.joining"), Set.of(c, a));

      final wu e;
      final Set<fvv.a> f;

      private a(wu $$0, Set<fvv.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
