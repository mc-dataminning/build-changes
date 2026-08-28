import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gaj implements gae, gaf {
   private static final akv a = akv.b("spectator/teleport_to_team");
   private static final wp b = wp.c("spectatorMenu.team_teleport");
   private static final wp c = wp.c("spectatorMenu.team_teleport.prompt");
   private final List<gaf> d;

   public gaj() {
      flk $$0 = flk.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gaf> a(flk $$0, fcg $$1) {
      return $$1.g().stream().flatMap($$1x -> gaj.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gaf> a() {
      return this.d;
   }

   @Override
   public wp b() {
      return c;
   }

   @Override
   public void a(gad $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return b;
   }

   @Override
   public void a(fof $$0, float $$1, float $$2) {
      $$0.a(gmj::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements gaf {
      private final fcb a;
      private final Supplier<hfv> b;
      private final List<ggm> c;

      private a(fcb $$0, List<ggm> $$1, Supplier<hfv> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gaf> a(flk $$0, fcb $$1) {
         List<ggm> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            ggm $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dgg.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azh.a().a($$2.size())).a();
            Supplier<hfv> $$6 = $$0.an().a($$5);
            return Optional.of(new gaj.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gad $$0) {
         $$0.a(new gai(this.c));
      }

      @Override
      public wp aS_() {
         return this.a.c();
      }

      @Override
      public void a(fof $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axk.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fpt.a($$0, this.b.get(), 2, 2, 12, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
