import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gbf implements gba, gbb {
   private static final aku a = aku.b("spectator/teleport_to_team");
   private static final wp b = wp.c("spectatorMenu.team_teleport");
   private static final wp c = wp.c("spectatorMenu.team_teleport.prompt");
   private final List<gbb> d;

   public gbf() {
      fmg $$0 = fmg.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gbb> a(fmg $$0, fdc $$1) {
      return $$1.g().stream().flatMap($$1x -> gbf.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gbb> a() {
      return this.d;
   }

   @Override
   public wp b() {
      return c;
   }

   @Override
   public void a(gaz $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return b;
   }

   @Override
   public void a(fpc $$0, float $$1, float $$2) {
      $$0.a(gnh::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements gbb {
      private final fcx a;
      private final Supplier<hgt> b;
      private final List<ghk> c;

      private a(fcx $$0, List<ghk> $$1, Supplier<hgt> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gbb> a(fmg $$0, fcx $$1) {
         List<ghk> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            ghk $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dgw.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azh.a().a($$2.size())).a();
            Supplier<hgt> $$6 = $$0.an().a($$5);
            return Optional.of(new gbf.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gaz $$0) {
         $$0.a(new gbe(this.c));
      }

      @Override
      public wp aS_() {
         return this.a.c();
      }

      @Override
      public void a(fpc $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axk.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fqp.a($$0, this.b.get(), 2, 2, 12, axk.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
