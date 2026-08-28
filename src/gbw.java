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

public class gbw implements ajc {
   private static final Logger a = LogUtils.getLogger();
   private final fja b;
   @Nullable
   private final gcl c;
   @Nullable
   private final fqs d;
   private final Consumer<xh> e;
   private final wb f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<alh, byte[]> j;
   private final boolean k;
   private final AtomicReference<gbw.a> l = new AtomicReference<>(gbw.a.a);

   public gbw(wb $$0, fja $$1, @Nullable gcl $$2, @Nullable fqs $$3, boolean $$4, @Nullable Duration $$5, Consumer<xh> $$6, @Nullable gcp $$7) {
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

   private void a(gbw.a $$0) {
      gbw.a $$1 = this.l.updateAndGet($$1x -> {
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
      this.a(gbw.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ajn $$7;
      try {
         SecretKey $$1 = ayh.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(ayh.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = ayh.a(2, $$1);
         $$5 = ayh.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ajn($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ad.h().submit(() -> {
            xh $$4x = this.b($$3);
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

   private void a(ajn $$0, Cipher $$1, Cipher $$2) {
      this.a(gbw.a.c);
      this.f.a($$0, wo.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xh b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xh.a("disconnect.loginFailedInfo", xh.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xh.a("disconnect.loginFailedInfo", xh.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xh.a("disconnect.loginFailedInfo", xh.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xh.a("disconnect.loginFailedInfo", xh.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xh.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(aje $$0) {
      this.a(gbw.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abs.d,
            new gbv(
               this.b,
               this.f,
               new gcb($$1, this.b.u().a(this.g, this.h, this.i), gbz.a().a(), crc.i, null, this.c, this.d, this.j, null, $$0.e(), Map.of(), alz.a)
            )
         );
      this.f.a(ajo.a);
      this.f.a(abs.b);
      this.f.a(new aaj(new aap(ClientBrandRetriever.getClientModName())));
      this.f.a(new aai(this.b.n.az()));
   }

   @Override
   public void a(wd $$0) {
      xh $$1 = this.k ? xg.q : xg.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hea(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fpz(this.d, $$1, $$0));
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
   public void a(ajd $$0) {
      this.e.accept(xh.c("connect.negotiating"));
      this.f.a(new ajl($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aby $$0) {
      this.f.a(new acb($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(xh.c("connect.connecting"), Set.of()),
      b(xh.c("connect.authorizing"), Set.of(a)),
      c(xh.c("connect.encrypting"), Set.of(b)),
      d(xh.c("connect.joining"), Set.of(c, a));

      final xh e;
      final Set<gbw.a> f;

      private a(final xh $$0, final Set<gbw.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
