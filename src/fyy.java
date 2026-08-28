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

public class fyy implements ain {
   private static final Logger a = LogUtils.getLogger();
   private final fgi b;
   @Nullable
   private final fzn c;
   @Nullable
   private final fnx d;
   private final Consumer<wy> e;
   private final vs f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<akq, byte[]> j;
   private final boolean k;
   private final AtomicReference<fyy.a> l = new AtomicReference<>(fyy.a.a);

   public fyy(vs $$0, fgi $$1, @Nullable fzn $$2, @Nullable fnx $$3, boolean $$4, @Nullable Duration $$5, Consumer<wy> $$6, @Nullable fzs $$7) {
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

   private void a(fyy.a $$0) {
      fyy.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aiq $$0) {
      this.a(fyy.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aiy $$7;
      try {
         SecretKey $$1 = axk.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(axk.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = axk.a(2, $$1);
         $$5 = axk.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aiy($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ad.h().submit(() -> {
            wy $$4x = this.b($$3);
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

   private void a(aiy $$0, Cipher $$1, Cipher $$2) {
      this.a(fyy.a.c);
      this.f.a($$0, wf.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wy b(String $$0) {
      try {
         this.d().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wy.a("disconnect.loginFailedInfo", wy.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wy.a("disconnect.loginFailedInfo", wy.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wy.a("disconnect.loginFailedInfo", wy.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wy.a("disconnect.loginFailedInfo", wy.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wy.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService d() {
      return this.b.al();
   }

   @Override
   public void a(aip $$0) {
      this.a(fyy.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            abi.b,
            new fyx(
               this.b,
               this.f,
               new fzd($$1, this.b.u().a(this.g, this.h, this.i), fzb.a().a(), cpl.g, null, this.c, this.d, this.j, null, $$0.e(), Map.of(), ali.a)
            )
         );
      this.f.a(aiz.a);
      this.f.a(abi.a);
      this.f.a(new aaa(new aag(ClientBrandRetriever.getClientModName())));
      this.f.a(new zz(this.b.m.aw()));
   }

   @Override
   public void a(vu $$0) {
      wy $$1 = this.k ? wx.q : wx.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gwf(this.d, $$1, $$0.a()));
      } else {
         this.b.a(new fne(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ais $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(air $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aio $$0) {
      this.e.accept(wy.c("connect.negotiating"));
      this.f.a(new aiw($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(abo $$0) {
      this.f.a(new abr($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wy.c("connect.connecting"), Set.of()),
      b(wy.c("connect.authorizing"), Set.of(a)),
      c(wy.c("connect.encrypting"), Set.of(b)),
      d(wy.c("connect.joining"), Set.of(c, a));

      final wy e;
      final Set<fyy.a> f;

      private a(final wy $$0, final Set<fyy.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
