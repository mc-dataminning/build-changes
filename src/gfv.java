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

public class gfv implements aip {
   private static final Logger a = LogUtils.getLogger();
   private final flh b;
   @Nullable
   private final ggl c;
   @Nullable
   private final fui d;
   private final Consumer<wo> e;
   private final vi f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<aku, byte[]> j;
   private final boolean k;
   private final AtomicReference<gfv.a> l = new AtomicReference<>(gfv.a.a);

   public gfv(vi $$0, flh $$1, @Nullable ggl $$2, @Nullable fui $$3, boolean $$4, @Nullable Duration $$5, Consumer<wo> $$6, @Nullable ggp $$7) {
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

   private void a(gfv.a $$0) {
      gfv.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(air $$0) {
      this.a(gfv.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aja $$7;
      try {
         SecretKey $$1 = axw.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axw.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axw.a(2, $$1);
         $$5 = axw.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aja($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         af.h().execute(() -> {
            wo $$4x = this.b($$3);
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

   private void a(aja $$0, Cipher $$1, Cipher $$2) {
      this.a(gfv.a.c);
      this.f.a($$0, vv.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wo b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wo.a("disconnect.loginFailedInfo", wo.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wo.a("disconnect.loginFailedInfo", wo.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wo.a("disconnect.loginFailedInfo", wo.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wo.a("disconnect.loginFailedInfo", wo.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wo.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.am();
   }

   @Override
   public void a(aiu $$0) {
      this.a(gfv.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            aaz.d,
            new gfu(this.b, this.f, new ggb($$1, this.b.u().a(this.g, this.h, this.i), gfz.a().a(), crt.h, null, this.c, this.d, this.j, null, Map.of(), alm.a))
         );
      this.f.a(ajb.a);
      this.f.a(aaz.b);
      this.f.a(new zq(new zw(ClientBrandRetriever.getClientModName())));
      this.f.a(new zp(this.b.n.aA()));
   }

   @Override
   public void a(vk $$0) {
      wo $$1 = this.k ? wn.q : wn.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new hkv(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new ftp(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ait $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ais $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aiq $$0) {
      this.e.accept(wo.c("connect.negotiating"));
      this.f.a(new aiy($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abf $$0) {
      this.f.a(new abi($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(wo.c("connect.connecting"), Set.of()),
      b(wo.c("connect.authorizing"), Set.of(a)),
      c(wo.c("connect.encrypting"), Set.of(b)),
      d(wo.c("connect.joining"), Set.of(c, a));

      final wo e;
      final Set<gfv.a> f;

      private a(final wo $$0, final Set<gfv.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
