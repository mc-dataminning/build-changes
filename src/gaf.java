import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gaf implements gaa, gab {
   private static final aku a = aku.b("spectator/teleport_to_team");
   private static final wo b = wo.c("spectatorMenu.team_teleport");
   private static final wo c = wo.c("spectatorMenu.team_teleport.prompt");
   private final List<gab> d;

   public gaf() {
      flh $$0 = flh.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gab> a(flh $$0, fcd $$1) {
      return $$1.g().stream().flatMap($$1x -> gaf.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gab> a() {
      return this.d;
   }

   @Override
   public wo b() {
      return c;
   }

   @Override
   public void a(fzz $$0) {
      $$0.a(this);
   }

   @Override
   public wo aS_() {
      return b;
   }

   @Override
   public void a(fob $$0, float $$1, float $$2) {
      $$0.a(gmf::H, a, 0, 0, 16, 16, axj.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements gab {
      private final fby a;
      private final Supplier<hfo> b;
      private final List<ggi> c;

      private a(fby $$0, List<ggi> $$1, Supplier<hfo> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gab> a(flh $$0, fby $$1) {
         List<ggi> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            ggi $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dgd.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azg.a().a($$2.size())).a();
            Supplier<hfo> $$6 = $$0.an().a($$5);
            return Optional.of(new gaf.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fzz $$0) {
         $$0.a(new gae(this.c));
      }

      @Override
      public wo aS_() {
         return this.a.c();
      }

      @Override
      public void a(fob $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axj.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fpp.a($$0, this.b.get(), 2, 2, 12, axj.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
