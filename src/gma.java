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

public class gma implements ajd {
   private static final Logger a = LogUtils.getLogger();
   private final frd b;
   @Nullable
   private final gmq c;
   @Nullable
   private final gad d;
   private final Consumer<xa> e;
   private final vt f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ali, byte[]> j;
   private final boolean k;
   private final AtomicReference<gma.a> l = new AtomicReference<>(gma.a.a);

   public gma(vt $$0, frd $$1, @Nullable gmq $$2, @Nullable gad $$3, boolean $$4, @Nullable Duration $$5, Consumer<xa> $$6, @Nullable gmu $$7) {
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

   private void a(gma.a $$0) {
      gma.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ajf $$0) {
      this.a(gma.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajo $$7;
      try {
         SecretKey $$1 = ayl.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayl.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayl.a(2, $$1);
         $$5 = ayl.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajo($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ag.i().execute(() -> {
            xa $$4x = this.b($$3);
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

   private void a(ajo $$0, Cipher $$1, Cipher $$2) {
      this.a(gma.a.c);
      this.f.a($$0, wh.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xa b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xa.a("disconnect.loginFailedInfo", xa.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xa.a("disconnect.loginFailedInfo", xa.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xa.a("disconnect.loginFailedInfo", xa.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xa.a("disconnect.loginFailedInfo", xa.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xa.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(aji $$0) {
      this.a(gma.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abl.d,
            new glz(this.b, this.f, new gmg($$1, this.b.u().a(this.g, this.h, this.i), gme.a().a(), cvj.h, null, this.c, this.d, this.j, null, Map.of(), ama.a))
         );
      this.f.a(ajp.a);
      this.f.a(abl.b);
      this.f.a(new aac(new aai(ClientBrandRetriever.getClientModName())));
      this.f.a(new aab(this.b.n.aA()));
   }

   @Override
   public void a(vv $$0) {
      xa $$1 = this.k ? wz.q : wz.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hrj(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fzk(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ajh $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ajg $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aje $$0) {
      this.e.accept(xa.c("connect.negotiating"));
      this.f.a(new ajm($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abr $$0) {
      this.f.a(new abu($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xa.c("connect.connecting"), Set.of()),
      b(xa.c("connect.authorizing"), Set.of(a)),
      c(xa.c("connect.encrypting"), Set.of(b)),
      d(xa.c("connect.joining"), Set.of(c, a));

      final xa e;
      final Set<gma.a> f;

      private a(final xa $$0, final Set<gma.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
