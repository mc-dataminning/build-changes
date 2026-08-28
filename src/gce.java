import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gce implements gbz, gca {
   private static final ald a = ald.b("spectator/teleport_to_team");
   private static final wv b = wv.c("spectatorMenu.team_teleport");
   private static final wv c = wv.c("spectatorMenu.team_teleport.prompt");
   private final List<gca> d;

   public gce() {
      fnd $$0 = fnd.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gca> a(fnd $$0, fdz $$1) {
      return $$1.g().stream().flatMap($$1x -> gce.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gca> a() {
      return this.d;
   }

   @Override
   public wv b() {
      return c;
   }

   @Override
   public void a(gby $$0) {
      $$0.a(this);
   }

   @Override
   public wv aO_() {
      return b;
   }

   @Override
   public void a(fpz $$0, float $$1, float $$2) {
      $$0.a(goi::H, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements gca {
      private final fdu a;
      private final Supplier<hhu> b;
      private final List<gil> c;

      private a(fdu $$0, List<gil> $$1, Supplier<hhu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gca> a(fnd $$0, fdu $$1) {
         List<gil> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gil $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dhm.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azs.a().a($$2.size())).a();
            Supplier<hhu> $$6 = $$0.an().a($$5);
            return Optional.of(new gce.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gby $$0) {
         $$0.a(new gcd(this.c));
      }

      @Override
      public wv aO_() {
         return this.a.c();
      }

      @Override
      public void a(fpz $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axu.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         frm.a($$0, this.b.get(), 2, 2, 12, axu.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
