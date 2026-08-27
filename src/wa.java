import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wa {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private wb b;
   private Instant c = Instant.EPOCH;

   public wa(UUID $$0, UUID $$1) {
      this.b = wb.a($$0, $$1);
   }

   public wa.c a(ave $$0) {
      return $$1 -> {
         wb $$2 = this.a();
         return $$2 == null ? null : new vs($$0.sign($$2x -> vw.a($$2x, $$2, $$1)));
      };
   }

   public wa.b a(cft $$0) {
      avd $$1 = $$0.a();
      return ($$2, $$3) -> {
         wb $$4 = this.a();
         if ($$4 == null) {
            throw new wa.a(vg.c("chat.disabled.chain_broken"), false);
         } else if ($$0.b().a()) {
            throw new wa.a(vg.c("chat.disabled.expiredProfileKey"), false);
         } else if ($$3.b().isBefore(this.c)) {
            throw new wa.a(vg.c("multiplayer.disconnect.out_of_order_chat"), true);
         } else {
            this.c = $$3.b();
            vw $$5 = new vw($$4, $$2, $$3, null, vk.c);
            if (!$$5.a($$1)) {
               throw new wa.a(vg.c("multiplayer.disconnect.unsigned_chat"), true);
            } else {
               if ($$5.a(Instant.now())) {
                  a.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", $$3.a());
               }

               return $$5;
            }
         }
      };
   }

   @Nullable
   private wb a() {
      wb $$0 = this.b;
      if ($$0 != null) {
         this.b = $$0.a();
      }

      return $$0;
   }

   public static class a extends wg {
      private final boolean a;

      public a(vg $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      public boolean a() {
         return this.a;
      }
   }

   @FunctionalInterface
   public interface b {
      static wa.b unsigned(UUID $$0, BooleanSupplier $$1) {
         return ($$2, $$3) -> {
            if ($$1.getAsBoolean()) {
               throw new wa.a(vg.c("chat.disabled.missingProfileKey"), false);
            } else {
               return vw.a($$0, $$3.a());
            }
         };
      }

      vw unpack(@Nullable vs var1, vz var2) throws wa.a;
   }

   @FunctionalInterface
   public interface c {
      wa.c a = $$0 -> null;

      @Nullable
      vs pack(vz var1);
   }
}
