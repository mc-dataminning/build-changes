import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gah implements gac, gad {
   private static final akv a = akv.b("spectator/teleport_to_team");
   private static final wp b = wp.c("spectatorMenu.team_teleport");
   private static final wp c = wp.c("spectatorMenu.team_teleport.prompt");
   private final List<gad> d;

   public gah() {
      fli $$0 = fli.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gad> a(fli $$0, fce $$1) {
      return $$1.g().stream().flatMap($$1x -> gah.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gad> a() {
      return this.d;
   }

   @Override
   public wp b() {
      return c;
   }

   @Override
   public void a(gab $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return b;
   }

   @Override
   public void a(fod $$0, float $$1, float $$2) {
      $$0.a(gmh::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements gad {
      private final fbz a;
      private final Supplier<hft> b;
      private final List<ggk> c;

      private a(fbz $$0, List<ggk> $$1, Supplier<hft> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gad> a(fli $$0, fbz $$1) {
         List<ggk> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            ggk $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dge.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azh.a().a($$2.size())).a();
            Supplier<hft> $$6 = $$0.an().a($$5);
            return Optional.of(new gah.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gab $$0) {
         $$0.a(new gag(this.c));
      }

      @Override
      public wp aS_() {
         return this.a.c();
      }

      @Override
      public void a(fod $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axk.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fpr.a($$0, this.b.get(), 2, 2, 12, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
