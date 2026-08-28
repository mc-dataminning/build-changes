import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gdh implements gdc, gdd {
   private static final ale a = ale.b("spectator/teleport_to_team");
   private static final ww b = ww.c("spectatorMenu.team_teleport");
   private static final ww c = ww.c("spectatorMenu.team_teleport.prompt");
   private final List<gdd> d;

   public gdh() {
      fof $$0 = fof.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gdd> a(fof $$0, ffb $$1) {
      return $$1.g().stream().flatMap($$1x -> gdh.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gdd> a() {
      return this.d;
   }

   @Override
   public ww b() {
      return c;
   }

   @Override
   public void a(gdb $$0) {
      $$0.a(this);
   }

   @Override
   public ww aO_() {
      return b;
   }

   @Override
   public void a(frc $$0, float $$1, float $$2) {
      $$0.a(gpn::H, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements gdd {
      private final few a;
      private final Supplier<hja> b;
      private final List<gjp> c;

      private a(few $$0, List<gjp> $$1, Supplier<hja> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gdd> a(fof $$0, few $$1) {
         List<gjp> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gjp $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dim.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azt.a().a($$2.size())).a();
            Supplier<hja> $$6 = $$0.an().a($$5);
            return Optional.of(new gdh.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gdb $$0) {
         $$0.a(new gdg(this.c));
      }

      @Override
      public ww aO_() {
         return this.a.c();
      }

      @Override
      public void a(frc $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axu.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fsp.a($$0, this.b.get(), 2, 2, 12, axu.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
