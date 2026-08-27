import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xr {
   static final Logger a = LogUtils.getLogger();
   @Nullable
   xs b;
   Instant c = Instant.EPOCH;

   public xr(UUID $$0, UUID $$1) {
      this.b = xs.a($$0, $$1);
   }

   public xr.c a(ays $$0) {
      return $$1 -> {
         xs $$2 = this.b;
         if ($$2 == null) {
            return null;
         } else {
            this.b = $$2.a();
            return new xj($$0.sign($$2x -> xn.a($$2x, $$2, $$1)));
         }
      };
   }

   public xr.b a(final cmb $$0) {
      final ayr $$1 = $$0.a();
      return new xr.b() {
         @Override
         public xn unpack(@Nullable xj $$0x, xq $$1x) throws xr.a {
            if ($$0 == null) {
               throw new xr.a(xr.a.a);
            } else if ($$0.b().a()) {
               throw new xr.a(xr.a.c);
            } else {
               xs $$2 = xr.this.b;
               if ($$2 == null) {
                  throw new xr.a(xr.a.b);
               } else if ($$1.b().isBefore(xr.this.c)) {
                  this.setChainBroken();
                  throw new xr.a(xr.a.e);
               } else {
                  xr.this.c = $$1.b();
                  xn $$3 = new xn($$2, $$0, $$1, null, xb.c);
                  if (!$$3.a($$1)) {
                     this.setChainBroken();
                     throw new xr.a(xr.a.d);
                  } else {
                     if ($$3.a(Instant.now())) {
                        xr.a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$1.a());
                     }

                     xr.this.b = $$2.a();
                     return $$3;
                  }
               }
            }
         }

         @Override
         public void setChainBroken() {
            xr.this.b = null;
         }
      };
   }

   public static class a extends xx {
      static final wx a = wx.c("chat.disabled.missingProfileKey");
      static final wx b = wx.c("chat.disabled.chain_broken");
      static final wx c = wx.c("chat.disabled.expiredProfileKey");
      static final wx d = wx.c("chat.disabled.invalid_signature");
      static final wx e = wx.c("chat.disabled.out_of_order_chat");

      public a(wx $$0) {
         super($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      static xr.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new xr.a(xr.a.a);
            } else {
               return xn.a($$0, $$3.a());
            }
         };
      }

      xn unpack(@Nullable xj var1, xq var2) throws xr.a;

      default void setChainBroken() {
      }
   }

   @FunctionalInterface
   public interface c {
      xr.c a = $$0 -> null;

      @Nullable
      xj pack(xq var1);
   }
}
