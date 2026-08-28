import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gai implements gad, gae {
   private static final akv a = akv.b("spectator/teleport_to_team");
   private static final wp b = wp.c("spectatorMenu.team_teleport");
   private static final wp c = wp.c("spectatorMenu.team_teleport.prompt");
   private final List<gae> d;

   public gai() {
      flj $$0 = flj.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gae> a(flj $$0, fcf $$1) {
      return $$1.g().stream().flatMap($$1x -> gai.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gae> a() {
      return this.d;
   }

   @Override
   public wp b() {
      return c;
   }

   @Override
   public void a(gac $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return b;
   }

   @Override
   public void a(foe $$0, float $$1, float $$2) {
      $$0.a(gmi::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements gae {
      private final fca a;
      private final Supplier<hfu> b;
      private final List<ggl> c;

      private a(fca $$0, List<ggl> $$1, Supplier<hfu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gae> a(flj $$0, fca $$1) {
         List<ggl> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            ggl $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dgf.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azh.a().a($$2.size())).a();
            Supplier<hfu> $$6 = $$0.an().a($$5);
            return Optional.of(new gai.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gac $$0) {
         $$0.a(new gah(this.c));
      }

      @Override
      public wp aS_() {
         return this.a.c();
      }

      @Override
      public void a(foe $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axk.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fps.a($$0, this.b.get(), 2, 2, 12, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
