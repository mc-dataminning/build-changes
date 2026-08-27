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

public class fzm implements aiq {
   private static final Logger a = LogUtils.getLogger();
   private final fgj b;
   @Nullable
   private final gab c;
   @Nullable
   private final fon d;
   private final Consumer<xe> e;
   private final wc f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akt, byte[]> j;
   private final boolean k;
   private final AtomicReference<fzm.a> l = new AtomicReference<>(fzm.a.a);

   public fzm(wc $$0, fgj $$1, @Nullable gab $$2, @Nullable fon $$3, boolean $$4, @Nullable Duration $$5, Consumer<xe> $$6, @Nullable gaf $$7) {
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

   private void a(fzm.a $$0) {
      fzm.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ait $$0) {
      this.a(fzm.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajb $$7;
      try {
         SecretKey $$1 = axk.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axk.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axk.a(2, $$1);
         $$5 = axk.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajb($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ad.g().submit(() -> {
            xe $$4x = this.b($$3);
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
      this.a(fzm.a.c);
      this.f.a($$0, wl.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xe b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xe.a("disconnect.loginFailedInfo", xe.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xe.a("disconnect.loginFailedInfo", xe.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xe.a("disconnect.loginFailedInfo", xe.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xe.a("disconnect.loginFailedInfo", xe.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xe.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(ais $$0) {
      this.a(fzm.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(abl.b, new fzl(this.b, this.f, new fzr($$1, this.b.u().a(this.g, this.h, this.i), fzp.a().a(), cor.h, null, this.c, this.d, this.j)));
      this.f.a(ajc.a);
      this.f.a(abl.a);
      this.f.a(new aae(new aak(ClientBrandRetriever.getClientModName())));
      this.f.a(new aad(this.b.m.aw()));
   }

   @Override
   public void a(xe $$0) {
      xe $$1 = this.k ? xd.q : xd.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gwx(this.d, $$1, $$0));
      } else {
         this.b.a(new fnn(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(aiv $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(aiu $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(air $$0) {
      this.e.accept(xe.c("connect.negotiating"));
      this.f.a(new aiz($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abr $$0) {
      this.f.a(new abu($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xe.c("connect.connecting"), Set.of()),
      b(xe.c("connect.authorizing"), Set.of(a)),
      c(xe.c("connect.encrypting"), Set.of(b)),
      d(xe.c("connect.joining"), Set.of(c, a));

      final xe e;
      final Set<fzm.a> f;

      private a(xe $$0, Set<fzm.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
